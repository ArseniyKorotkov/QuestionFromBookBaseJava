package course2.Questions.Tests;

public class Quest26
{
    public static void main(String[] args)
    {
        int i = 1;
        int sum = 0;

        for( ; i<=100; i++)
        {
            sum += i;
        }
        System.out.println("sum1 = "+sum);

        sum = 0;

        for(i = 1; i<=100; )
        {
            sum += i++;
        }

        System.out.println("sum2 = "+sum);

        sum = 0;
        //for(i = 1, sum = 0; i <= 100; sum += i+, i++)
        {
            //                                  ^вот ошибка
        }
        System.out.println("sum3 = "+sum);

        sum = 0;
        for(i = 1, sum = 0; i <= 100; sum += i++)
        {

        }
        System.out.println("sum4 = "+sum);

        sum = 0;
        //for(i = 0, sum = 0;i++, i <= 100; sum += i)
        {
            //                ^вот ошибка
        }
        System.out.println("sum5 = "+sum);


    }
}
