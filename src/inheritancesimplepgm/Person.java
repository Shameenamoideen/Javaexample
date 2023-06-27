package inheritancesimplepgm;

public class Person {
    String name;
    int age;
    public void method(){
        System.out.println("name is: "+name+ " "+"age is :"+age );
    }

}
class Teacher extends Person{     //one child class of the parent class Person
}
class Student extends Person{     //another child class of the parent class Person

}
