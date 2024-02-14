package vectorsandmatrice;

import java.util.Scanner;

public class vectors2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vec[] = new int[10];
		for(int i=0; i<9;i++) {
			System.out.println("Type the"+(i+1)+"number of the vector");
			vec[i] = input.nextInt(); 
		}
		System.out.println("Type the number you want to find");
	}
}
