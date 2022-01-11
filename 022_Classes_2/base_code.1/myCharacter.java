import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Character {
	String role = new String("Rogue");

}

class starter {
	public static void main(String args[]) {
	BaseClass test = new BaseClass();
	int strength=5;
	int constitution=4;
	int dexterity=6;
	int intelligence=0;
	int charisma =9;
	Character Roberto = new Character();
	System.out.println("your role is " + Roberto.role);
	System.out.println("your strength is "  + strength);
	System.out.println("your constitution is " + constitution);
	System.out.println("your dexterity is " + dexterity);
	System.out.println("your intelligence is " + intelligence);
	System.out.println("your charisma is " + charisma);


		
	}
}
