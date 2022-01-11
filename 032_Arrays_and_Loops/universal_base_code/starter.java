import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int[] a = new int [1000]; 
		int b = 0;
		while(b<a.length){
			a[b] =rand.nextInt(10+1);
			System.out.println(a[b]);
			b++;
		}


		
	}
}
