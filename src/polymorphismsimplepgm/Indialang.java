package polymorphismsimplepgm;

public class Indialang {
    public void speak(){
        System.out.println("I can speak indian languages");
    }
}
class Delhi extends Indialang{
    @Override
    public void speak() {
        System.out.println("I can speak Hindi");
    }
}
class Chennai extends Indialang{
    public void speak(){
        System.out.println("i can speak tamil");
    }
}
