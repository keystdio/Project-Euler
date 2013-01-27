/*
In England the currency is made up of pound,, and pence, p, and there are eight coins in general circulation:

1p, 2p, 5p, 10p, 20p, 50p, 1 (100p) and 2 (200p).
It is possible to make 2 in the following way:

11 + 150p + 220p + 15p + 12p + 31p
How many different ways can 2 be made using any number of coins?
*/
import java.util.*;
public class Thirty_One {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Solution> count = new TreeSet<Solution>();
		//count<String> count = new Linkedcount<String>();
		search(count,0,0,0,0,0,0,0,0,0);
		System.out.println(count);
	}
	
	private static void search(Set<Solution> count,int sum,int c1,int c2,int c5,int c10,int c20,int c50,int c100,int c200){
		if(sum == 200){
			Solution temp = new Solution(c1,c2,c5,c10,c20,c50,c100,c200);
			count.add(temp);
			
			System.out.println(temp.toString()+"  "+count.size());
		}
		else if(sum > 200)
			return;
		else{
			search(count,sum+1,c1+1,c2,c5,c10,c20,c50,c100,c200);
			search(count,sum+2,c1,c2+1,c5,c10,c20,c50,c100,c200);
			search(count,sum+5,c1,c2,c5+1,c10,c20,c50,c100,c200);
			search(count,sum+10,c1,c2,c5,c10+1,c20,c50,c100,c200);
			search(count,sum+20,c1,c2,c5,c10,c20+1,c50,c100,c200);
			search(count,sum+50,c1,c2,c5,c10,c20,c50+1,c100,c200);
			search(count,sum+100,c1,c2,c5,c10,c20,c50,c100+1,c200);
			search(count,sum+200,c1,c2,c5,c10,c20,c50,c100,c200+1);
		}		
	}
}
