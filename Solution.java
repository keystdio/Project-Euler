
public class Solution implements Comparable<Solution>{
	private int count1;
	private int count2;
	private int count5;
	private int count10;
	private int count20;
	private int count50;
	private int count100;
	private int count200;
	
	public boolean equals(Solution other){
		if(count1==other.count1 && count2==other.count2 && count5==other.count5 && count10==other.count10 && count20==other.count20 && count50==other.count50 && count100==other.count100 && count200 == other.count200)
			return true;
		else
			return false;
	}
	
	public int compareTo(Solution other){
		if(count1==other.count1 && count2==other.count2 && count10==other.count10 && count20==other.count20 && count50==other.count50 && count100==other.count100 && count200 == other.count200)
			return 0;
		else
			return -1;
	}
	
	public String toString(){
		return "["+count1+", "+count2+", "+count10+", "+count20+", "+count50+", "+count100+", "+count200+"]";
	}
	
	public Solution(int c1,int c2,int c5,int c10,int c20,int c50,int c100,int c200){
		count1 = c1;
		count2 = c2;
		count5 = c5;
		count10 = c10;
		count20 = c20;
		count50 = c50;
		count100 = c100;
		count200 = c200;
	}
	
	public void add(int n){
		if(n==1)
			count1++;
		else if(n==2)
			count2++;
		else if(n==10)
			count10++;
		else if(n==20)
			count20++;
		else if(n==50)
			count50++;
		else if(n==100)
			count100++;
		else if(n==200)
			count200++;
		
	}
}
