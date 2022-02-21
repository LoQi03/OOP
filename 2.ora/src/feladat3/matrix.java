package feladat3;

import java.util.Scanner;

public record matrix() {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int matrix[][]= {{1,2,3},{4,5,6},{69,70,71}};
		printMatrix(matrix);
		System.out.println("Adj meg egy szamot");
		int num=read();
		if(IsContain(matrix,num)) {
			System.out.println("Benne van");
		}
		else
		{
			System.out.println("Nincs benne");
		}
		
		

	}
	 public static void printMatrix(int[][] matrix) {
	        for (int row = 0; row < matrix.length; row++) {
	            System.out.print("[");
	            for (int column = 0; column < matrix[row].length; column++) {
	                System.out.print(matrix[row][column]);
	                if (column < matrix[row].length - 1) {
	                    System.out.print(", ");
	                }
	            }
	            System.out.println("]");
	        }
	    }
	 public static boolean IsContain(int[][] matrix,int num) {
	        for (int row = 0; row < matrix.length; row++) {
	            for (int column = 0; column < matrix[row].length; column++) {
	                if(num==matrix[row][column])
	                {
	                	return true;
	                }
	            }
	        }
	        return false;
	    }
		public static int read()
		{
		int n = 0;
		while (!input.hasNextInt()) {
			System.out.println("Nem egy szam");
			input.next();
		}
			n = input.nextInt();
			input.nextLine();
			return n;
		}
}
