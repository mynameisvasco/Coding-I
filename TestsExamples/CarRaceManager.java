import java.util.Scanner;

public class CarRaceManager
{
    public static Scanner userInput = new Scanner(System.in);
    public static int carNumber = 0;
    public static Driver[] drivers = new Driver[10];

    public static void main(String args[])
    {
        int selection;

        do
        {
            System.out.println("Gestão de uma prova automóvel");
            System.out.println("1 - Inserir informação dos pilotos");
            System.out.println("2 - Listar pilotos ordenados pelo número da viatura");
            System.out.println("3 - Alterar informação de um piloto");
            System.out.println("4 - Remover piloto com base no número da viatura");
            System.out.println("5 - Listar pilotos ordenados pelo nome");
            System.out.println("6 - Remover piloto(s) com base no nome");
            System.out.println("7 - Validar matriculas");
            System.out.println("8 - Terminar o programa");
            System.out.println("");
            System.out.print("Opção -> ");
            selection = Integer.parseInt(userInput.nextLine());
            System.out.println("");

            if(selection > 8 || selection < 1)
            {
                System.out.println("");
                System.out.println("[ -> Opção inválida <- ]");
                System.out.println("");
            }
            else
            {
                switch(selection)
                {
                    case 1:
                        newDriver();
                        break;
                    
                    case 2:
                        listByCarNum();
                        break;
                    
                    case 3:
                        editDriverByCarNum();
                        break;
                }
            }
        }
        while(selection != 8);
    }

    public static void newDriver()
    {
        Driver driver = new Driver();

        System.out.print("Nome: ");
        driver.name = userInput.nextLine();

        carNumber++;
        driver.carNumber = carNumber;

        System.out.print("Matrícula do carro: ");
        driver.carSign = userInput.nextLine();

        drivers[carNumber - 1] = new Driver();
        drivers[carNumber - 1] = driver;
        
        System.out.println("");
    }

    public static void listByCarNum()
    {
        if(carNumber > 0)
        {
            Driver[] sortedDrivers = new Driver[drivers.length];
            
            for(int x = 0; x < drivers.length; x++)
            {
                sortedDrivers[x] = new Driver();
                sortedDrivers[x] = drivers[x];
            }

            Driver tmp;

            for(int i = 0; i < carNumber - 1; i++)
            {
                for(int j = i + 1; j < carNumber; j++)
                {
                    if(sortedDrivers[i].carNumber < sortedDrivers[j].carNumber)
                    {
                        tmp = sortedDrivers[i];
                        sortedDrivers[i] = sortedDrivers[j];
                        sortedDrivers[j] = tmp;
                    }
                }
            }

            for(int i = 0; i < carNumber; i++)
            {
                System.out.println("----------------------");
                System.out.println("Nome: " + sortedDrivers[i].name);
                System.out.println("Número do carro: " + sortedDrivers[i].carNumber);
                System.out.println("Matrículo do carro: " + sortedDrivers[i].carSign);
                System.out.println("----------------------");
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Sem pilotos ainda");
        }
    }

    public static void editDriverByCarNum()
    {
        int searchCarNum;
        Driver foundDriver = new Driver();

        System.out.print("Introduza o número do carro: ");
        searchCarNum = Integer.parseInt(userInput.nextLine());
        
        for(int i = 0; i < carNumber; i++)
        {
            if(searchCarNum == drivers[i].carNumber)
            {
                System.out.print("Nome: ");
                foundDriver.name = userInput.nextLine();

                foundDriver.carNumber = drivers[i].carNumber;

                System.out.print("Matrícula do carro: ");
                foundDriver.carSign = userInput.nextLine();

                drivers[i] = foundDriver;
                
                System.out.println("");
            }
        }
    }
}

class Driver
{
    int carNumber;
    String carSign;
    String name;
}

