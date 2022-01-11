import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static Random rand = new Random();
	public static int[] toStringArray(int [] a){
		int c = 0;
		int [] b = a;
		while (c<b.length){
			b[c] = rand.nextInt(100);
			System.out.println(b[c]);
			c++;
		}
		return b;
	}
	
	public static int[] getArrayMin(int []a){
		int [] b =a;
		int c = 0;
		int min = 100;
		while (c<b.length){
			if(b[c]<min){
				min = b[c];
			}
		}
		return b;
	}
	public static int[] getArrayMax(int []a){
		int []b = a;
		int c = 0;
		int max = 0;
		while(c<b.length){
			if(b[c]>max){
				max = b[c];
			}
		}
		return b;
	}
	public static int[] getArrayAvg(int []a){
		int[]b = a;
		int c = 0;
		int avg = 0;
		for(int r=0; r <b.length; r++){
			c = c + b[r];
			avg = c / b.length;
		}
		return b;
	}
	public static void main(String args[]) {
		int [] x = new int [100];
		int [] y = toStringArray(x);
		int [] z = getArrayMin(x);
		int [] g = getArrayMax(x);
		int [] f = getArrayAvg(x);
		System.out.println("Your minimum value is: " + z);
		System.out.println("Your maximum value is: " + g);
		System.out.println("Your average value is: " + f);
		

		
	}

}