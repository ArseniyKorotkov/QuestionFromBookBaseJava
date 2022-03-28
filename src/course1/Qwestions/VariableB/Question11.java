package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question11
{
    public void task(ArrayList<Integer> list5)
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> happyList = new ArrayList<>();

        int kvadroSum = 0;

        for(int z = 0; z < list5.size(); z++)
        //перебор чисел на счастливость
        {
            int happyNumber = list5.get(z);

            int happyNumber2 = happyNumber;
            //System.out.print(happyNumber2 + " ");

            for(int q = 0; q < 1000; q++)
            //количество итераций проверки
            {
                String happyNumberStr = String.valueOf(happyNumber2);
                list.clear();

                for(int w = 0; w < happyNumberStr.length(); w++)
                //разложение числа на цифры и внесение их в лист
                {
                    char a = happyNumberStr.charAt(w);
                    String b = Character.toString(a);
                    if (!b.equals("-"))
                    {
                        int c = Integer.parseInt(b);

                        list.add(c);
                    }

                }

                kvadroSum = 0;

                for(int e = 0; e < list.size(); e++)
                //сложение квадратов чисел
                {
                    int kvadro = ( list.get(e) * list.get(e) );
                    kvadroSum += kvadro;
                }

                if(kvadroSum == 1)
                {
                    break;
                }

                happyNumber2 = kvadroSum;

            }

            if(kvadroSum == 1)
            {
                happyList.add(happyNumber);
                //System.out.print(happyNumber + " ");
            }
        }

        System.out.print("Из них счастливые: ");

        for(int w = 0; w < happyList.size(); w++)
        //вывод счастливых чисел на монитор
        {
            System.out.print(happyList.get(w) + " ");
        }

        System.out.println();
    }
}
