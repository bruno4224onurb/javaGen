package vectorsandmatrice;

import java.util.Scanner;

public class matrices1 {
	public static void main(String[] args) {
		System.out.println(
				"This algoritm receives the numbers of a 3x3 matrix and returns the\nmain and second row as well as the sum of their elements.");
		Scanner input = new Scanner(System.in);
		int mat[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Type the (" + (i + 1) + "," + (j + 1) + ") element of the matrix.");
				mat[i][j] = input.nextInt();
			}
		}
		int summain = mat[0][0] + mat[1][1] + mat[2][2], sumsecond = mat[0][2] + mat[1][1] + mat[2][0];
		System.out.println("Elements from the main row: " + mat[0][0] + "," + mat[1][1] + "," + mat[2][2] + ",");
		System.out.println("Elements from the secondary row: " + mat[0][2] + "," + mat[1][1] + "," + mat[2][0] + ",");
		System.out.println("Sum of the elements from the main row: " + summain);
		System.out.println("Sum of the elements from the secondary row: " + sumsecond);
		input.close();
	}
}
