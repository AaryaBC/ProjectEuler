/*THIS PROJECT, I START WITH 1 AS MY POSITION RATHER THAN 0 DUE TO A SMALL ERROR THAT I CAN'T FIGURE OUT. WHEN I READ FROM THE FILE, IT IS AUTOMATICALLY LEAVING ONE WHOLE LINE IN ARRAY AS BLANK. IF SOMEONE KNOWS WHAT I'M DOING WRONG, PLEASE DROP AN EMAIL AT aaryabc49@gmail.com */

import java.io.*;
import java.util.Scanner;

public class ProjectEuler11{

	public int[][] numberList() throws IOException{
		int[][] grid = new int[21][20];
		int i = 0;
		int j = 0;
		Scanner scanner = new Scanner(new File("infile.txt"));
		while (scanner.hasNextInt()){
			if (j % 20 == 0){
				i += 1;
				j = 0;
			}
			grid[i][j] = scanner.nextInt();
			j += 1;
		}
		return grid;
	}
	
	public static void main(String[] args) throws IOException{
		ProjectEuler11 call = new ProjectEuler11();
		long max = 0, product = 0;
		int[][] grid = call.numberList();
		
		for (int i = 1; i < 21; i++){																		//for horizontal line
			for (int j = 0; j < 17; j++){
				product = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
				if (product > max)
					max = product;
			}
		}
		
		for (int j = 0; j < 20; j++){																		//for vertical line
			for (int i = 1; i < 18; i ++){
				product = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
				if (product > max)
					max = product;
			}
		}

		for (int i = 1; i < 18; i++){																		//for positive direction diagonal
			for (int j = 0; j < 17; j++){
				product = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
				if (product > max)
					max = product;
			}
		}

		for (int i = 1; i < 18; i++){																		//for negative direction diagonal
			for (int j = 19; j > 2; j--){
				product = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
				if (product > max)
					max = product;
			}
		}

		System.out.println(max);
	}
}