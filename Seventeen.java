// If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
import java.util.*;
public class Seventeen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int letters = 0;
		int sum = 0;	
		Map<Long,Integer> map = new HashMap<Long,Integer>();
		
		for(ObjectNumber number = new ObjectNumber("1"); number.getValue() <= 1000; number.add(1)){
			List<Integer> list = number.tear();
			if(list.size() == 1){
				letters = ifOne(list.get(0));
				System.out.println(list+"  "+letters+"  "+sum+"  "+number);
			}else if(list.size() == 2){
				letters = ifTwo(list.get(0),list.get(1));
				System.out.println(list+"  "+letters+"  "+sum+"  "+number);
			}else if(list.size() == 3){
				letters = ifThree(list.get(0),list.get(1),list.get(2)) ;
				System.out.println(list+"  "+letters+"  "+sum+"  "+number);
			}else if(list.size() == 4){
				letters = ifFour(list.get(0),list.get(1),list.get(2),list.get(3));
				System.out.println(list+"  "+letters+"  "+sum+"  "+number);
			}
			sum += letters;
		}
		System.out.println(sum);
	}
	
	public static int ifOne(int n){
		if(n==1 || n==2 || n==6)
			return 3;
		else if(n==3 || n==7 || n==8)
			return 5;
		else if(n==4 || n==5 || n==9)
			return 4;
		else
			return 0;
	}

	public static int ifTwo(int a,int b){
		if(a > 1){
			int whole = ifOne(b);	
			int ten = 0;
			if(a==2 || a==3 || a==8 || a==9)
				ten = 6; // twenty,thirty,eighty,ninety
			else if(a==4 || a==5 || a==6)
				ten = 5; // forty,fifty,sixty
			else if(a==7)
				ten = 7; // seventy
			
			return whole+ten;
		}else if(a == 1){
			if(b == 0)
				return 3; // ten
			else if(b==1 || b==2)
				return 6; // eleven,twelve
			else if(b==3 || b==4 || b==8 || b==9)
				return 8; //thirteen,fourteen,eighteen,nineteen
			else if(b==5|| b==6)
				return 7; //fifteen,sixteen
			else 
				return 9; //seventeen
		}else{
			return ifOne(b);
		}
	}

	public static int ifThree(int a,int b,int c){
		if(a == 0)
			return ifTwo(b,c);
		else{
			int hundred = 0;
			if(a!=0 && b==0 && c==0)
				hundred = ifOne(a) + 7;  // plus "hundred"
			else
				hundred = ifOne(a) + 10; // plus "hundred and"  !!!!!!!!
			return hundred+ifTwo(b,c);
		}
	}

	public static int ifFour(int a,int b,int c,int d){
		if(a == 0)
			return ifThree(b,c,d);
		else{
			int thousand = 0;
			if(a!=0)		
				thousand = ifOne(a) + 8;
			return thousand+ifThree(b,c,d);
		}
	}
}
