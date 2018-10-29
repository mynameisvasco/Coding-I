import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int m = 0;

        System.out.print("Factorial de: ");
        m = userInput.nextInt();

        for(int i = m; i >= 1; i--)
        {
            System.out.println(i + "!" + " = " + Functions.fact(i));
        }
    }
}