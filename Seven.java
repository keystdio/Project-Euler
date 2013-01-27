// What is the 10 001st prime number?
public class Seven {
	public static void main(String[] args){
		int i = 2;
		int count = 1;
		while(true){
			if(isPrime(i)){
				System.out.println("#"+count+": "+i);
				count++;
			}
			i++;
			
			if(count == 10002)
				break;
		}
	}
	
	public static boolean isPrime(int n){
		for(int i = 2; i < n; i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
