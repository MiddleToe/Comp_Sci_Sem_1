import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Choose your class: Wizard, Warrior, Rogue");
	String role = sc.nextLine();
	String w = new String("Wizard");
	String A = new String("Warrior");
	String R = new String("Rogue");
	if(role.equals("Wizard")){
	System.out.println("Your role has been chosen as Wizard");
	}
	else if(role.equals("wizard")){
	System.out.println("Your role has been chosen as Wizard");
	}
	else if (role.equals("Warrior")){
	System.out.println("Your role has been chose as Warrior");
	}
	else if (role.equals("warrior")){
	System.out.println("Your role has been chose as Warrior");
	}
	else if (role.equals("Rogue")){
	System.out.println("Your role has been chosen as Rogue");
	}
	else if (role.equals("rogue")){
	System.out.println("Your role has been chosen as Rogue");
	}
	else{
	System.out.println("Error! Your role does not exist");
	}
	
}
}
