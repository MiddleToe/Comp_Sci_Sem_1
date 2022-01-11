import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int secret=rand.nextInt(1000);
	System.out.println(secret);
	while (true){
	System.out.println("Type a number");
	int guess = sc.nextInt();
	sc.nextLine();	
	if (guess != secret){
	System.out.println("Incorrect! Guess again");
	}
	else if (guess==secret){
	System.out.println("COngrats! You got the number");
	break;
	}
	}



		
	}
}
