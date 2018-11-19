import java.util.Scanner;
import java.io.*;

public class JavaComentsRemover
{
    static Scanner userInput = new Scanner(System.in);

    public static void main()
    {
        String fileName;
        String newFileName;

        System.out.print("Nome do ficheiro de entrada: ");
        fileName = userInput.nextLine();

        System.out.print("Nome do ficheiro de saída: ");
        newFileName = userInput.nextLine();

        File fileObject = new File(fileName);

        if(ReadFile.validateFile(fileObject))
        {
            Scanner fileScanner = new Scanner(fileObject);
            String[] fileLines = new String[fileObject.length()];
            int i = 0;

            while(fileScanner.hasNextLine())
            {
                fileLines[i] = fileScanner.nextLine();
            }

            for(int k = 0; k <= fileLines.length; k++)
            {
                if(fileLines[k].contains("//") || (fileLines[k].contains("/**") && fileLines[k].contains("*/")))
                {
                    fileLines[k] = "";
                }
            }

            File newFile = new File(newFileName);
            newFile.createNewFile();

            FileWriter writeFile = new FileWriter(newFile);

            for(int j = 0; k <= fileLines.length; k++)
            {
                writeFile.write(j);
            }
        }
    }
}