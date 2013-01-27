// Find the sum of all the primes below two million.
public class Ten {
	public static void main(String[] args){
		long i = 5L;
		long sum = 5L;
		loop:while(i < 2000000){
			if(isOdd(i) && isPrime(i)){
				sum += i;
			}
			i++;
			System.out.println("dealing with "+i+" sum is "+sum);
			
		}
		System.out.println(sum);
	}
		
	public static boolean isPrime(long n){
		for(int i = 2; i < n; i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isOdd(long n){
		if(n % 2 == 0)
			return false;
		else
			return true;
	}
}
