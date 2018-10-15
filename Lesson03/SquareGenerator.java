import java.util.Scanner;

public class SquareGenerator
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int width, height = 0;

        System.out.print("Largura: ");
        width = userInput.nextInt();

        System.out.print("Altura: ");
        height = userInput.nextInt();

        for(int iH = 0; iH < height; iH++)
        {
            for(int iW = 0; iW < width; iW++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}