import java.util.Scanner;
import java.util.Vector;

public class LocalalityDistance
{
    private static int scale = 0;

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        Vector<Double> fromLocation = new Vector<>();
        Vector<Double> toLocation = new Vector<>();

        System.out.println("Escreva a escala que pretende utilizar");
        System.out.print("A quantos kilometros corresponde 1 cm no mapa?: ");
        scale = userInput.nextInt();
        System.out.println("Escreva as coordenadas da localidade de partida");
        System.out.print("Coordenada X: ");
        fromLocation.add(userInput.nextDouble());
        System.out.print("Coordenada Y: ");
        fromLocation.add(userInput.nextDouble());
        System.out.println(" ");
        System.out.println("Escreva as coordenadas da localidade de chegada");
        System.out.print("Coordenada X: ");
        toLocation.add(userInput.nextDouble());
        System.out.print("Coordenada Y: ");
        toLocation.add(userInput.nextDouble());

        System.out.print("A distância em linha reta entre os dois pontos é de " + calculateDistance(fromLocation, toLocation) + " kM");

    }

    private static double calculateDistance(Vector<Double> fromLocation, Vector<Double> toLocation)
    {
        return Math.sqrt(Math.pow((fromLocation.get(0) - toLocation.get(0)), 2) + Math.pow((fromLocation.get(1) - toLocation.get(1)), 2)) * scale;
    }
}

