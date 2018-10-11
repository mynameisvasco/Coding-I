import java.util.Scanner;

public class Leibnitz
{
    public static void main(String[] args)
    {
        int n = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Escreva N, sendo N o número de termos a mostrar da série de Leibnitz: ");
        n = userInput.nextInt();

        System.out.printf("%4.15f",leibnitz(n));

    }

    public static double leibnitz(int n)
    {
        double sum = 0;

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                sum -= (1f/(2f*i-1f));
            
            }
            else
            {
                sum += (1f/(2f*i-1f));
            }
        }

        return sum;
    }
}