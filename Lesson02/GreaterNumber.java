import java.util.Scanner;

public class GreaterNumber
{
    public static void main(String[] args)
    {
        double number0, number1 = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Escreva o primero número: ");
        number0 = userInput.nextDouble();

        System.out.print("Escreva o segundo número: ");
        number1 = userInput.nextDouble();

        if(number0 > number1)
        {
            System.out.print("O número " + number0 + " é maior que o número " + number1);
        }
        else if(number0 == number1)
        {
            System.out.print("O número " + number1 + " é igual ao número " + number0);
        }
        else
        {
            System.out.print("O número " + number1 + " é maior que o número " + number0);
        }
    }
}
