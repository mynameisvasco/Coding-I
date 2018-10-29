import java.util.Scanner;

public class HighOrLow
{
    public static void main(String[] args)
    {
        int secret = (int)(100.0*Math.random()) + 1;
        int timesToGuess = 0;
        int currentNumber = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.println("--> Alto ou Baixo <--");
        System.out.println("Tenta adivinhar o número de 1 a 100");
        while(currentNumber != secret)
        {
            System.out.print("O teu palpite: ");
            currentNumber = userInput.nextInt();
            timesToGuess += 1;
            if(currentNumber  > secret)
            {
                System.out.println("O teu número é muito alto");
            }
            else if(currentNumber  < secret)
            {
                System.out.println("O teu número é muito baixo");
            }
        }
        if(currentNumber == secret)
        {
            System.out.println("Parabéns acertaste ao fim de " + timesToGuess + " tentativas");
        }

    }
}