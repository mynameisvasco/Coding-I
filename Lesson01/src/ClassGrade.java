import java.util.Scanner;

public class ClassGrade
{
    static double tp1Percentage = 0.15;
    static double tp2Percentage = 0.15;
    static double apiPercentage = 0.30;
    static double epPercentage = 0.40;

    public static void main(String[] args)
    {
        double tp1 = 0;
        double tp2 = 0;
        double api = 0;
        double ep = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Nota da TP1: ");
        tp1 = userInput.nextDouble();

        System.out.print("Nota da TP2: ");
        tp2 = userInput.nextDouble();

        System.out.print("Nota da API: ");
        api = userInput.nextDouble();

        System.out.print("Nota da EP: ");
        ep = userInput.nextDouble();

        System.out.println("A nota final do aluno é: " + finalGrade(tp1, tp2, api, ep));

    }

    private static double finalGrade(double tp1, double tp2, double api, double ep)
    {
        return (tp1 * tp1Percentage) + (tp2 * tp2Percentage) + (api * apiPercentage) + (ep * epPercentage);
    }
}
