import java.util.Scanner;

public class isPrime
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int number = 0;

        System.out.print("Escreve um número: ");
        number = userInput.nextInt();

        if(number >= 0)
        {
            if(isPrime(number))
            {
                System.out.println("O número é primo");
            }
            else
            {
                System.out.println("O número não é primo");
            }
        }
        else
        {
            System.out.println("Introduza um número positivo!");
        }
    }

    public static boolean isPrime(int number)
    {
        for(int i = 1; i <= number; i++)
        {
            if(i != 1 && i != number && number%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}