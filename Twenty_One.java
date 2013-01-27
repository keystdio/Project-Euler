import java.util.Arrays;
import java.util.*;
//Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
//If d(a) = b and d(b) = a, where a  b, then a and b are an amicable pair and each of a and b are called amicable numbers.
//For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
//Evaluate the sum of all the amicable numbers under 10000.

public class Twenty_One {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10000; i++){
			if(isamical(i)){
				System.out.print(i+" ");
				sum += i;
			}
		}
		System.out.println("\n"+sum);
	}
	
	public static boolean isamical(int i){
		int temp = d(i);
		//System.out.println(i+"  "+temp);
		return  i!=temp && i==d(temp);
	}
	
	public static int d(int n){
		int sum = 0;
		int i = 1;
		while(i < n){
			if(n % i == 0)
				sum += i;
			i++;
		}
		return sum;
	}
}
