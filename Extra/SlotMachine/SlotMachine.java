import java.util.Scanner;

public class SlotMachine
{
    public static Scanner userInput = new Scanner(System.in);
    public static double balance = 20;
    public static void main(String args[])
    {
        double bet;
        int selection;

        do
        {
            System.out.println("");
            System.out.println("Balance -> " + balance);
            System.out.print("Your bet -> ");
            bet = userInput.nextDouble();
            System.out.println("");

            int s1 = (int) Math.floor(Math.random()*10);
            int s2 = (int) Math.floor(Math.random()*10);
            int s3 = (int) Math.floor(Math.random()*10);

            int[] s = new int[] {s1,s2,s3};

            System.out.print(s1 + " | " + s2 + " | " + s3);
            System.out.println("");
            balance -= bet;

            givePrizes(s, bet);

            System.out.println("Rodar outra vez? [0] Não - [1] Sim");
            selection = userInput.nextInt();

            System.out.print("\033[H\033[2J");  
            System.out.flush();  
        }
        while(selection != 0);
    }

    public static void givePrizes(int[] s, double bet)
    {
        if(s[0] == s[1] && s[1] == s[2] && s[2] == 7)
        {
            System.out.println("BIG WIN");
            double wonValue = bet + bet*1000;
            balance += wonValue;

            System.out.println("");
            System.out.println("YOU JUST WON $" + wonValue);
            System.out.println("");
        }
        else if(s[0] == s[1] || s[0] == s[2] || s[1] == s[2])
        {
            System.out.println("WIN");
            double wonValue = bet + bet*2.5;
            balance += wonValue;

            System.out.println("");
            System.out.println("YOU JUST WON $" + wonValue);
            System.out.println("");
        }
        else if( (s[0] + 1 == s[1] && s[1] + 1 == s[2]) )
        {
            System.out.println("WIN");
            double wonValue = bet + bet*10.5;
            balance += wonValue;

            System.out.println("");
            System.out.println("YOU JUST WON $" + wonValue);
            System.out.println("");
        }
        else
        {
            System.out.println("");
            System.out.println("No wins");
        }
    }
}