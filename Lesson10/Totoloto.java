import java.util.Scanner;

public class Totoloto
{
    static int[] winnerKey = new int[6];
    static int[] userKey = new int[6];
    static Scanner userInput = new Scanner(System.in);

    public static void main(String args[])
    {
        System.out.println("-----> Bem-vindo a Totoloto");
        askUserKey();
        generateWinnerKey();
    }
    
    public static void generateWinnerKey()
    {
        int n;
        int i = 0;

        while(i < winnerKey.length)
        {
            n = (int) Math.floor(Math.random()*49);

            if(!inArray(n, winnerKey) && n != 0)
            {
                winnerKey[i] = n;
                i++;
            }
        }

        System.out.printf("%1s%s", "", "Chave vencedora: ");

        for(int i4 = 0; i4 < userKey.length; i4++)
        {
            System.out.print(winnerKey[i4] + ", ");
        }
        System.out.println("");
        System.out.println("");
    }

    public static void askUserKey()
    {
        System.out.println("");
        System.out.println("-> Digite a sua chave <-");

        int i = 0;
        int n;
        int min = 1;
        int max = 49;

        while(i < userKey.length)
        {
            n = userInput.nextInt();
            
            if(n >= min && n <= max)
            {
                if(!inArray(n, userKey))
                {
                    userKey[i] = n;
                    i++;
                }
                else
                {
                    System.out.println("Já introduziu o número "+ n + " uma vez. Por favor introduza um diferente");
                }
            }
            else
            {
                System.out.println(n + " está fora do intervalo [0,49]");
            }
        }

        System.out.println("");
        System.out.printf("%10s%s", "", "Aposta de Totoloto\n");
        System.out.printf("%4s%s", "", "Chave: ");

        for(int i3 = 0; i3 < userKey.length; i3++)
        {
            System.out.print(userKey[i3] + ", ");
        }
        System.out.println("");
        System.out.println("");

        for(int i2 = 1; i2 <= 49; i2++)
        {
            if(inArray(i2, userKey))
            {
                System.out.printf("%4s%s", "", "X");
            }
            else
            {
                if(i2 > 0 && i2 < 10)
                {
                    System.out.printf("%4s%s", "", i2);
                }
                else
                {
                    System.out.printf("%3s%s", "", i2);
                }
            }

            if(i2 % 7 == 0)
            {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("");
    }

    public static boolean inArray(int n, int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(n == a[i])
            {
                return true;
            }
        }

        return false;
    }
}