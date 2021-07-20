import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {

        ArrayList<String> figures = new ArrayList<String>();
        figures.add("Square");
        figures.add("Triangle");
        figures.add("Circle");

        System.out.println(figures.get(1));

        if(figures.contains("Box")) {
            System.out.println("We got them");
        }
        else System.out.println("Can't find this figure");


        if(figures.contains("Circle")) {
            System.out.println("We got them");
        }
        else System.out.println("Can't find this figure");


    }
}
