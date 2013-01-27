// What is the sum of the digits of the number 2^1000?  Combined with eighteen
import java.math.BigInteger;
import java.util.*;
public class Sixteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger big = new BigInteger("100");
		for(int i = 99; i >= 1; i--){
			BigInteger curr = new BigInteger(""+i);
			big = big.multiply(curr);
			System.out.println(big);
		}
		String s = big.toString();
		ObjectNumber num = new ObjectNumber(s);
		List<Integer> digits = num.tear();
		int sum = 0;
		for(int n:digits)
			sum += n;
		System.out.println(sum);
	}

}
