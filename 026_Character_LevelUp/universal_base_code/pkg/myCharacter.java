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
		
		public String setRole(String a){
			role = a;
			if(role.equals("Wizard")||role.equals("wizard")){
			System.out.println("Your role has been chosen as Wizard");
			return role;	
			}
			else if (role.equals("Warrior")||role.equals("warrior")){
			System.out.println("Your role has been chose as Warrior");
			return role;
			}
			else if (role.equals("Rogue")||role.equals("rogue")){
			System.out.println("Your role has been chosen as Rogue");
			return role;
			}
			else{
			System.out.println("Error! Your role does not exist");
			}
				return role;	 
			
			}
	public int setStrength(int z){
		str = str + z;
		System.out.println("Your strength is " + str);
		return str;
		}
	public int setDexterity(int z){
		dex = dex + z;
		System.out.println("Your dexterity is " + dex);
		return dex;
		}
	public int setIntelligence(int z){
		intel = intel + z;
		System.out.println("Your intelligence is " + intel);
		return intel;
		}
	public int setConstitution(int z){
		con = con + z;
		System.out.println("Your constitution is " + con);
		return con;
		}
	public int setCharisma(int z){
		cha = cha + z;
		System.out.println("Your charisma is " + cha);
		return cha;
		}
	public boolean setAll(String a, int b, int c, int d, int e, int f){
		if(a.equals(role)&& b==str && c==dex && d==intel && e==con && f==cha){
			System.out.println("Your values have been set.");
			return true;
		}
		else{
			System.out.println("Your values have not been set, try again.");
			return false;
		}
	}
	public int levelUp(int a, int b, int c, int d, int e){
		int level = 0;
		int points = 0;
		if(level == 1){
			points = points + 25;
			System.out.println("You have " + points + " points.");
			level = level + 1;
			
		}
		while(level>1){
			points = points + 10;
			System.out.println("Your have " + points + "points.");
			
		}
		return level;
	}
	
}

