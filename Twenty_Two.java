import java.util.*;
import java.io.*;
public class Twenty_Two {
// A - 65(ascii value) (-64)  18 13 1 25
	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("twenty_two"));
		String line = input.nextLine();
		String[] names = line.split(",");
		Arrays.sort(names);
		int sum = 0;
		for(int i = 0; i < names.length; i++){
			String name = names[i].substring(1,names[i].length()-1);
			System.out.println("current name: "+name+" current sum: "+sum+" current count: "+i);
			sum += ((i+1)*score(name));
		}
		System.out.println(sum);
	}
	
	public static int score(String name){
		int end = 0;
		for(int i = 0; i < name.length(); i++){
			end += (int)name.charAt(i) - 64;
		}
		return end;
	}

}
