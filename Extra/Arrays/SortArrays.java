public class SortArrays
{
    public static void main(String args[])
    {
        int[] numbers = new int[] {7,3,5,120,-12,402,-122,12,23,45};
        String[] words = new String[] {"mesa", "cadeira", "janela", "portão", "asa", "andar", "aula", "barco"};
        for(int i = 0; i < words.length; i++)
        {
            System.out.println(sortAlphaBetic(words)[i]);
        }
    }

    public static int[] sortAsc(int[] numbers)
    {
        int tmp;
        for(int i = 0; i < numbers.length; i++)
        {
            for(int k = i; k < numbers.length; k++)
            {
                if(numbers[i] > numbers[k])
                {
                    tmp = numbers[k];
                    numbers[k] = numbers[i];
                    numbers[i] = tmp;
                }
                else
                {
                    continue;
                }
            }
        }

        return numbers;
    }

    public static int[] sortDesc(int[] numbers)
    {
        int tmp;
        for(int i = 0; i < numbers.length; i++)
        {
            for(int k = i; k < numbers.length; k++)
            {
                if(numbers[i] < numbers[k])
                {
                    tmp = numbers[k];
                    numbers[k] = numbers[i];
                    numbers[i] = tmp;
                }
                else
                {
                    continue;
                }
            }
        }

        return numbers;
    }

    public static String[] sortAlphaBetic(String[] words)
    {
        String tmp;

        for(int i = 0; i < words.length; i++)
        {
            for(int k = i; k < words.length; k++)
            {
                int p = 0;

                if(words[i].charAt(p) > words[k].charAt(p))
                {
                    tmp = words[i];
                    words[i] = words[k];
                    words[k] = tmp;
                }
                else if(words[i].charAt(p) == words[k].charAt(p))
                {
                    if(p > words[i].length() && p > words[i].length())
                    {
                        p++;
                        while(words[i].charAt(p) > words[k].charAt(p))
                        {
                            tmp = words[i];
                            words[i] = words[k];
                            words[k] = tmp;
                        }
                    }
                }
            }
        }
        return words;
    }
}