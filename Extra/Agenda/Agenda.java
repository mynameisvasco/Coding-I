import java.util.Arrays;
import java.util.Scanner;

public class Agenda
{   
    public static Scanner userInput = new Scanner(System.in);

    public static int savePosition = 0; //Esta variável faz contagem da posição do contacto, é incrementada cada vez que um contacto novo é adicionado

    public static Contact[] contacts = new Contact[100];        

    public static void main(String args[])
    {
        char selection;

        do
        {
            clearConsole();
            //Mostrar menu
            System.out.println("> Gestão de uma agenda");
            System.out.println("I - Inserir um contacto");
            System.out.println("P - Pesquisar contacto por nome");
            System.out.println("E - Eliminar um contacto");
            System.out.println("M - Mostrar os contactos");
            System.out.println("O - Mostrar contactos Ordenados pelo nome");
            System.out.println("V - Validar endereços de email");
            System.out.println("A - Apagar a agenda");
            System.out.println("T - Terminar o programa");
            System.out.print("Opção -> ");
            selection = Character.toLowerCase(userInput.nextLine().charAt(0)); // Pergunta ao usuário a sua seleção

            switch(selection)
            {
                case 'i':
                    clearConsole();
                    newContact();
                    break;

                case 'p':
                    clearConsole();
                    searchByName();
                    break;

                case 'e':
                    clearConsole();
                    deleteContact();
                    break;
                
                case 'm':
                    clearConsole();
                    showContacts();
                    break;
                
                case 'o':
                    clearConsole();
                    showContactsByName();
                    break;

            }

        }
        while(selection != 't');
    }

    public static void newContact()
    {
        Contact contact = new Contact();

        System.out.println("> Adicionar contacto");

        System.out.print("Nome -> ");
        contact.name = userInput.nextLine();

        System.out.print("Morada -> ");
        contact.address = userInput.nextLine();

        System.out.print("Telefone -> ");
        contact.mobileNumber = Integer.parseInt(userInput.nextLine());

        System.out.print("Email -> ");
        contact.email = userInput.nextLine();

        //Inicializa o objecto dentro do array de obectos
        contacts[savePosition] = new Contact();

        //Atribuí o valor
        contacts[savePosition] = contact;

        //Aumenta a posição do próximo contacto a ser inserido
        savePosition++;

        clearConsole();

    }

    public static void searchByName()
    {
        String name;

        System.out.println("> Procura por nome");
        System.out.print("Nome -> ");
        name = userInput.nextLine();

        Contact contact = new Contact();

        //Pesquisa sequencial para encontrar a posição do contacto que possue o nome fornecido caso exista
        for(int i = 0; i < savePosition; i++)
        {
            //Verificar se o nome presente no array é igual ou parcialmente igual ao nome fornecido
            if(contacts[i].name.toLowerCase().contains(name.toLowerCase()))
            {
                contact = contacts[i];

                System.out.println("");
                System.out.println("Contacto encontrado!");
                System.out.println("Nome ->" + contact.name);
                System.out.println("Morada ->" + contact.address);
                System.out.println("Telefone ->" + contact.mobileNumber);
                System.out.println("Email ->" + contact.email);
                System.out.println("");
                System.out.println("[QUALQUER TECLA PARA CONTINUAR]");
                userInput.nextLine();
            }
        }


        //Caso o objecto contacto seja nulo quer dizer que não existe um contacto com o nome igual ou semelhante no array
        if(contact.name == null)
        {
            System.out.println("Contacto não encontrado - [QUALQUER TECLA PARA CONTINUAR]");
            userInput.nextLine();
            clearConsole();
        }
    }

    public static void deleteContact()
    {
        int mobileNumber;

        System.out.println("> Eliminar um contacto por número de telefone");
        System.out.print("Telefone -> ");
        mobileNumber = Integer.parseInt(userInput.nextLine());

        Contact contact = new Contact();

        //Pesquisa sequencial
        for(int i = 0; i < savePosition; i++)
        {
            if(contacts[i].mobileNumber == mobileNumber)
            {
                contact = contacts[i];

                //Se tiver sido encontrado no array deve ser eliminado
                contacts[i] = null;
                savePosition -= 1;

                if(savePosition > 0)
                {
                    for(int k = i; k < savePosition; k++)
                    {
                        contacts[k] = contacts[k+1];
                    }
                }

                System.out.println("Contacto apagado - [QUALQUER TECLA PARA CONTINUAR]");
                userInput.nextLine();
            }
        }

         //Caso o objecto contacto seja nulo quer dizer que não existe um contacto com o nome igual ou semelhante no array
         if(contact.name == null)
         {
             System.out.println("Contacto não encontrado - [QUALQUER TECLA PARA CONTINUAR]");
             userInput.nextLine();
             clearConsole();
         }


    }

    public static void showContacts()
    {
        System.out.println("> Mostrar contactos");

        for(int i = 0; i < savePosition; i++)
        {
            System.out.println("");
            System.out.println("Posição -> " + (i + 1));
            System.out.println("Nome -> " + contacts[i].name);
            System.out.println("Morada -> " + contacts[i].address);
            System.out.println("Telefone -> " + contacts[i].mobileNumber);
            System.out.println("Email -> " + contacts[i].email);
            System.out.println("");
            System.out.println("##############");
        }

        System.out.println("[QUALQUER TECLA PARA CONTINUAR]");
        userInput.nextLine();
    }

    public static void showContactsByName()
    {
        System.out.println("> Mostrar contactos por nome");

        //Criar um novo array com os nomes dos contactos
        String[] names = new String[savePosition];

        for(int i = 0; i < savePosition; i++)
        {
            names[i] = contacts[i].name;
        }

        //Organizar o array por ordem alfabética
        Arrays.sort(names);

        //Imprimir os dados de cada nome
        for(int k = 0; k < savePosition; k++)
        {
            for(int j = 0; j < savePosition; j++)
            {
                if(contacts[j].name.toLowerCase().equals(names[k].toLowerCase()))
                {
                    System.out.println("");
                    System.out.println("Nome -> " + contacts[j].name);
                    System.out.println("Morada -> " + contacts[j].address);
                    System.out.println("Telefone -> " + contacts[j].mobileNumber);
                    System.out.println("Email -> " + contacts[j].email);
                    System.out.println("");
                    System.out.println("##############");
                }
            }
        }

        System.out.println("[QUALQUER TECLA PARA CONTINUAR]");
        userInput.nextLine();
    }

    public static boolean validateEmails()
    {

        return true;
    }

    public static void clearConsole()
    {
        System.out.println(new String(new char[50]).replace("\0", "\r\n")); 
    }
}

class Contact
{
    String name,address,email;
    int mobileNumber;
}