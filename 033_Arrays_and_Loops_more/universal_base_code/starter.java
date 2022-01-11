import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] a = new int [150];
		int min = 150;
		int max = 0;
		int avg = 0;
		int c = 0;
		while(c<a.length){
			a[c]=rand.nextInt(150+1);
			System.out.println(a[c]);
			c++;
		}
		c=0;
		while(c<a.length){
			if(a[c]<min){
				min = a[c];
			}
			if(a[c]>max){
				max = a[c];
			}
			
			c++;
		}
		
		for(int r=0; r <a.length; r++){
			c = c + a[r];
			avg = c / a.length;
		}
		

	System.out.println("Your minimum is: " + min);
	System.out.println("Your maximum is: " + max);
	System.out.println("Your average is: " + avg);
	}
}
