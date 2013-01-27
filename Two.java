// By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
import java.util.*;
public class Two {
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		int temp = 0;
		List<Integer> fib = new LinkedList<Integer>();
		fib.add(a);
		while(b < 4000000){
			fib.add(b);
			temp = a + b;
			a = b;
			b = temp;
		}
		int sum = 0;
		for(int n:fib){
			if(n % 2 == 0)
				sum+=n;
		}
		System.out.println(sum);
	}
}
