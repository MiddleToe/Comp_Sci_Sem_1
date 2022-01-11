import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a integer");
	int one = sc.nextInt();
	if (one%2==0){
	System.out.println("Your number is an even number");
	}
	else {
	System.out.println("Your number is an odd number");
	}
	if (one%3==0){
	System.out.println("Your number is divisible by 3");
	}
	else{
	System.out.println("Your number is not divisible by 3");
	}
	if (one%4==0){
	System.out.println("Your number is divisible by 4");
	}
	else{
	System.out.println("Your number is not divisible by 4");
	}
		if (one%5==0){
	System.out.println("Your number is divisible by 5");
	}
	else{
	System.out.println("Your number is not divisible by 5");
	}
	System.out.println("Input a second integer");
	int two = sc.nextInt();
	if (two%2==0){
	System.out.println("Your number is an even number");
	}
	else {
	System.out.println("Your number is an odd number");
	}
	if (two%3==0){
	System.out.println("Your number is divisible by 3");
	}
	else{
	System.out.println("Your number is not divisible by 3");
	}
	if (two%4==0){
	System.out.println("Your number is divisible by 4");
	}
	else{
	System.out.println("Your number is not divisible by 4");
	}
	if (two%5==0){
	System.out.println("Your number is divisible by 5");
	}
	else{
	System.out.println("Your number is not divisible by 5");
	}
	}
}
