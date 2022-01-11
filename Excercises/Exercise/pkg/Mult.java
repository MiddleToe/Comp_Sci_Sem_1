package pkg;
import java.util.Scanner;
import java.util.Random;


public class Mult {
	public int y;
	public int z;
	
	public Mult(){
		y=0;
		z=0;
	}
	
	public int multiply(int a, int b){
		y=a;
		z=b;
		int f = y*z;
		if(f%3==0){
			System.out.println("number is divisible by 3"); 
		return f;
		}
		else{
			System.out.println("Bad");
			return f;
		}
	}

}