import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	Random rand=new Random();
	int balance = 100;
	while(true){
	System.out.println("Would you like to play?");
	String a = sc.nextLine();
	if(a.equals("yes")||a.equals("Yes")||a.equals("Y")||a.equals("y")){
	System.out.println("COngrats! You've chosen to play the game.");
	System.out.println("How much money would you like to wager? You have " + balance + " dollars.");
	int b = sc.nextInt();
	sc.nextLine();
		if(balance - b >= 0){
		int num1 = rand.nextInt(51);
		int num2 = rand.nextInt(51);
		int num3 = rand.nextInt(51);
		System.out.println("Your numbers are " + num1 + " "+ num2 + " "+ num3);
		if(num1 == num2 && num2 == num1 && num3==num1){
		System.out.println("You've tripled your wager! Congrats!");
		balance = balance + b*3; 
		System.out.println("Your balance is now " +balance + ".");
		} else if ( num1 == num2 || num2 == num3 || num3 == num1) {
			System.out.println("You've doubled your wager! Congrats!"); 
			balance = balance + b*2; 
			System.out.println("Your balance is now " + balance + ".");
		} else 
			System.out.println("You lost ur money..."); 
			balance = balance - b; 
			System.out.println("Your balance is now " + balance + ".");
		}
	}
	else if(a.equals("no")||a.equals("No")||a.equals("N")||a.equals("n")){
	System.out.println("Start over if you want to gamble your life savings away.");
	}
	else{
		System.out.println("Wrong answer");
	}
	}
	}
	
}
