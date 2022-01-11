import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	Mult funct = new Mult();
	System.out.println("Input an integer");
	int a = sc.nextInt();
	System.out.println("Input another integer");
	int b = sc.nextInt();
	System.out.println(funct.multiply(a, b));
	}
	
	
	
}
	

