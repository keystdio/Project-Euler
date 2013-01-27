// What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
import java.util.*;
public class Twenty_Four {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		Stack<String> q = new Stack<String>();
		//ObjectNumber num = new ObjectNumber("1");
		add(s,q,9);
		System.out.println(q.pop());
		/*for(int i = 1; i <= 2628800; i++)
			q.remove();
		System.out.println(q.remove());*/
	}
	
	private static void add(String s,Stack<String> q,int top){
		if(s.length() == 10){
			q.push(s);
		}
		else if(q.size() < 1000000){
			for(int i = 0; i <= 9; i++){
				if(s.contains(""+i))
					continue;
				add(s+i,q,top-1);
				System.out.println(s+"  "+q.size());
			}
		}
	}
}
