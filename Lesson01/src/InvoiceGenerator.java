import java.util.Scanner;

public class InvoiceGenerator
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        double productValue = 0;
        double discount = 0;
        double VAT = 0;

        System.out.print("Valor em Euros dos produtos: ");
        productValue = userInput.nextDouble();

        System.out.print("Valor em percentagem do desconto: ");
        discount = userInput.nextDouble();

        System.out.print("Valor em percentagem dos IVA: ");
        VAT = userInput.nextDouble();

        System.out.printf("Total a pagar: %4.2f Euros", finalPrice(productValue, discount, VAT));
    }

    private static double finalPrice(double productValue, double discount, double VAT)
    {
        return productValue - (productValue*(discount/100)) + (productValue*(VAT/100));
    }
}
