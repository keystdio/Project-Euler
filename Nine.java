//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
public class Nine {
	public static void main(String[] args){
		int a = 1;
		int b = 1;
		int c = 1;
		while(a <= 1000){
			while(b <= 1000){
				while(c <= 1000){
					if(a+b+c == 1000 && Math.pow(a, 2)+Math.pow(b, 2) == Math.pow(c, 2)){
						System.out.println(a +" "+b+" "+c);
						System.out.println(a*b*c);
					}
					c++;
					//System.out.println("analyzing c" + c);
				}
				c = 1;
				b++;
				//System.out.println("analyzing b" + b);
			}
			b = 1;
			a++;
			//System.out.println("analyzing a" + a);
		}
	}
}
