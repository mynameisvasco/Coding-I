import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        int m = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Introduza M (0 < M < 10), sendo M o número até que o programa vai calcular o factorial: ");
        m = userInput.nextInt();

        if(m >= 0 && m <= 10)
        {
            for(int i = 1; i <= m; i++)
            {
                System.out.println(i + "! = " + factorial(i));
            }
        }
        else
        {
            System.out.println("Valor de M fora do intervalo (0 < M < 10)");
        }
    }

    public static int factorial(int m)
    {
        int factorialValue = 1;

        for(int i = 1; i <= m; i++)
        {
            factorialValue *= i; 
        }

        return factorialValue;
    }
}