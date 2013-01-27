// What is the first term in the Fibonacci sequence to contain 1000 digits?
import java.math.BigInteger;
public class Twenty_Five {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger("1");
		BigInteger b = a;
		int terms = 2;
		while(a.toString().length() != 1000){
			BigInteger temp = a;
			a = a.add(b);
			b = temp;
			terms++;
		}
		System.out.println(terms);
	}

}
