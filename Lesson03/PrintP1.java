import java.util.Scanner;

public class PrintP1
{
    public static void main(String[] args)
    {
        int numberOfTimes = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Quantas vezes deseja escrever a frase?: ");
        numberOfTimes = userInput.nextInt();

        for(int i = 1; i <= numberOfTimes; i++)
        {
            System.out.println(i + ") " + "P1 é fixe!");
        }
    }
}