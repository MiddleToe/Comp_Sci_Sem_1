import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {

	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		String a = "Odie";
		int b = 4;
		Dog q = new Dog();
		q.setName(a);
		q.setAge(b);
		q.getName();
		q.getAge();
		
		Dog g = new Dog();
		String c = "Boom Boom";
		String d = "German Shepherd";
		g.setName(c);
		g.setBreed(d);
		g.getName();
		g.getBreed();
		
		if(q.isSleeping()==true){
			System.out.println(a + " is sleeping.");
		}
		else if(q.isSleeping()==false){
			q.bark();
			if(g.isSleeping()==true){
				g.bark();
			}
			else if(g.isSleeping()==false){
				g.bark();
			}
		}
		
	
	}
}
	
