import java.util.*;
public class Twenty_Eight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<Integer>();
		int offset = 8;
		int add = 1;
		int a = 1;
		for(int i = 1; i <= 1001; i+=2){
			list.add(a);
			a += 8*i;
		}
		System.out.println(list);
	}

}
