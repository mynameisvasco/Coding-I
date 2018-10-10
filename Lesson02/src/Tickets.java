import java.util.Scanner;

public class Tickets
{
    public static void main(String[] args)
    {
        int age = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Idade: ");
        age = userInput.nextInt();

        if(age < 6)
        {
            System.out.print("Isento de pagamento");
        }
        else if(age >= 6 && age <= 12)
        {
            System.out.print("Bilhete de criança");
        }
        else if(age >= 13 && age <= 65)
        {
            System.out.print("Bilhete normal");
        }
        else if(age >= 65)
        {
            System.out.print("Bilhete da 3ª Idade");
        }

    }
}
