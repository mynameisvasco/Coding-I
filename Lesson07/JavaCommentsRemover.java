import java.util.Scanner;
import java.io.*;

public class JavaCommentsRemover
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String args[]) throws IOException
    {
        String fileName;
        String newFileName;
        int fileLinesNumber = 0;

        System.out.println("-> Remover comentário de um ficheiro .java <-");
        System.out.print("Nome do ficheiro de entrada: ");
        fileName = userInput.nextLine();

        System.out.print("Nome do ficheiro de saída: ");
        newFileName = userInput.nextLine();

        File fileObject = new File(fileName);

        if(ReadFile.validateFile(fileObject))
        {
            Scanner fileScanner = new Scanner(fileObject);
            String currentLine;

            while(fileScanner.hasNextLine())
            {
                currentLine = fileScanner.nextLine();
                fileLinesNumber++;
            }

            String[] fileLines = new String[fileLinesNumber];
            
            fileScanner.close();


            fileScanner = new Scanner(fileObject);

            while(fileScanner.hasNextLine())
            {
                for(int i = 0; i < fileLinesNumber; i++)
                {
                    currentLine = fileScanner.nextLine();
                    fileLines[i] = currentLine;
                }
            }
            for(int k = 0; k < fileLines.length; k++)
            {
                if(fileLines[k].contains("//") || (fileLines[k].contains("/**") && fileLines[k].contains("*/")) || fileLines[k].contains("*"))
                {
                    System.out.println(k);
                    fileLines[k] = "$$$$$$$$$$$$$ THIS IS A COMMENT $$$$$$$$$$$$$";
                }
            }

            fileScanner.close();

            File newFile = new File(newFileName);
            newFile.createNewFile();

            FileWriter writeFile = new FileWriter(newFile);

            for(int j = 0; j < fileLinesNumber; j++)
            {
                if(fileLines[j] != "$$$$$$$$$$$$$ THIS IS A COMMENT $$$$$$$$$$$$$")
                {
                    writeFile.write(fileLines[j]);
                    writeFile.write("\n");
                }
            }

            writeFile.close();
        }
        else
        {
            System.out.println("Ficheiro não encontrado ou sem premissão de leitura");
        }
    }
}