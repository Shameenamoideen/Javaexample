package conspgm;

public class Polycons {
    public static void main(String[] args) {
        Book2 a=new Book2("harry potter",2000);
        Book2 b=new Book2(35);
       // Book2 b=new Book2();
        System.out.println(a.getName());
        System.out.println(b.getAge());
        b.method("harry",35);
        a.method(23);
    }
}
