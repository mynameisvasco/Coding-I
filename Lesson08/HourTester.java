import java.util.Scanner;

public class HourTester
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        Hour hour = new Hour();

        System.out.println("Testar um valor de uma hora do dia no formato (HH:MM:SS)");
        System.out.print("Valor das horas (HH): ");
        hour.h = userInput.nextInt();
        System.out.print("Valor dos minutos (MM): ");
        hour.m = userInput.nextInt();
        System.out.print("Valor dos segundos (SS): ");
        hour.s = userInput.nextInt();

        validateHour(hour);


    }
    public static void validateHour(Hour hour)
    {
        if((hour.h >= 0 && hour.h <= 23) && (hour.m >= 0 && hour.m <= 59) && (hour.s >= 0 && hour.s <= 59))
        {
            System.out.println(hour.h + ":" + hour.m + ":" + hour.s + " é uma hora válida!");
        }
        else
        {
            System.out.println(hour.h + ":" + hour.m + ":" + hour.s + " é uma hora inválida!");
        }
    }
}

class Hour
{
    int h,m,s;
}
