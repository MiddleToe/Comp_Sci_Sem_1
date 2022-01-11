package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int intel;
	public int dex;
	public int con;
	public int cha;
	public int str;
	
		public myCharacter(){
		role = ("no role");
		intel = 0;
		dex = 0;
		con = 0;
		cha = 0;
		str = 0;
		}	

			public String myCharacter(String a) {
			role = a;
			System.out.println("Your role is " + role);
			return role;
			}
			public int myCharacter(int b){
			intel = b;
			System.out.println("Your intelligence " + intel);
			return intel;
			}
	}

