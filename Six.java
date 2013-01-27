//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class Six {
	public static void main(String[] args){
		int a = sumOfSquare(100);
		int b = squareOfSum(100);
		System.out.println(b-a);
	}
	
	public static int sumOfSquare(int n){
		int sum = 0;
		for(int i = n; i >= 1; i--)
			sum += Math.pow(i, 2);
		return (int)sum;
	}
	
	public static int squareOfSum(int n){
		int sum = 0;
		for(int i = n;i >= 1; i--)
			sum += i;
		return (int)Math.pow(sum, 2);
	}
}
