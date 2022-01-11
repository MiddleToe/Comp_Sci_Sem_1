import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	myCharacter robert = new myCharacter();
	System.out.println("Your role is " +robert.role);
	System.out.println("Your intelligence is " + robert.intel);
	System.out.println("Your dexterity is " + robert.dex);
	System.out.println("Your constitution is " + robert.con);
	System.out.println("Your charisma is " + robert.cha);
	System.out.println("Your strength is " + robert.str);
	System.out.println("What role would you like to be?");
	String a = sc.nextLine();
	myCharacter alex = new myCharacter();
	alex.myCharacter(a);
	System.out.println("Your intelligence is " + alex.intel);
	System.out.println("Your dexterity is " + alex.dex);
	System.out.println("Your constitution is " + alex.con);
	System.out.println("Your charisma is " + alex.cha);
	System.out.println("Your strength is " + alex.str);
	}
	}
