import java.util.Scanner;

public class Distance2points
{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {
        Point2D a = new Point2D();
        Point2D origin = new Point2D();
        origin.x = 0;
        origin.y = 0;
        Point2D maxDistancePoint = new Point2D();
        double maxDistance = 0;
        double distanceSum = 0;
        int numberOfPoint = 0;

        do
        {
            System.out.println("Introduza um ponto: ");
            System.out.print("Coordenada X: ");
            a.x = userInput.nextDouble();
            System.out.print("Coordenada Y: ");
            a.y = userInput.nextDouble();

            distanceSum += distanceBetween(a, origin);

            if(distanceBetween(a, origin) > maxDistance)
            {
                maxDistance = distanceBetween(a, origin);
                maxDistancePoint.x = a.x;
                maxDistancePoint.y = a.y;
            }

            numberOfPoint++;
        }
        while(a.x != 0 && a.y != 0);

        System.out.println("A soma das distâncias dos " + numberOfPoint + " pontos à origem é " + distanceSum);
        System.out.println("O ponto mais afastado da origem é o (" + maxDistancePoint.x + "," + maxDistancePoint.y + ")");
    }

    public static Point2D readPoint(double x, double y)
    {
        System.out.println("Introduza o valor da coordenada X: ");
        x = userInput.nextDouble();
        System.out.println("Introduza o valor da coordenada Y: ");
        y = userInput.nextDouble();
        
        Point2D point2d = new Point2D();
        point2d.x = x;
        point2d.y = y;

        return point2d;
    }

    public static void writePoint(Point2D point2d)
    {
        System.out.println("O ponto escolhido é [" + point2d.x + "," + point2d.y + "]");
    }

    public static double distanceBetween(Point2D a, Point2D b)
    {
        return Math.sqrt( Math.pow((a.x - b.x), 2)+ Math.pow((a.y - b.y), 2) );
    }


}

class Point2D
{
    double x,y;
}
