//Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
//use doubles
//5537376230390876637302048746832985971773659831892672
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;
public class Thirteen {
	public static void main(String[] args){
		try {
			Scanner input = new Scanner(new File("13.txt"));
			double sum = 0;
			while(input.hasNextLine()){
				String line = input.nextLine();
				String whole = ""+line.charAt(0);
				String rest = line.substring(1);
				double num = Double.parseDouble(whole+"."+rest);
				sum += num;
			}
			
			/*BigInteger sum = new BigInteger("0");
			for(int i = 1;i <= 100; i++){
				//System.out.println(new BigInteger(input.nextLine()));
				sum = sum.add(new BigInteger(input.nextLine()));
			}*/
			System.out.println(sum);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
