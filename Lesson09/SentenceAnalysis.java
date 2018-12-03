import java.util.Scanner;

public class SentenceAnalysis
{
    static Scanner userInput = new Scanner(System.in);
    static String sentence;
    public static void main(String[] args)
    {
        System.out.println("Analise de uma frase");
        System.out.print("Frase de entrada -> ");
        sentence = userInput.nextLine();
        System.out.println("Número de caracteres minúsculos -> " + countLowerCase(sentence));
        System.out.println("Número de caracteres maiúsculos -> " + countUpperCase(sentence));
        System.out.println("Número de caracteres numéricos -> " + countNumeric(sentence));
        System.out.println("Número de vogais ->" + countVowel(sentence));
        System.out.println("Número de consoantes ->" + (countLowerCase(sentence) + countUpperCase(sentence) - countVowel(sentence)));
    }

    public static int countLowerCase(String x)
    { 
        int lowerCaseNum = 0;

        for(int i = 0; i < x.length(); i++)
        {
            if(Character.isLowerCase(x.charAt(i)))
            {
                lowerCaseNum++;
            }
        }

        return lowerCaseNum;
    }

    public static int countUpperCase(String x)
    { 
        int upperCaseNum = 0;

        for(int i = 0; i < x.length(); i++)
        {
            if(Character.isUpperCase(x.charAt(i)))
            {
                upperCaseNum++;
            }
        }

        return upperCaseNum;
    }
    public static int countNumeric(String x)
    { 
        int numericNum = 0;

        for(int i = 0; i < x.length(); i++)
        {
            if(Character.isDigit(x.charAt(i)))
            {
                numericNum++;
            }
        }

        return numericNum;
    }

    public static boolean isVowel(char c)
    {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(int i = 0; i < vowels.length; i++)
        {
            if(Character.toLowerCase(c) == vowels[i])
            {
                return true;
            }
        }

        return false;
    }

    public static int countVowel(String x)
    {
        int vowelNum = 0;

        for(int i = 0; i < x.length(); i++)
        {
            if(isVowel(x.charAt(i)))
            {
                vowelNum++;
            }
        }

        return vowelNum;
    }
}