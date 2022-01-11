import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your full name?");
		String b = sc.nextLine();
		int a = b.indexOf(" ");
		int c = b.length();
		System.out.println("Your last name is: " + b.substring(a+1,c));


		
	}
}
