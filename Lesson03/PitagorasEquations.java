import java.util.Scanner;

public class PitagorasEquations 
{
    public static void main(String[] args)
    {
        int a;
        int b;
        int c;
        
        for(a = 1; a < 100; a++)
        {
            for(b = 1; b < 100; b++)
            {
                if(a < b)
                {
                    for(c = 1; c < Math.pow(100, 2) + Math.pow(100, 2); c++)
                    {
                        if(Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c,2))
                        System.out.println("a = " + a + " |  b = " + b + " |  c = " + c);
                    }
                }
            }
        }
    }
}