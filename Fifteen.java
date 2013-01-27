import java.util.*;
public class Fifteen {

	/**
	 * @param args
	 */
	/*
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		long num = search(0,0,0);
		System.out.println(num);
	}
	
	public static long search(long a,long b,long i){
		if(b==20 || a==20)
			return 1;
		else{
			System.out.println("Current cordinates: "+a+","+b+"  Depth: "+i);
			return search(a,b+1,i+1) + search(a+1,b,i+1);
		}
	}*/
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		String s = "";
		//long count = 0;
		//String count = "0";
	    ObjectNumber count = new ObjectNumber("0");
		search(x,y,count,s);
		System.out.println(count);
	}
	
	public static void search(int x,int y,ObjectNumber count,String s){
		if(x > 20 || y > 20)
			return;
		else if(x == 20 && y == 20){
			System.out.println("find one: "+s+ " Current size: "+count);
			count.add(1);
		}
		else{
			search(x+1,y,count,s+"r");
			search(x,y+1,count,s+"d");
		}
	}
}
