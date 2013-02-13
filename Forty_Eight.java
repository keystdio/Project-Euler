// self-power
import java.math.*;
public class Forty_Eight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger sum = new BigInteger("0");
		for(int i=1; i<=1000; i++){
			sum = sum.add(new BigInteger(""+i).pow(i));
		}
		System.out.println(sum);
	}

}
