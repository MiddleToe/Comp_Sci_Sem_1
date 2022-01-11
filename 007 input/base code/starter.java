import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your first Name?");
		String name = sc.nextLine();
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		
		System.out.println("What month were you born in?");
		int month = sc.nextInt();
		
		System.out.println("What day were you born on?");
		int day = sc.nextInt();
		
		System.out.println("What year were you born in?");
		int year = sc.nextInt();
		
		System.out.println("How much is a buck fifty in cents?");
		double value = sc.nextDouble();
		
		System.out.println("Your name is " + name + " and you are " + age + " years old");
		System.out.println("Your birthday is " + month + "/" + day + "/" + year);
		System.out.println("One dollar and fifty cents is" + value + " cents");
	}
}
