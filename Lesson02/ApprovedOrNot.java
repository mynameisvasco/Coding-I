import java.util.Scanner;

public class ApprovedOrNot
{
    static double tpg1Percentage = 0.20;
    static double tpg2Percentage = 0.30;
    static double eiPercentage = 0.50;

    public static void main(String[] args)
    {
        double tpg1 = 0;
        double tpg2 = 0;
        double ei = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Nota da TPG1: ");
        tpg1 = userInput.nextDouble();

        System.out.print("Nota da TPG2: ");
        tpg2 = userInput.nextDouble();

        System.out.print("Nota da EI: ");
        ei = userInput.nextDouble();

        System.out.println("O Aluno está " + isStudentApproved(finalGrade(tpg1, tpg2, ei)));

    }

    private static double finalGrade(double tpg1, double tpg2, double ei)
    {
        return (tpg1 * tpg1Percentage) + (tpg2 * tpg2Percentage) + (ei * eiPercentage);
    }

    private static String isStudentApproved(double grade)
    {
        if(grade >= 9.5)
        {
            return "aprovado";
        }
        else
        {
            return "reprovado";
        }
    }
}