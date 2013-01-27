import java.util.*;
public class Fourteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Integer> list = new HashSet<Integer>();
		Map<Long,Long> map = new HashMap<Long,Long>();
		long number = 1;
		long max = 0;
		while(number <= 1000000){
			long temp = length(number);
			if(temp > max){
				max = temp;
				map.clear();
				map.put(number, temp);
			}
			number++;
			System.out.println("Looking at number "+number+" Current max= "+max);
		}


		System.out.println(map);
	}

	public static long length(long number){
		long count = 1;
		while(number != 1){
			if(number % 2 != 0)
				number = 3*number + 1;
			else
				number = number / 2;
			count++;
		}
		return count;
	}


}
