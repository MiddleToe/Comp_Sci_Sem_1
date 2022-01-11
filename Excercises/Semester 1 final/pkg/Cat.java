package pkg;
import java.util.Scanner;
import java.util.Random;


public class Cat {
    public String name;
    
    public Cat(){
        name = "Garfield";
    }
    
        public String Name(String a){
            a = name;
            System.out.println("Your cat's name is " + name);
            return name;
        }
        public String meow(){
            System.out.println(name + " has meowed!");
            return name;
        }
        public String sleep(){
            System.out.println(name + " has gone to sleep.");
            return name;
        }
       
}