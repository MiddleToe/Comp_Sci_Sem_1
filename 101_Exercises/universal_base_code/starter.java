import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Ascii a = new Ascii("human");
		a.printArt();
		Ascii b = new Ascii("human","Albert");
		b.printArt();
		Ascii c = new Ascii("dog",5);
		c.printArt();
		Ascii d = new Ascii();
		d.setName("Lenny");
		d.setType("Other");
		d.setNumber(1);
		d.setAscii("( ͡° ͜ʖ ͡°)");
		d.printArt();
		Ascii e = new Ascii("heart","Heart");
		e.printArt();

		
	}
}
