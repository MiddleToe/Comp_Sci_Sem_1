import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	Random rand=new Random();
	System.out.println("Guess a number between 1 and 1000");
	int guess = sc.nextInt();
	int a = rand.nextInt(1000);
	if(a==guess){
	System.out.println("Congrats! Your number was right!");
	}
	else if(guess>a){
	System.out.println("Your number was too high! Try again!");
	}
	else if(guess<a){
	System.out.println("Your number was too low! Try again!");
	}	
	}
}
