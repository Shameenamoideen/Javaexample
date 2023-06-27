package collection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();// this ia called collections to add more elements in the array,
        // bcoz the normal array is immutable we cant add element after creating it so we are using this
        color.add("blue");
        color.add("yellow");
        color.add("red");
        color.forEach((i)-> System.out.println(i));
        System.out.println(color.get(0));
        System.out.println(color.indexOf("blue"));
        String[] names={"blue","green","black","red"};
        System.out.println(names.length);
    }
}
