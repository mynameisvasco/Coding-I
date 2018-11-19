import java.util.Scanner;
import java.io.*;

public class ReadFile
{
    static Scanner userInput = new Scanner(System.in);

    //TEST 
    public static void main(String args[]) throws IOException
    {
        System.out.print("Nome do fincheiro: ");
        String fileName = userInput.nextLine();
        File fileObject = new File(fileName);

        if(validateFile(fileObject))
        {
            Scanner fileScanner = new Scanner(fileObject);
            
            while(fileScanner.hasNextLine())
            {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        }
        else
        {
            System.out.println("Ficheiro não encontrado ou sem premissão de leitura");
        }

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