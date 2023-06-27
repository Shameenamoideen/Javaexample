package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Organ o=new Organ("eye");
        Eye e=new Eye("left eye","left eye","blue");
        boolean stop=true;
        while(stop) {
            System.out.println("Enter your choice" + "\n\t 1:Left eye" + "\n\t 2:Right Eye" + "\n\t 3:Heart" + "\n\t 4:Quit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                       e.details();

                       break;
                case 4:
                    stop=false;
                    break;


            }
        }
    }
}
