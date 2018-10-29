import java.util.Vector;

public class IntNumbers
{
    public static void main(String[] args)
    {
        int i = 0;
        Vector<Integer> integersList = new Vector();

        integersList.add(1);
        integersList.add(42);
        integersList.add(123);
        integersList.add(55);
        integersList.add(84);
        integersList.add(-40);
        integersList.add(214);
        integersList.add(-219);

        while(i <= integersList.size())
        {
            if(integersList.get(i) < 0)
            {
                System.out.println("Foram introduzidos  " + (i + 1) + " números");
                break;
            }
            i++;
        }
    }
}