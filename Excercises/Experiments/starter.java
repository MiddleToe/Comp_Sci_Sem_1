import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	private static boolean test;
	private static int[] group;
	
	
	public static void main(String args[]) {
		test = false;	
		group = new int[10];
		int c = 0;
		while(test==false){
			tomato();
			potato();
			c++;
		}
			chicken();
		System.out.println("it took : " + c);
		
	}
	
	public static void tomato(){
		int c = 0;
		Random rand = new Random();
		while(c<group.length){
			group[c] = rand.nextInt(50)+ 1;
			c=c+ 1;
		}
	}
	public static void potato(){
		int d = 0;
		while(d<group.length-1){
			if(group[d]==group[d+ 1]){
				test = true;
				break;
			}
			d++;
		}
	}
	public static void chicken(){
		int e = 0;
		while(e<group.length){
			System.out.print(group[e] + " ");
			e++;
		}
	}
}
	
