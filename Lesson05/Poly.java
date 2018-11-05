import java.util.Scanner;

public class Poly
{
    public static void main(String[] args)
    {
        int xMin = 0;
        int xMax = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.print("X mínimo: ");
        xMin = userInput.nextInt();
        
        System.out.print("X máximo: ");
        xMax = userInput.nextInt();

        if(xMin > xMax)
        {
            System.out.println("O segundo valor de X deve ser maior do que o primeiro.");
        }
        else
        {
            System.out.println("###############################");
            System.out.print("X");
            System.out.print(" ## ");
            System.out.print("5x^2+10x+3");
            System.out.print(" ## ");
            System.out.print("7x^3+3x^2+5x+2");
            System.out.println("");

            for(int i = xMin; i <= xMax; i++)
            {
                System.out.print(i);
                System.out.print(" ## ");
                System.out.print(Functions.poly3(0, 5, 10, 3, i));
                System.out.print("       ## ");
                System.out.print(Functions.poly3(7, 3, 5, 2, i));
                System.out.println("");
            }
        }
    }
}