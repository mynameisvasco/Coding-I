import java.util.Scanner;

public class AnalyseNumberSequence
{
    static int selection;
    static int[] numberSequence = new int[50];
    static int maxNumber;
    static int minNumber;
    static double avarage;
    static boolean onlyEvenNumbers = true;

    static Scanner userInput = new Scanner(System.in);

    public static void main(String args[])
    {
        System.out.println("Análise de uma sequência de números inteiros");
        menu();
    }

    public static void menu()
    {
        System.out.print("\033[H\033[2J");
        System.out.println("");

        if(numberSequence[0] != 0)
        {
            System.out.println("[1] -> Ler a sequência (COMPLETO)");
        }
        else
        {
            System.out.println("[1] -> Ler a sequência");
        }

        System.out.println("[2] -> Escrever a sequência");
        System.out.println("[3] -> Calcular o máximo da sequência");
        System.out.println("[4] -> Calcular o mínimo da sequência");
        System.out.println("[5] -> Calcular a média da sequência");
        System.out.println("[6] -> Detetar se é uma sequência só constituída por números pares");
        System.out.println("[10] -> Terminar o programa");
        System.out.print("Seleção -> ");
        selection = userInput.nextInt();

        switch(selection)
        {
            case 1:
                readSequence();
                break;

            case 2:
                writeSequence();
                break;

            case 3:
                maxSequenceNumber();
                break;

            case 4:
                minSequenceNumber();
                break;

            case 5:
                calculateAvarage();
                break;

            case 6:
                checkOnlyEvenNumbers();
                break;

            case 10:
                System.exit(1);
                break;

            default:
                System.out.println("Seleção invalida!");
                break;
        }
    }

    public static void readSequence()
    {
        int i = 0;
        int currentNumberToAdd;

        System.out.print("\033[H\033[2J");
        System.out.println("Escreve uma sequência de número inteiros. A sequência termina quando aparecer um zero ou então quando o número de elementos for 50.");

        do
        {
            currentNumberToAdd = userInput.nextInt();
            numberSequence[i] = currentNumberToAdd;
            i++;
        }
        while(currentNumberToAdd != 0);

        menu();
    }

    public static void writeSequence()
    {
        int i = 0;

        System.out.print("\033[H\033[2J");
        System.out.println("Sequência");
        do
        {
            System.out.print(numberSequence[i] + " ");
            i++;
        }
        while(numberSequence[i] != 0 );

        System.out.println("");
        System.out.println("[0] para voltar ao menu");
        userInput.next();
        menu();
    }

    public static void maxSequenceNumber()
    {
        int i = 0;

        System.out.print("\033[H\033[2J");

        maxNumber = numberSequence[0];

        do
        {
            if(numberSequence[i] > maxNumber)
            {
                maxNumber = numberSequence[i];
            }
            i++;
        }
        while(numberSequence[i] != 0);
        
        System.out.println("");
        System.out.println("O maior número da sequência é o " + maxNumber);
        System.out.println("");
        System.out.println("[0] para voltar ao menu");
        userInput.next();
        menu();
    }

    public static void minSequenceNumber()
    {
        int i = 0;

        System.out.print("\033[H\033[2J");

        minNumber = numberSequence[0];

        do
        {
            if(numberSequence[i] < minNumber)
            {
                minNumber = numberSequence[i];
            }
            i++;
        }
        while(numberSequence[i] != 0);
        
        System.out.println("");
        System.out.println("O menor número da sequência é o " + minNumber);
        System.out.println("");
        System.out.println("[0] para voltar ao menu");
        userInput.next();
        menu();
    }

    public static void calculateAvarage()
    {
        int i = 0;
        int totalSum = 0;

        do
        {
            totalSum += numberSequence[i];
            i++;
        }
        while(numberSequence[i] != 0);

        avarage = (double) totalSum/i;

        System.out.print("\033[H\033[2J");
        System.out.println("");
        System.out.println("A média é " + avarage);
        System.out.println("");
        System.out.println("[0] para voltar ao menu");
        userInput.next();
        menu();
    }

    public static void checkOnlyEvenNumbers()
    {
        int i = 0;

        do
        {
            if(numberSequence[i] % 2 != 0)
            {
                onlyEvenNumbers = false;
            }

            i++;
        }
        while(numberSequence[i] != 0);

        System.out.print("\033[H\033[2J");
        System.out.println("");

        if(onlyEvenNumbers)
        {    
            System.out.println("A sequência é composta apenas por numeros pares");
        }
        else
        {
            System.out.println("Existem número ímpares na sequência");
        }

        System.out.println("");
        System.out.println("[0] para voltar ao menu");
        userInput.next();
        menu();
    }
}