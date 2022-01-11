import java.util.Scanner;
import java.util.Random;

class starter {
	public static boolean checkPrime(int a){
		int	y=a;
		int	b = y - 1;
		while(b>1){
			if(y%b==0){
				return false;
				}
			b = b - 1;
			if(b == 1){
				return true;
			}
			}
		return true;
}	
	public static void printPrime(int a){
		int x = a;
		int c = x - 1;
		if(checkPrime(x)==false){
			System.out.println("These are prime numbers within your input:");
		}
		while(c>2){
			if(checkPrime(x)==false){
				c=c-1;
				if(checkPrime(c)==true){
					System.out.println(c);
				}
			}
		else if(checkPrime(x)==true){
			c=c-1;
			if(checkPrime(c)==true){
				System.out.println(c);
			}
			}
		}
		return;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Input an integer");
		int a = sc.nextInt();
		printPrime(a); 
	
	}
}
	

