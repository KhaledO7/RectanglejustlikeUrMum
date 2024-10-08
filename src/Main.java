import java.util.Scanner;




public class Main {
    public static void main(String[]args){


        double length, width, height;

        length = 5.0;
        width = 10.0;
        height = length;

        Box box1 = new Box(length, width, height);
        Box box2 = new Box(length);
        box1.printDimensions();
        box2.printDimensions();

        String bigger;

        if (box1.volume() > box2.volume())
        {
            bigger = "box1 has greater volume";
        }
        else if (box1.volume() < box2.volume())
        {
            bigger = "box2 has greater volume";
        }
        else
        {
            bigger = "both boxes have equal volume";
        }

        System.out.println(bigger);

        boolean box1sides = box1.anySideLongerThan(length);
        boolean box2sides = box2.anySideLongerThan(length);

        System.out.println("box1 has a side that exceeds " + length + ": " + box1sides);
        System.out.println("box2 has a side that exceeds " + length + ": " + box2sides);




    }
}
