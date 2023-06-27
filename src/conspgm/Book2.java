package conspgm;

public class Book2 {
    private String name;
    private int a;
    private int age;

    public Book2(String name, int a) {
        this.name = name;
        this.a = a;
    }

    public Book2(int age) {
        this.age = age;
    }
    public void method(String name,int age){
        System.out.println("my name is:"+name+ "age"+age);
    }
    public void method(int age){
        System.out.println("my age is:"+age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
