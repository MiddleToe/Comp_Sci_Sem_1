import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the game! What is your name?");
	String name = sc.nextLine();
	System.out.println("Hello " + name +"! Please choose a title for your character!");
	String title = sc.nextLine();
	System.out.println(title + " " + name + ", Choose your class: Wizard, Warrior, Rogue");
	String role = sc.nextLine();
	String w = new String("Wizard");
	String A = new String("Warrior");
	String R = new String("Rogue");
		if(role.equals("Wizard")){
	System.out.println("Your role has been chosen as Wizard.");
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
	System.out.println("You have now been given 25 points to spend on abilities. 1 ability can have up to 10 points.");
	System.out.println("Choose how many points you would like to spend on strength(allows you to carry more items).");
	int strength = sc.nextInt();
	int s = 25 - strength;
	if (strength>10){
	System.out.println("Error! Invalid! Restart the game.");}
	else if(strength<=10){
	System.out.println("You have " + s + " points remaining.");
	System.out.println("Choose how many points you would like to spend on dexterity(agility and speed).");}
	int dexterity = sc.nextInt();
	int d = s - dexterity;
	if (dexterity>10){
	System.out.println("Error! Invalid! Restart the game.");}
	else if(dexterity<=10){
	System.out.println("You have " + d + " points remaining.");
	System.out.println("Choose how many points you would like to spend on intelligence(affects magic spells).");}
	int intelligence = sc.nextInt();
	int i = d - intelligence;
	if (intelligence>10){
	System.out.println("Error! Invalid! Restart the game.");}
	else if(intelligence<=10){
	System.out.println("You have " + i + " points remaining.");
	System.out.println("Choose how many points you would like to spend on constitution(affects your health).");}
	int constitution = sc.nextInt();
	int c = i - constitution;
	if (constitution>10){
	System.out.println("Error! Invalid! Restart the game.");}
	else if(constitution<=10){
	System.out.println("You have " + c + " points remaining.");
	System.out.println("Choose how many points you would like to spend on charisma(affects your personality).");}
	int charisma = sc.nextInt();
	int h = c - charisma;
	if (charisma>10){
	System.out.println("Error! Invalid! Restart the game.");}
	else if(charisma<=10){
	System.out.println("Congratulations! You have finished your character creation.");
	System.out.println("Your character is " + title + " " + name + " and he/she is a " + role + ".");
	System.out.println("Your character has " + strength + " points of strength.");
	System.out.println("Your character has " + dexterity + " points of dexterity.");
	System.out.println("Your character has " + intelligence + " points of intelligence.");
	System.out.println("Your character has " + constitution + " points of constitution.");
	System.out.println("Your character has " + charisma + " points of charisma.");
	System.out.println("You had " + h + " points remaining.");}
	}
}