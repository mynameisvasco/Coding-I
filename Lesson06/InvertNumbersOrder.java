import java.util.Scanner;

public class InvertNumbersOrder
{
    public static void main(String[] args)
    {
        int n = 0;
        int i = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Valor de N: ");
        n = userInput.nextInt();

        int[] numbers = new int[n];

        do
        {
            System.out.print("Número inteiro: ");
            numbers[i] = userInput.nextInt();
            i++;
        }
        while(i < n);

        for(int k = numbers.length - 1; k >= 0; k--)
        {
            System.out.println("["+ k +"] -> " + numbers[k]);
        }
    }
}