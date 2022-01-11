import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
	int x = a;
	int c = 1;
	while (c<b){
	a = a*x;
	c=c+1;
	}
	return a;
	}
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a number");
	int one = sc.nextInt();
	System.out.println("Input another number");
	int two = sc.nextInt();
	System.out.println(pow(one,two));


		
	}
}
