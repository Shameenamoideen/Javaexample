package composition1;

public class Main {
    public static void main(String[] args) {
        /*instead of below code we can write like this
       Interior i= new Interior("leather","black");
        Engine e=new Engine("2023","23",i);
        Car volvo=new Car("volvo","2020",e);
         */

        Car volvo=new Car("volvo","2020",new Engine("2023","23",new Interior("leather","black")));

        System.out.println(volvo.getName()+volvo.getModel()+volvo.getEngine().getModel()+volvo.getEngine().getPower()+volvo.getEngine().getInterior().getSeat()+volvo.getEngine().getInterior().getColor());
    volvo.method();
    }

}
