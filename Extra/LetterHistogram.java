import java.util.Scanner;
import java.io.*;

public class LetterHistogram
{
    static Scanner userInput = new Scanner(System.in);
    static String textFile = "";
    
    public static void main(String[] args) throws IOException
    {
        int selection;

        do
        {
            System.out.println("[1] -> Ler frase num ficheiro");
            System.out.println("[2] -> Histograma de letras");
            System.out.println("[3] -> Mostrar frase");
            System.out.println("[0] -> Sair");

            selection = userInput.nextInt();

            switch(selection)
            {
                case 1:
                    readFile();
                break;

                case 2:
                    letterHistogram();
                break;
            }
        }
        while(selection > 0 && selection < 4);
    }

    public static String readFile() throws IOException
    {
        String fileName;
        String currentLine;

        System.out.print("Nome do ficheiro: ");
        fileName = userInput.next();

        File fileObject = new File(fileName);

        if(fileObject.exists() && fileObject.canRead())
        {
            Scanner fileScanner = new Scanner(fileObject);

            while(fileScanner.hasNextLine())
            {
                currentLine = fileScanner.nextLine();

                textFile += currentLine;
            }

            fileScanner.close();

            return textFile;

        }
        else
        {
            System.out.println("-> Ficheiro inexistente ou sem permissões de leitura <-");
            return "Error";
        }
    }

    public static void letterHistogram()
    {
        LetterFreq[] textLetterFreq = new LetterFreq[26];
        textLetterFreq[0] = new LetterFreq();
        textLetterFreq[0].freq = 0;
        textLetterFreq[0].letter = 'a';
        textLetterFreq[1] = new LetterFreq();
        textLetterFreq[1].freq = 0;
        textLetterFreq[1].letter = 'b';
        textLetterFreq[2] = new LetterFreq();
        textLetterFreq[2].freq = 0;
        textLetterFreq[2].letter = 'c';
        textLetterFreq[3] = new LetterFreq();
        textLetterFreq[3].freq = 0;
        textLetterFreq[3].letter = 'd';
        textLetterFreq[4] = new LetterFreq();
        textLetterFreq[4].freq = 0;
        textLetterFreq[4].letter = 'e';
        textLetterFreq[5] = new LetterFreq();
        textLetterFreq[5].freq = 0;
        textLetterFreq[5].letter = 'f';
        textLetterFreq[6] = new LetterFreq();
        textLetterFreq[6].freq = 0;
        textLetterFreq[6].letter = 'g';
        textLetterFreq[7] = new LetterFreq();
        textLetterFreq[7].freq = 0;
        textLetterFreq[7].letter = 'h';
        textLetterFreq[8] = new LetterFreq();
        textLetterFreq[8].freq = 0;
        textLetterFreq[8].letter = 'i';
        textLetterFreq[9] = new LetterFreq();
        textLetterFreq[9].freq = 0;
        textLetterFreq[9].letter = 'j';
        textLetterFreq[10] = new LetterFreq();
        textLetterFreq[10].freq = 0;
        textLetterFreq[10].letter = 'k';
        textLetterFreq[11] = new LetterFreq();
        textLetterFreq[11].freq = 0;
        textLetterFreq[11].letter = 'l';
        textLetterFreq[12] = new LetterFreq();
        textLetterFreq[12].freq = 0;
        textLetterFreq[12].letter = 'm';
        textLetterFreq[13] = new LetterFreq();
        textLetterFreq[13].freq = 0;
        textLetterFreq[13].letter = 'n';
        textLetterFreq[14] = new LetterFreq();
        textLetterFreq[14].freq = 0;
        textLetterFreq[14].letter = 'o';
        textLetterFreq[15] = new LetterFreq();
        textLetterFreq[15].freq = 0;
        textLetterFreq[15].letter = 'p';
        textLetterFreq[16] = new LetterFreq();
        textLetterFreq[16].freq = 0;
        textLetterFreq[16].letter = 'q';
        textLetterFreq[17] = new LetterFreq();
        textLetterFreq[17].freq = 0;
        textLetterFreq[17].letter = 'r';
        textLetterFreq[18] = new LetterFreq();
        textLetterFreq[18].freq = 0;
        textLetterFreq[18].letter = 's';
        textLetterFreq[19] = new LetterFreq();
        textLetterFreq[19].freq = 0;
        textLetterFreq[19].letter = 't';
        textLetterFreq[20] = new LetterFreq();
        textLetterFreq[20].freq = 0;
        textLetterFreq[20].letter = 'u';
        textLetterFreq[21] = new LetterFreq();
        textLetterFreq[21].freq = 0;
        textLetterFreq[21].letter = 'v';
        textLetterFreq[22] = new LetterFreq();
        textLetterFreq[22].freq = 0;
        textLetterFreq[22].letter = 'w';
        textLetterFreq[23] = new LetterFreq();
        textLetterFreq[23].freq = 0;
        textLetterFreq[23].letter = 'x';
        textLetterFreq[24] = new LetterFreq();
        textLetterFreq[24].freq = 0;
        textLetterFreq[24].letter = 'y';
        textLetterFreq[25] = new LetterFreq();
        textLetterFreq[25].freq = 0;
        textLetterFreq[25].letter = 'z';
    
        for(int i = 0; i < textFile.length(); i++)
        {
            for(int k = 0; k < textLetterFreq.length; k++)
            {
                if(textFile.charAt(i) == textLetterFreq[k].letter)
                {
                    textLetterFreq[k].freq += 1;
                }
            }
        }

        for(int o = 0; o < textLetterFreq.length; o++)
        {
            System.out.print("[ "+ textLetterFreq[o].letter +" ] -> ");
            
            for(int y = 1; y <= textLetterFreq[o].freq; y++)
            {
                System.out.print("*");
            }

            System.out.print(" " + "("+ textLetterFreq[o].freq +" vezes)");
            System.out.println("");
        }

    }
}

class LetterFreq
{
    char letter;
    int freq;
}