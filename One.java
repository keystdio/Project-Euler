// Find the sum of all the multiples of 3 or 5 below 1000.
// There will be duplicates of multiples of (3 and 5) if calculated separtely
import java.util.*;
public class One {
	public static void main(String[] args){
		List<Integer> three = new LinkedList<Integer>();
		List<Integer> five = new LinkedList<Integer>();
		List<Integer> all = new LinkedList<Integer>();
		int i = 1;
		int result = 0;
		while(i < 1000){
			if(i % 3 == 0 || i % 5 == 0){
				result+=i;
				all.add(i);
			}
			i++;
		}
		i = 1;
		while(3*i < 1000){
			three.add(3*i);
			i++;
		}
		
		i = 1;
		while(5*i < 1000){
			five.add(5*i);
			i++;
		}
		int alt = 0;
		/*
		for(int n:three)
			alt += n;
		for(int n:five)
			alt += n;
		*/
		for(int n:all)
			alt += n;
		System.out.println(three);
		System.out.println(five);
		System.out.println(all);
		System.out.println(result + "  "+ alt);
	}
	

}
