import java.util.Scanner;

public class MultiplicationTables
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int n = 0;

        System.out.print("Escolha um N (0 < N < 100), sendo N a tabuada que pretende saber: ");
        n = userInput.nextInt();

        if(n < 100 && n > 0)
        {
            System.out.println("-------------------------");
            System.out.println("| Tabuada dos " + n + " |");
            System.out.println("-------------------------");
            for(int i = 1; i <= 10; i++)
            {
                System.out.println("-> " + n + " x " + i + " = " + n*i);
            }
        }
        else
        {
            System.out.println("O valor de N está fora do intervalo (0 < N < 100");
        }
    }
}