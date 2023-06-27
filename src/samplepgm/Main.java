package samplepgm;

public class Main {
    public static void main(String[] args) {
        Phone p1=new Phone();//object one of class phone
        p1.name="iphone";
        p1.make="iphone11";
        p1.model="iphone 11 pro";
        System.out.println("phone name is: "+p1.name+"\n"+"phone make is: "+p1.make+"\n"+"phone model is: "+p1.model);
        Phone p2=new Phone();// object two of class phone, this way we can create any number of objects for a class.
        p2.name="galaxy";
        System.out.println("phone name: "+p2.name);

    }
}
