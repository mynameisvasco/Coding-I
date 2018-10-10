import com.sun.java.browser.plugin2.DOM;

import java.util.Scanner;
import java.util.Vector;

public class Square
{
    public static void main(String[] args)
    {
        Vector<Double> coordinatesX = new Vector<Double>();
        Vector<Double> coordinatesY = new Vector<Double>();
        Vector<Double> distances = new Vector<Double>();
        Scanner userInput = new Scanner(System.in);
        double p1p2,p2p3,p3p4,p4p1 = 0;

        System.out.println("[PONTO 1]");
        System.out.print("X: ");
        coordinatesX.add(userInput.nextDouble());
        System.out.print("Y: ");
        coordinatesY.add(userInput.nextDouble());

        System.out.println("[PONTO 2]");
        System.out.print("X: ");
        coordinatesX.add(userInput.nextDouble());
        System.out.print("Y: ");
        coordinatesY.add(userInput.nextDouble());

        System.out.println("[PONTO 3]");
        System.out.print("X: ");
        coordinatesX.add(userInput.nextDouble());
        System.out.print("Y: ");
        coordinatesY.add(userInput.nextDouble());

        System.out.println("[PONTO 4]");
        System.out.print("X: ");
        coordinatesX.add(userInput.nextDouble());
        System.out.print("Y: ");
        coordinatesY.add(userInput.nextDouble());

        p1p2 = distanceBetweenCoordinates(coordinatesX.get(0), coordinatesX.get(1), coordinatesY.get(0), coordinatesY.get(1));
        p2p3 = distanceBetweenCoordinates(coordinatesX.get(1), coordinatesX.get(2), coordinatesY.get(1), coordinatesY.get(2));
        p3p4 = distanceBetweenCoordinates(coordinatesX.get(2), coordinatesX.get(3), coordinatesY.get(2), coordinatesY.get(3));
        p4p1 = distanceBetweenCoordinates(coordinatesX.get(3), coordinatesX.get(0), coordinatesY.get(3), coordinatesY.get(0));

        if( (p1p2 == p2p3 && p3p4 == p2p3 && p4p1 == p1p2) && (coordinatesY.get(0).equals(coordinatesY.get(1)) && coordinatesY.get(2).equals(coordinatesY.get(3)) && (coordinatesX.get(0).equals(coordinatesX.get(3)) && coordinatesX.get(1).equals(coordinatesX.get(2)))))
        {
            System.out.print("A figura é um quadrado.");
        }
        else
        {
            System.out.print("A figura não é um quadrado.");
        }


    }

    private static double distanceBetweenCoordinates(double x0, double x1, double y0, double y1)
    {
        return Math.sqrt(Math.pow( (x0 - x1) , 2) + Math.pow( (y0 - y1) , 2));
    }
}
