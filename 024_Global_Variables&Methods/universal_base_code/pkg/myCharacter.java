package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public int intel;
	public int dex;
	public int con;
	public int cha;
	public int str;
	public String role;
	
		public myCharacter(){
			role = ("no role");
			intel = 0;
			dex = 0;
			con = 0;
			cha = 0;
			str = 0;
		}
		
		public void myToString(){
			
			System.out.println("Your role is " + role);
			System.out.println("Your intelligence is " + intel);
			System.out.println("Your dexterity is " + dex);
			System.out.println("Your constitution is " + con);
			System.out.println("Your charisma is " + cha);
			System.out.println("Your strength is " + str);
			return;
			}

}

