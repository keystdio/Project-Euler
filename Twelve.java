// What is the value of the first triangle number to have over five hundred divisors?
// check only to square root!!! Mirror answers on both sides.
public class Twelve {
	public static final int DIVISOR_LIMIT = 500;
	
	public static void main(String[] args){
		long curr = 0;
		long add = 1;
		int n = 1;
		while(true){
			curr += add;
			add++;
			int count = findDivisor(curr);
			if(count-1 > DIVISOR_LIMIT){
				System.out.println(curr+" "+(count-1));
				break;
			}else
				System.out.println(curr+" "+(count-1));
		}
		//System.out.println(curr);
	}
	public static int findDivisor(long n){
		int i = 1;
		int count = 0;
		while(i <= Math.sqrt(n)){
			if(n % i ==0)
				count += 2;
			if(i == (int)(Math.sqrt(n) * Math.sqrt(n)))
				count--;
			i++;
		}
		return count;
	}
}
// 76576500
