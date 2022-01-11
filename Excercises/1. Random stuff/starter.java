import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {

	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		
	while (true){
		System.out.println("Welcome to the Bank for degenerate gamblers! What would you like to do today?");
		System.out.println("You can open a new account or check your current account.");
		System.out.println("Type o to open a new account or c to check your current account.");
		String a = sc.nextLine();
		
		if(a.equals("o")||a.equals("O")){
			account c = new account();
			System.out.println("You have chosen to open a new account. Please give your name.");
			String b = sc.nextLine();
			c.setName(b);
			System.out.println("Would you like to add some money to your new account?");
			String d = sc.nextLine();
			if(d.equals("yes")||d.equals("Yes")){
				System.out.println("How much would you like to add?");
				double e = sc.nextDouble();
				c.addMoney(e);
				c.printDetails();
			}
			else if(d.equals("no")||d.equals("No")){
				System.out.println("You will now be returned to the beginning. Thanks for visiting!");
				continue;
			}
		}
	}
	
		
		
	}
}
	
