package vectorsandmatrice;

import java.util.Scanner;

public class vectors1 {
public static void main(String[] args) {
	System.out.println("This algoritm has a set vector and returns if there is\na number on it and it's index.");
	Scanner input = new Scanner(System.in);
	int vec[] = {2,5,1,3,4,9,7,8,10,6};
	System.out.println("Type the number you want to find:");
	int n = input.nextInt();
	int index = -2;
	for (int i = 0; i< vec.length; i++) {
		if(n == vec[i]) {
			index = i;
			break;
		}else {
			continue;
		}
	}
	if(index !=-2) {
	System.out.println("The number "+n+" has been found and it is on the "+index+" position");
	}
	else {
		System.out.println("The number "+n+" wasn't found");
	}
	input.close();
}
}
