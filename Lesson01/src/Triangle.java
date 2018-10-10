import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        double catetoA = 0;
        double catetoB = 0;

        System.out.print("Escreva o valor do cateto A: ");
        catetoA = userInput.nextDouble();

        System.out.print("Escreva o valor do cateto B: ");
        catetoB = userInput.nextDouble();

        System.out.println("Comprimento da hipotenusa: " + hipotenusa(catetoA, catetoB) + " | Valor do ângulo entre o Cateto A e a Hipotenusa: " + anguloAH(catetoA, hipotenusa(catetoA,catetoB)));
    }

    private static double hipotenusa(double catetoA, double catetoB)
    {
        return Math.sqrt(Math.pow(catetoA,2) + Math.pow(catetoB,2));
    }

    private static double anguloAH(double catetoA, double hipotenusa)
    {
        return Math.acos(catetoA/hipotenusa)*180;
    }
}