package pkg;
import java.util.Scanner;
import java.util.Random;


public class account {
    String name;
    double amount;
    
    public account(){
        name = "Billy Bob joe";
        amount = 100.0;
    }
    
    public String printDetails(){
        System.out.println("Your account is registered under: " + name + ".");
        System.out.println("You have: " + amount + " dollars.");
        return name;
    }
    
    public void setName(String a){
        name = a;
        return;
    }
    
    public void addMoney(double a){
        double b = a;
        amount = amount + b;
        return;
    }
    
}

