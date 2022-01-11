import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {

	public static void main(String args[]) {
		String  t[] = new String [13];
		
		t[0] = "  {\\                        ";
		t[1] = "  { \\                _____";
		t[2] = " {   \\              /     \\";
		t[3] = " {    \\            /    o  \\";
		t[4] = "{      \\   ______ /       {\\";
		t[5] = "{       \\ /      \\ \\     \\";
		t[6] = "{         /        \\ \\     \\";
		t[7] = "{         |           \\     \\";
		t[8] = "{         |           \\     \\";
		t[9] = "{         |           |     |";
		t[10] ="{         |           |     /";  
		t[11] =" {        \\         /     / ";
		t[12] = "             |   |      ";
		
		System.out.println("My turkey unfortunately had his legs stolen so he uses sticks as legs");
 		
		int c = 0;
		while(c<t.length){
			System.out.println(t[c]);
			c++;
		}
	}
}
	
