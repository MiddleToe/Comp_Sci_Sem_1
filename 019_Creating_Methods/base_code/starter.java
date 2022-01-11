import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String z){
	System.out.println(z);
	return;
	}
	public static void toStringCombined(String a, String b){
	System.out.println(a + " " + b);
	return;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a word");
	String r = sc.nextLine();
	toString(r);
	System.out.println("Input another word");
	String u = sc.nextLine();
	System.out.println("Input one more word");
	String g = sc.nextLine();
	toStringCombined(u,g);

		
	}
}
