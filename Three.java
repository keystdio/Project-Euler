// What is the largest prime factor of the number 600851475143
import java.math.BigInteger;
import java.util.*;
public class Three {
	public static void main(String[] args){
		long number = 600851475143L;
		long i;
		for(i = 2; i < number; i++ ){
			if(number % i == 0){
				number /= i;
				i--;
			}
		
		}
		System.out.println(i);
		/*BigInteger goal = new BigInteger("600851475143");
		BigInteger curr = new BigInteger("1");
		BigInteger max = new BigInteger("1");
		BigInteger one = new BigInteger("1");
		BigInteger zero = new BigInteger("0");
		BigInteger checkPoint = goal.divide(BigInteger.valueOf(100000000));
		Stack<BigInteger> nums = new Stack<BigInteger>();
		while(curr.compareTo(goal) < 0){
			if(goal.mod(curr).compareTo(zero) == 0){
				System.out.println("analyzing number " + curr.toString());
				if(isPrime(curr))
					max = curr;
			}
			curr = curr.add(BigInteger.valueOf(1));  // not adding shit...
		}
		System.out.println(max);*/
	}
	
}
