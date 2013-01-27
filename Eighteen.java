import java.util.*;
import java.io.*;
public class Eighteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int[][] numbers = new int[15][];
		for(int i = 0;i < 15; i++)
			numbers[i] = new int[i+1];

		Scanner input = new Scanner(new File("Eighteen"));
		int it = 0;
		while(input.hasNextLine()){

			String line = input.nextLine();
			Scanner lineScan = new Scanner(line);
			while(lineScan.hasNextInt()){
				for(int j = 0; j < numbers[it].length; j++)
					numbers[it][j] = lineScan.nextInt();
			}
			it++;
		}
		//System.out.println(numbers.length);
		display(numbers);
		ObjectNumber max = new ObjectNumber("0");
		ObjectNumber count = new ObjectNumber("0");
		search(numbers,0,0,numbers[0][0],max,count);
	}

	private static void search(int[][] nums,int x,int y,int curr,ObjectNumber max,ObjectNumber count){
		if(x == 14){
			if(max.compareTo(curr) < 0)
				max.setValue(curr+"");
			count.add(1);
			System.out.println("curr is: "+curr+" max is: "+max+" count is: "+count);
		}else {
			search(nums,x+1,y+1,curr+nums[x+1][y+1],max,count);
			search(nums,x+1,y,curr+nums[x+1][y],max,count);
		}
	}

	private static void display(int[][] numbers){
		for(int i = 0; i < 15; i++){
			for(int j = 0; j < numbers[i].length; j++)
				System.out.printf("%3d",numbers[i][j]);
			System.out.println();
		}
	}
}
