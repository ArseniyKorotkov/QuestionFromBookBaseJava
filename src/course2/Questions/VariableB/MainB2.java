package course2.Questions.VariableB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainB2
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Введите три числа - первые 2 для определения интервала, третье от 1 до 12" +
                " - значение на проверку принадлежности к интервалу : ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            try
            {
                String str1 = reader.readLine();
                int n = Integer.parseInt(str1);
                String str2 = reader.readLine();
                int m = Integer.parseInt(str2);
                String str3 = reader.readLine();
                int k = Integer.parseInt(str3);

                System.out.println("n = " + n);
                System.out.println("m = " + m);
                System.out.println("k = " + k);

                new Question1().task(n, m, k);
                new Question2().task(k);
                new Question3().task(n, m, k);
                new Question4().task(k);

                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Попробуйте еще раз ввести три ЧИСЛА!");
            }
        }


    }
}
