import java.util.Scanner;
import java.util.Random;

class Cat{
    public String name;
    
    public Cat(){
        name = ("Garfield");
    }
    
    public Cat(String x){
		String b = x;
		name = (b);
    }
    public void Meow(){
        System.out.println(name + " meows");
        return;
    }
}
class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("What name do you choose for your cat?");
	String a = sc.nextLine();
	Cat f = new Cat(a);
	f.Meow();
	Cat g = new Cat();
	g.Meow();
	}
}
	

