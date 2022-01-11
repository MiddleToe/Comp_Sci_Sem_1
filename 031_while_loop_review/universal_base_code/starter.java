import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int c = 0;
		while(c<100){
			int b = rand.nextInt(100+1);
			System.out.println(b);
			c++;
		}

		
	}
}
