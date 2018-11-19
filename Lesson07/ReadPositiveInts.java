import java.util.Scanner;
import java.io.*;

public class ReadPositiveInts
{
    public static void main(String args[]) throws IOException
    {
        String fileName = args[0];
        File fileObject = new File(fileName);
        int totalReadNumbers = 0;

        if(ReadFile.validateFile(fileObject))
        {
            Scanner fileScanner = new Scanner(fileObject);
            
            while(fileScanner.hasNextInt() && totalReadNumbers <100)
            {
                int x = fileScanner.nextInt();
                
                if (x > 0)
                {
                    totalReadNumbers++;
                    System.out.println(x);
                }
            }
            
            fileScanner.close();
        }
        else
        {
            System.out.println("Ficheiro não encontrado ou sem premissão de leitura.");
        }
    }
}