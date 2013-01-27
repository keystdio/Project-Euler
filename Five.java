// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
import java.util.*;
public class Five {
	public static void main(String[] args){
		Queue<Integer> list = new LinkedList<Integer>();
		for(int i = 1; i <= 20; i++)
			list.add(i);
		int a = list.remove();
		int b = list.remove();
		int first = smallest(a, b);
		while(!list.isEmpty()){
			int next = list.remove();
			first = smallest(first, next);
		}
		System.out.println(first);
		
		//System.out.println(smallest(12,54));
	}
	
	public static int smallest(int a,int b){
		int gcd = GCD(a, b);
		int da = a / gcd;
		int db = b / gcd;
		return da*db*gcd;
	}
	
	public static int GCD(int a,int b){
		if(b == 0)
			return a;
		else
			return GCD(b, a%b);
	}
}
