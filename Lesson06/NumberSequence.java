import java.util.Scanner;

public class NumberSequence
{
    public static void main(String[] args)
    {
        int[] numbers = new int[100];
        int i = 0;
        int x = 0;
        int searchFor = 0;
        int sequenceNumbersNumber = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Insire uma sequência de números inteiros positivos ");
        do
        {
            x = userInput.nextInt();
            if(x < 0)
            {
                break;
            }
            numbers[i] = x;
            i++;
        }
        while(numbers.length <= 100);

        System.out.println("Que número procurar?: ");
        searchFor = userInput.nextInt();
        
        for(int k = 0; k < numbers.length; k++)
        {
            if(numbers[k] == searchFor)
            {
                sequenceNumbersNumber++;
            }
        }

        System.out.println("O número " + searchFor + " aparece " + sequenceNumbersNumber + " na sequência"); 
    }
}