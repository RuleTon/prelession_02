import java.lang.reflect.Field;
import java.util.LinkedList;

public class Linked {
    String figure;

    public Linked(String figure) {
        this.figure = figure;
    }

    public static void main(String[] args) {


        LinkedList<Linked> figures = new LinkedList<>();
        Linked square = new Linked("Square");
        Linked triangle = new Linked("Triangle");
        Linked circle = new Linked("Circle");

        figures.add(square);
        figures.add(triangle);
        figures.add(circle);

        System.out.println(figures);

        }

    @Override
    public String toString() {
        return "Linked{" +
                "figure='" + figure + '\'' +
                '}';
    }
}
