import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {

	public static void main(String args[]) {
		int [] x = new int [51];
		int [] a = x;
		int c = 0;
		int r = 20;
		Random rand = new Random();
		
		System.out.println("Your numbers:");
		while (c<21){
			x[c]=rand.nextInt(50)+1;
			System.out.println(x[c] + " ");
			c++;
		}
		System.out.println("The numbers in reverse:");
		while (r>=0){
			System.out.println(a[r]);
			r--;
		}
	
	
	
	
	
	
	
	//	while (r>=0){
	//		System.out.println(x[r]);
	//		r--;
	//	}

	}
}
	
