import java.util.Scanner;

public class RectangleArea
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        float x = 0;
        float y = 0;

        System.out.print("Escreva o comprimento do lado X: ");
        x = userInput.nextFloat();
        System.out.print("Escreva o comprimento do lado X: ");
        y = userInput.nextFloat();

        System.out.print("A area do rectangulo é: " + calculateArea(x,y));
    }

    public static float calculateArea(float x, float y)
    {
        return x*y;
    }
}