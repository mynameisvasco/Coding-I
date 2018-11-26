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
        System.out.println("Introduza o nome do ficheiro: ");
        fileName = userInput.nextLine();

        File fileObject = new File(fileName);

        if(validateFile(fileObject))
        {
            Scanner fileScanner = new Scanner(fileObject);
            Data fileData = new Data();
            fileData.max = Double.NaN;
            fileData.min = Double.NaN;
            fileData.quadsum = 0;
            fileData.sum = 0;

            double x; 
            do
            {
                x = fileScanner.nextDouble();

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

            System.out.println(fileData.max);
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