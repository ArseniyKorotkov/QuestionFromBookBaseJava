import java.text.DecimalFormat;
import java.util.ArrayList;

public class HappyNumber
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Long> happyList = new ArrayList<>();

        int kvadroSum = 0;
        long happyNumber;
        long happyNumberMiliard;


        DecimalFormat df = new DecimalFormat("000000000");


        for(happyNumberMiliard = 0; happyNumberMiliard < 1000_000_000; happyNumberMiliard++)
        {
            for (happyNumber = 0; happyNumber < 1_000_000_000; happyNumber++)
            //перебор чисел на счастливость
            {
                String longHappyString = df.format(happyNumberMiliard) + df.format(happyNumber);
                String longString2 = df.format(happyNumberMiliard) + df.format(happyNumber);
                System.out.print(longHappyString + " ");

                for (int q = 0; q < 100; q++)
                //количество итераций проверки
                {
                    list.clear();

                    for (int w = 0; w < longString2.length(); w++)
                    //разложение числа на цифры и внесение их в лист
                    {
                        Character a = longString2.charAt(w);
                        String b = Character.toString(a);
                        int c = Integer.parseInt(b);

                        list.add(c);
                    }

                    kvadroSum = 0;

                    for (int e = 0; e < list.size(); e++)
                    //сложение квадратов чисел
                    {
                        int kvadro = (list.get(e) * list.get(e));
                        kvadroSum += kvadro;
                    }

                    if (kvadroSum == 1)
                    {
                        break;
                    }

                    longString2 = String.valueOf(kvadroSum);

                }

                if (kvadroSum == 1)
                {
                    //happyList.add(happyNumber);
                    //System.out.print(longHappyString + " "); //RETURN!!!!
                }
            }
        }

        for(int w = 0; w < happyList.size(); w++)
        //вывод счастливых чисел на монитор
        {
            //System.out.print(happyList.get(w) + " ");
        }
    }
}
