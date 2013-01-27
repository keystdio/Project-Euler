import java.util.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Solution> set = new TreeSet<Solution>();
		Solution s1 = new Solution(1,1,1,1,1,1,1,1);
		Solution s2 = new Solution(1,1,1,1,1,1,1,1);
		set.add(s1);
		set.add(s2);
		System.out.println(set);
	}
}
