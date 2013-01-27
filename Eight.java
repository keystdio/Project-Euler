// Find the greatest product of five consecutive digits in the 1000-digit number.
import java.util.*;
import java.io.*;
public class Eight {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("eight.txt"));
		String s = input.nextLine();
		String[] arr = s.split("|");
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i < arr.length; i++)
			list.add(Integer.parseInt(arr[i]));
		//System.out.println(list);
		int max = list.get(0)*list.get(1)*list.get(2)*list.get(3)*list.get(4);
		
		for(int i = 5; i < list.size()-5; i++){
			int next = list.get(i)*list.get(i+1)*list.get(i+2)*list.get(i+3)*list.get(i+4);
			if(next > max)
				max = next;

		}
		System.out.println(max);
	}
}
