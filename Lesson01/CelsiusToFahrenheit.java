import java.util.Scanner;

public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        double celsius = 0;

        System.out.print("Escreva a temperatura em graus Celsius: ");
        celsius = userInput.nextDouble();

        System.out.print(celsius+" Graus Celsius são " + convertTemperature(celsius) + " Graus Fahrenheit");

    }

    private static double convertTemperature(double celsius)
    {
        return 1.8*celsius+32;
    }
}
