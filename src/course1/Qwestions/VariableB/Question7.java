package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question7
{
    public void task(ArrayList <Integer> list)
    {
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int q = 0; q<list.size(); q++)
        {
            list2.add(list.get(q));
        }

        for (int t = 0; t<list2.size(); t++)
        {
            if(list2.get(t) < 0)   //подставляем модули на меcто отрицательных чисел
            {
                list2.add(t, list2.get(t) * (-1));
                list2.remove(t+1);
            }
        }


        for(int q = 0; q<list2.size(); q++)//расставляем числа по убыванию методом пузырька
        {
            for(int w = 0; w<(list2.size()-1); w++)
            {
                if(list2.get(w) < list2.get(w+1))
                {
                    list2.add(w, list2.get(w+1));
                    list2.remove(w+2);
                }
            }
        }


        boolean p = false;//переключатель события
        int NOD;//наибольший общий делитель

        //перебор от самого маленького числа в потоке до нахождения НОД
        for(NOD = list2.get(list2.size()-1); NOD>=1;)
        {
            if(p)//сработает только если все числа прошли проверку
            {
                System.out.println("Наибольший общий делитель: " + NOD);
                break;
            }

            for (int w = 0; w < list2.size(); w++)//проверка чисел на деление на НОД без остатака
            {
                if (list2.get(w) % NOD == 0)
                {
                    p = true;
                }
                else//если одно из чисел не проходит проверку
                {
                    p = false; //переключатель выключается
                    w = list2.size(); //проверка чисел на деление на текущий НОД заканчивается
                    NOD--; //НОД становится на единицу меньше
                }
            }
        }//конец поиска наибольшего общего делителя





        boolean p2 = false;//переключатель события
        int NOK;//наменьшее общее кратное

        //перебор от самого большого числа в потоке до нахождения НОК
        for(NOK = list2.get(0); NOK>=0;)
        {
            if(p2)//сработает только если все числа прошли проверку
            {
                System.out.println("Наменьшее общее кратное: " + NOK);
                break;
            }

            for (int w = 0; w < list2.size(); w++)//проверка чисел на деление на НОК без остатака
            {
                if (NOK % list2.get(w)  == 0)
                {
                    p2 = true;
                }
                else//если одно из чисел не проходит проверку
                {
                    p2 = false; //переключатель выключается
                    w = list2.size(); //проверка чисел на деление на текущий НОК заканчивается
                    NOK++; //НОК становится на единицу больше
                }
            }
        }//конец поиска наименьшего общего кратного

        System.out.println("");





    }
}
