import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Eleven {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int max = 0;
		Scanner input = new Scanner(new File("eleven"));
		int[][] grid = new int[20][20];
		int i = 0;
		int j = 0;
		while(input.hasNextLine()){
			String line = input.nextLine();
			Scanner lineScan = new Scanner(line);
			while(lineScan.hasNext()){
				grid[i][j] = lineScan.nextInt();
				j++;
			}
			j = 0;
			i++;
		}
		/*
		for(int k=0;k<20;k++){
			for(int l=0;l<20;l++)
				System.out.printf("%3d",grid[k][l]);
			System.out.println();
		}*/
		
		for(int k = 0; k < 20; k++){
			for(int l = 0; l < 20; l++){
				if(k >= 3 && l >= 3 && k <= 16 && l<=16){
					max = up(max,k,l,grid);
					max = down(max,k,l,grid);
					max = left(max,k,l,grid);
					max = right(max,k,l,grid);
					max = diagLeftUp(max,k,l,grid);
					max = diagLeftDown(max,k,l,grid);
					max = diagRightUp(max,k,l,grid);
					max = diagRightDown(max,k,l,grid);
				}else if(k >= 0 && k <= 2 && l >= 0 && l <= 2){
					max = down(max,k,l,grid);
					max = right(max,k,l,grid);
					max = diagRightDown(max,k,l,grid);
				}else if(k >= 17 && k <= 19 && l >= 0 && l <= 2){
					max = down(max,k,l,grid);
					max = left(max,k,l,grid);
					max = diagLeftDown(max,k,l,grid);
				}else if(k >= 17 && k <= 19 && l >= 17 && l >= 19){
					max = up(max,k,l,grid);
					max = left(max,k,l,grid);
					max = diagLeftUp(max,k,l,grid);
				}else if(k >= 0 && k <= 2 && l >= 17 && l <= 19){
					max = up(max,k,l,grid);
					max = right(max,k,l,grid);
					max = diagRightUp(max,k,l,grid);
				}else if((k>=3&&k<=16&&l>=0&&l<=3) ){
					max = left(max,k,l,grid);
					max = right(max,k,l,grid);
					max = diagRightDown(max,k,l,grid);
					max = diagLeftDown(max,k,l,grid);
				}else if((k>=3&&k<=16&&l>=17&&l<=20)){
					max = left(max,k,l,grid);
					max = right(max,k,l,grid);
					max = diagRightUp(max,k,l,grid);
					max = diagLeftUp(max,k,l,grid);
				}
			}
		}
		System.out.println(max);
	}
	
	public static int up(int max,int k,int l,int[][] grid){
		int product = grid[k][l]*grid[k][l-1]*grid[k][l-2]*grid[k][l-3];
		if(product > max)
			return product;
		else
			return max;
	}
	
	public static int down(int max,int k,int l,int[][] grid){
		int product = grid[k][l]*grid[k][l+1]*grid[k][l+2]*grid[k][l+3];
		if(product > max)
			return product;
		else
			return max;
	}
	public static int left(int max,int k,int l,int[][] grid){
		int product = grid[k][l]*grid[k-1][l]*grid[k-2][l]*grid[k-3][l];
		if(product > max)
			return product;
		else
			return max;
	}
	public static int right(int max,int k,int l,int[][] grid){
		int product = grid[k][l]*grid[k+1][l]*grid[k+2][l]*grid[k+3][l];
		if(product > max)
			return product;
		else
			return max;
	}
	public static int diagLeftUp(int max,int k,int l,int[][] grid){
		int product = grid[k][l]*grid[k-1][l-1]*grid[k-2][l-2]*grid[k-3][l-3];
		if(product > max)
			return product;
		else
			return max;
	}
	
	public static int diagRightDown(int max,int k,int l,int[][] grid){
		int product = grid[k][l]*grid[k+1][l+1]*grid[k+2][l+2]*grid[k+3][l+3];
		if(product > max)
			return product;
		else
			return max;
	}
	
	public static int diagLeftDown(int max,int k,int l,int[][] grid){
		int product = grid[k][l]*grid[k-1][l+1]*grid[k-2][l+2]*grid[k-3][l+3];
		if(product > max)
			return product;
		else
			return max;

	}
	
	public static int diagRightUp(int max,int k,int l,int[][] grid){
		int product = grid[k][l]*grid[k+1][l-1]*grid[k+2][l-2]*grid[k+3][l-3];
		if(product > max)
			return product;
		else
			return max;

	}

}
