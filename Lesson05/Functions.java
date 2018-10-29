import java.util.Scanner;

public class Functions
{
    public static void main(String[] args)
    {

    }

    public static double sqr(int x)
    {
        double y = 0;
        y = x*x;
        return y;
    }

    public static double f(int n)
    {
        return 1/(1+Math.pow(n,2));
    }

    public static double max(int n1, int n2)
    {
        if(n1 > n2)
        {
            return n1;
        }
        else if(n1 < n2)
        {
            return n2;
        }
        else
        {
            return 0;
        }
    }

    public static double poly3(double a, double b, double c, double d, double x)
    {
        return a*Math.pow(x,3) + b*Math.pow(x, 2) + c*x + d;
    }

    public static int fact(int m)
    {
        int factorialValue = 1;

        for(int i = 1; i <= m; i++)
        {
            factorialValue *= i; 
        }

        return factorialValue;
    }

    public static int getIntPos(int x)
    {

        Scanner userInput = new Scanner(System.in);
        String msg = "Por favor introduz um valor positivo: ";
        
        System.out.print(msg);

        if(x < 0)
        {
            return 0;
        }
        else
        {
            return x;
        }
    }

    public static boolean getIntRange(int n1, int n2)
    {
        Scanner userInput = new Scanner(System.in);
        int x = 0;
        
        System.out.print("Introduza um valor: ");
        x = userInput.nextInt();

        if(n1 < n2)
        {
            if(x >= n1 && x <= n2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if(x >= n2 && x <= n1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public static void printNTimes(int n, String msg)
    {
        for(int i = 1; i <= n; i++)
        {
            System.out.print(msg);
        }
    }
}