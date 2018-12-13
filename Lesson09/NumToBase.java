import java.util.Scanner;

public class NumToBase
{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String args[])
    {
        int number,base;

        System.out.println("Conversão de decimal para outra base");
        System.out.print("Número em decimal: ");
        number = userInput.nextInt();
        System.out.print("Converter para base ([2-10]) : ");
        base = userInput.nextInt();

        convertNumToOtherBase(number, base);

    }

    public static void convertNumToOtherBase(int number, int base)
    {
        int rest = 0;
        int dividend = number;
        int divisor = base;
        int quocient = 0;

        String value = "";

        while(dividend/divisor >= divisor)
        {
            quocient = dividend/divisor;
            rest = dividend%divisor;
            value += String.valueOf(rest);
            dividend = quocient;
        }

        value += String.valueOf(quocient);

        System.out.println(value);
    }
}