//Find the largest palindrome made from the product of two 3-digit numbers.
import java.util.*;
public class Four {
	public static void main(String[] args){
		Queue<Integer> list = new PriorityQueue<Integer>();
		Stack<Integer> s = new Stack<Integer>();
		int a = 100,b = 100;
		while(a <= 999){
			while(b <= 999){
				list.add(a * b);
				b++;
			}
			a++;
			b=100;
		}
		System.out.println("Sorting....");
		while(!list.isEmpty())
			s.push(list.remove());
		System.out.println("Start analyzing....");
		int result = 0;
		loop:while(!s.isEmpty()){
			int n = s.pop();
			if(is(n)){
				result = n;
				break loop;
			}
		}
		System.out.println(result);
	}
	
	public static boolean is(int n){
		String s = ""+n;
		String reversed = reverse(s);
		return s.equals(reversed);
	}
	
	public static String reverse(String s){
		String result = "";
		for(int i = s.length()-1; i >= 0; i--){
			result+=s.charAt(i);
		}
		return result;
	}
}
