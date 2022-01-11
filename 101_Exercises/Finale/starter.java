import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int getMode(int [] x){
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		for(int i = 0; i<x.length; i++){
			c = x[i];
			for(int q = 0; q<x.length; q++){
				if(e==x[q]){
					d++;
				}
			}
			if(d>c){
				f = e;
				c = d;
			}
			else if (d==c){
				f = Math.min(e,f);
			}
			
		}
		return f;
	}

	
	public static int getMedian(int[] y){
		for(int i = 0; i<=y.length; i++){
			
		}
	}
	
	public static void main(String args[]) {


		
	}
}
