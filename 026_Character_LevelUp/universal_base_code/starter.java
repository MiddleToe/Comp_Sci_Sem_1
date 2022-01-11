import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	myCharacter rob = new myCharacter();
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a role");
	String a = sc.nextLine();
	rob.setRole(a);
	System.out.println("How many points will you invest in strength?");
	int z = sc.nextInt();
	rob.setStrength(z);
	System.out.println("How many points will you invest in dexterity?");
	int q = sc.nextInt();
	rob.setDexterity(q);
	System.out.println("How many points will you invest in intelliegence?");
	int b = sc.nextInt();
	rob.setIntelligence(b);
	System.out.println("How many points will you invest in constitution?");
	int r = sc.nextInt();
	rob.setConstitution(r);
	System.out.println("How many points will you invest in charisma?");
	int g = sc.nextInt();
	rob.setCharisma(g);
	rob.setAll(a, z, q, b, r, g);
	}
}
