// Find the value of d  1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
import java.util.*;
import java.math.*;
public class Twenty_Six {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		int i = 2;
		System.out.println(isFiniteDecimal(i)+"   "+breakDown(i));
		*/
		
		//for(int denomitor = 1; denomitor < 1000; denomitor++){
			//System.out.println(denomitor+"   "+breakDown(denomitor) +"  "+isFiniteDecimal(denomitor));
			int length = godKnowsNameMethod(3);
			System.out.println(Math.pow(100, 100));
		//}
	}
	
	public static int godKnowsNameMethod(int n){
		int power = (n+"").length();
		
		BigInteger commonRatio = new BigInteger((int)(Math.pow(10, power) - n)+"") ;
		System.out.println(power +"  "+commonRatio+"\n");
		BigInteger sum = new BigInteger("1");
		for(int i = 1;i<10;i++){
			sum = sum.multiply(new BigInteger("10").pow(power*i));
			sum = sum.add((commonRatio.pow(power*i)));
			System.out.println(sum);
			int length = sum.toString().length();
			String num = sum.toString();
			if(length % 2 == 0){
				if(num.substring(0,length/2).equals(num.substring(length/2)))
					return length/2;
			}
		}
		return 312432411;
	}
	
	public static boolean isFiniteDecimal(int n){
		int i = breakDown(n);
		return i == 1;
	}
	
	public static int breakDown(int n){
		if(n%2!=0 && n%5!=0 && n%10!=0){
			return n;
		}else{
			if(n%10 == 0)
				return breakDown(n/10);
			else if(n%5 == 0)
				return breakDown(n/5);
			else
				return breakDown(n/2);
		}
	}
}
