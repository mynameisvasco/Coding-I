import java.util.Scanner;

public class NumberOfDaysOfMonth
{
    public static void main(String[] args)
    {
        int month, year = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Mês: ");
        month = userInput.nextInt();

        System.out.print("Ano: ");
        year = userInput.nextInt();

        switch (month)
        {
            case 1:
                System.out.print("O mês de Janeiro do ano " + year + " tem 31 dias");
                break;

            case 2:
                if(isLeapYear(year))
                {
                    System.out.print("O mês de Fevereio do ano " + year + " tem 29 dias");
                }
                else
                {
                    System.out.print("O mês de Fevereio do ano " + year + " tem 28 dias");
                }
                break;

            case 3:
                System.out.print("O mês de Março do ano " + year + " tem 31 dias");
                break;

            case 4:
                System.out.print("O mês de Abril do ano " + year + " tem 30 dias");
                break;

            case 5:
                System.out.print("O mês de Maio do ano " + year + " tem 31 dias");
                break;

            case 6:
                System.out.print("O mês de Junho do ano " + year + " tem 30 dias");
                break;

            case 7:
                System.out.print("O mês de Julho do ano " + year + " tem 31 dias");
                break;

            case 8:
                System.out.print("O mês de Agosto do ano " + year + " tem 31 dias");
                break;

            case 9:
                System.out.print("O mês de Setembro do ano " + year + " tem 30 dias");
                break;

            case 10:
                System.out.print("O mês de Outubro do ano " + year + " tem 31 dias");
                break;

            case 11:
                System.out.print("O mês de Novembro do ano " + year + " tem 30 dias");
                break;

            case 12:
                System.out.print("O mês de Dezembro do ano " + year + " tem 31 dias");
                break;

            default:
                System.out.print("Mês inválido");
                break;
        }

    }

    private static boolean isLeapYear(int year)
    {
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
