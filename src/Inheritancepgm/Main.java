package Inheritancepgm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*scanner function*/
        System.out.println("enter the name of animal");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println(name);
        System.out.println("enter the color of the animal");
        String color=sc.next();
        System.out.println(color);
        Animal a=new Animal(name,color);
        Birds b=new Birds(name,color,true);
       Mammal x= new Mammal(name,color,29);
        System.out.println(a.getColor());
       System.out.println(b.getColor());

b.Method();
    }
}
