import java.util.Scanner;

public class SecondsToHour
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        int seconds = 0;

        System.out.print("Tempo em segundos: ");
        seconds = userInput.nextInt();

        System.out.print(seconds + " segundos equivalem a " + toHour(seconds) + " (hh:mm:ss)");
    }

    private static String toHour(int seconds)
    {
        int hours = 0;
        int minutes = 0;
        int seconds1 = 0;

        for(int i = 1; i <= seconds; i++)
        {
            seconds1 += 1;

            if(seconds1 % 60 == 0 && seconds1 != 0)
            {
                minutes += 1;
                seconds1 -= 60;
            }

            if(minutes % 60 == 0 && minutes != 0)
            {
                hours += 1;
                minutes -= 60;
            }
        }

        return hours+":"+minutes+":"+seconds1;
    }
}