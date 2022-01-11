package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
    public String name;
    public int age;
    public String breed;
    
    public Dog(){
        name = "Clifford";
        age = 3;
        breed = "big red dog";
    }
    
    public Dog(String a){
        String b = a;
        name = b;
        age = 1;
        breed = "dog dog";
    }
    
    public Dog(String a, String b){
        String z = a;
        String y = b;
        name = z;
        breed = y;
        age = 1;
    }
    
    public Dog(String w, int x){
        String c = w;
        int z = x;
        name = c;
        age = z;
        breed = "dog dog";
    }
        public void setName(String a){
            name = a;
            return;
        }
        public void setAge(int a){
            age = a;
            return;
        }
        public void setBreed(String a){
            breed = a;
            return;
        }
        public String getName(){
            System.out.println("Your dog's name is " + name);
            return name;
        }
        public int getAge(){
            System.out.println("Your dog's age is " + age);
            return age;
        }
        public String getBreed(){
            System.out.println("Your dog is a " + breed);
            return breed;
        }
        public boolean isSleeping(){
            Random rand = new Random();
            int t = rand.nextInt(2);
            if (t == 0){
                return true;
            }
            else if(t == 1){
                return false;
            }
            return false;
        }
        public String bark(){
            System.out.println(name + " barks!");
            return name;
        }
}