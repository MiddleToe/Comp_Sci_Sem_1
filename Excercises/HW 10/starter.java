import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {

	public static void main(String args[]) {
		Random rand = new Random();
		int [] x = new int [20];
		int c = 0;
		int a = 0;
		int k = 0;
		int r = rand.nextInt(10)+ 1;

		System.out.println("The target number is: " + r);
		
		while(c < x.length){
			x[c]=rand.nextInt(10) + 1;
			System.out.println(x[c]);
			if(x[c]==r){
				a++;
				System.out.println("The duplicate number has been printed " + a + " times.");
			}
			c++;
		}
		
		while(k<x.length - 1){
			if(x[k]==x[k + 1]){
				int v = k + 1;
				int y = v + 1;
				System.out.println("The number " + x[k] + " is consecutive at position " + v + " and " + y + " in the array");
			}
			k++;			
		}
		
	
	}
}
	