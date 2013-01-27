import java.util.*;
public class Twenty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long target = factorial(20);
		ObjectNumber num = new ObjectNumber(""+target);
		List<Integer> list = num.tear();
		int sum = 0;
		for(int n: list)
			sum += n;
		System.out.println(sum+" "+target);
	}
	
	private static long factorial(int n){
		/*
		long pro = 1;
		int i = n;
		while(n >= 1){
			pro *= i;
			i--;
		}
		return pro;*/
		
		if(n == 1)
			return 1;
		else
			return n * factorial(n-1);
		
	}

}
