import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please input a name.");
	String name = sc.nextLine();
	System.out.println("Input how many times you want the name to be output");
	int times = sc.nextInt();
	int a = 0;
	while(true){
		System.out.println(name);
		if(a == times){
			break;
		}
	a=a+1;
	}
	



		
	}
}
