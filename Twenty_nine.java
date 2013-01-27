import java.util.*;
public class Twenty_nine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Double> set = new HashSet<Double>();
		for(int a = 2; a <= 100; a++){
			for(int b = 2; b <= 100; b++){
				set.add(Math.pow(a, b));
				System.out.println(Math.pow(a, b));
			}
		}
		System.out.println(set.size());
	}
}
