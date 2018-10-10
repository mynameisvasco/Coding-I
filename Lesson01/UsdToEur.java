import java.util.Scanner;

public class UsdToEur
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        double usdAmount = 0;

        System.out.print("Escreva a quantia em dólares: ");
        usdAmount = userInput.nextDouble();

        System.out.print(usdAmount + " dólares equivalem a " + usdToEur(usdAmount) + " euros.");
    }

    private static double usdToEur(double usdAmount)
    {
        return 0.85*usdAmount;
    }
}
