import java.util.Scanner;

public class Square
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int n = 0;

        System.out.print("Insira um número: ");
        n = userInput.nextInt();

        System.out.println(Functions.sqr(n));
    }
}