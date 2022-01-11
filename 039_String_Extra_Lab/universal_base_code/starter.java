import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int q = 0;
		System.out.println("Enter a phrase");
		String i = sc.nextLine();
		int a = i.length();
		String t = i;
		a = a - 1;
		String e = "";
		
		for(int r = 0; r<i.length(); r++){
			if(i.substring(r,r+1).compareTo(" ") == 0){
				t=i.substring(q,i.indexOf((" "),q));
				q=i.indexOf((" "),q)+1;
				System.out.println(q);
				System.out.println(a);
			}
			if(i.indexOf((" "),q)== -1){
				t=i.substring(q,i.length());
				e = t + e;
				System.out.print(t);
				break;
			}
		}
		System.out.println(e);
		
		

		
	}
}
