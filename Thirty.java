//Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
import java.util.*;
public class Thirty {
	public static void main(String[] args){
		List<Integer> list = new LinkedList<Integer>();
		for(int i = 2;i<10000000;i++){
			if(isFifthPower(i))
				list.add(i);
			System.out.println(i);
		}
		System.out.println(list);
	}
	
	public static boolean isFifthPower(int n){
		String s = n+"";
		int sum = 0;
		for(int i = 0;i < s.length(); i++){
			sum += Math.pow(Integer.parseInt(s.substring(i,i+1)),5);
		}
		return sum == n;
	}
}
