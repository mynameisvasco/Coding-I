import java.io.*;
import java.util.Scanner;

public class DoStats
{
    static Scanner userInput = new Scanner(System.in);
    static double dataAvarage;
    static double dataVariance;
    public static void main(String[] args) throws IOException
    {
        String fileName;
        int userSelection;
       
        System.out.print("Introduza o nome do ficheiro: ");
        fileName = userInput.nextLine();
        File fileObject = new File(fileName);

        System.out.print("Adicionar número real ao ficheiro? [0] Não | [1] Sim ");
        userSelection = userInput.nextInt();

        while(userSelection == 1)
        {
            String numberToAdd;
            System.out.print("Insira um número real (escreva exit para sair): ");
            numberToAdd = userInput.nextLine();
            if(numberToAdd.equals("exit"))
            {
                userSelection = 0;
            }
            
            try
            {
                Integer.parseInt(numberToAdd);
                updateStats(fileObject, numberToAdd);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Introduza um número, não uma palavra.");
            }
        }

        if(validateFile(fileObject))
        {
            Scanner fileScanner = new Scanner(fileObject);
            Data fileData = new Data();
            fileData.quadsum = 0;
            fileData.sum = 0;
            fileData.count = 0;

            double x; 
            do
            {
                x = fileScanner.nextDouble();

                if(fileData.count == 0)
                {
                    fileData.max = x;
                    fileData.min = x;
                }

                if(x > fileData.max)
                {
                    fileData.max = x;
                }
                if(x < fileData.max)
                {
                    fileData.min = x;
                }

                fileData.sum += x;
                fileData.quadsum += Math.pow(x, 2);
                fileData.count++;
            }
            while(fileScanner.hasNextLine());

            fileScanner.close();

            System.out.println("Número máximo: " + fileData.max);
            System.out.println("Número mínimo: " + fileData.min);
            System.out.println("Média: " + mean(fileData));
            System.out.println("Variancia: " + variance(fileData));
            System.out.println("Número de números no ficheiro: " + fileData.count);
        }
    }

    public static double mean(Data dados)
    {
        double dataAvarage = 0;

        dataAvarage = dados.sum/dados.count;

        return dataAvarage;
    }

    public static double variance(Data dados)
    {
        double dataVariance;

        dataVariance = dados.quadsum/(dados.count - Math.pow(dataAvarage,2));

        return dataVariance;
    }

    public static void updateStats(File fileObject, String x)  throws IOException
    {
        FileWriter writeFile = new FileWriter(fileObject,true);

        writeFile.write('\n');
        writeFile.write(x);

        writeFile.close();
    }

    public static boolean validateFile(File fileObject)
    {
        if(fileObject.isFile() && fileObject.canRead())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Data
{
    double max,min,sum,quadsum;
    int count;
}