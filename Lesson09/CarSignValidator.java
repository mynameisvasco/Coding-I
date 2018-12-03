import java.util.Scanner;

public class CarSignValidator
{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {
        String carSign;
        int pattern;

        System.out.print("Introduza a matrícula do carro: ");
        carSign = userInput.nextLine();
        System.out.println("Qual o padrão?");
        System.out.println("AA-00-00 -> 1");
        System.out.println("00-AA-00 -> 2");
        System.out.println("00-00-AA -> 3");
        System.out.print("Selecionar: ");
        pattern = userInput.nextInt();

        if(matchPattern(carSign, pattern))
        {
            System.out.println("Matrícula válida");
        }
        else
        {
            System.out.println("Matrícula inválida");
        }

    }

    public static boolean matchPattern(String carSign, int pattern)
    {
        boolean firstCode, secondCode, thirdCode, divider0, divider1;
        switch(pattern)
        {
            case 1:
                firstCode = Character.isAlphabetic(carSign.charAt(0)) && Character.isAlphabetic(carSign.charAt(1));
                divider0 = carSign.charAt(2) == '-';
                secondCode = Character.isDigit(carSign.charAt(3)) && Character.isDigit(carSign.charAt(4));
                divider1 = carSign.charAt(5) == '-';
                thirdCode = Character.isDigit(carSign.charAt(6)) && Character.isDigit(carSign.charAt(7));
                if(firstCode && secondCode && thirdCode)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            
            case 2:
                firstCode = Character.isDigit(carSign.charAt(0)) && Character.isDigit(carSign.charAt(1));
                divider0 = carSign.charAt(2) == '-';
                secondCode = Character.isAlphabetic(carSign.charAt(3)) && Character.isAlphabetic(carSign.charAt(4));
                divider1 = carSign.charAt(5) == '-';
                thirdCode = Character.isDigit(carSign.charAt(6)) && Character.isDigit(carSign.charAt(7));
                if(firstCode && secondCode && thirdCode)
                {
                    return true;
                }
                else
                {
                    return false;
                }

            case 3:
                firstCode = Character.isDigit(carSign.charAt(0)) && Character.isDigit(carSign.charAt(1));
                divider0 = carSign.charAt(2) == '-';
                secondCode = Character.isDigit(carSign.charAt(3)) && Character.isDigit(carSign.charAt(4));
                divider1 = carSign.charAt(5) == '-';
                thirdCode = Character.isAlphabetic(carSign.charAt(6)) && Character.isAlphabetic(carSign.charAt(7));
                if(firstCode && secondCode && thirdCode)
                {
                    return true;
                }
                else
                {
                    return false;
                }

            default:
                return false;
        }
        
    }
}