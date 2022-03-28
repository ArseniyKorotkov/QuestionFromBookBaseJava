package course1.Qwestions.VariableB;

import java.util.ArrayList;
import java.util.Collections;


public class Question10
{
    public void task(ArrayList <Integer> list)
    {
        ArrayList<Integer> listA = new ArrayList<>();
        for(int q = 0; q<list.size(); q++)
        {
            listA.add(list.get(q));
        }


        ArrayList <Integer> list2 = new ArrayList<Integer>();//содержит кол-во
        ArrayList <Integer> list3 = new ArrayList<Integer>();//содержит значение

        for(int q = 0; q < listA.size(); q++)//счетчик проверяемых
        {
            int a = 1;//счетчик  повторяемости

            for(int w = 0; w < listA.size(); )//счетчик проверяющих
            {
                if ( (listA.get(q) == listA.get(w)) && (w != q) )
                {
                    a++;
                    listA.remove(w);
                }
                else
                {
                    w++;
                }
            }

            list2.add(a);

            Collections.sort(list2);
            Collections.reverse(list2);

            for(int e = 0; e < list2.size(); e++)
            {
                if(list2.get(e) == a)
                {
                    list3.add(e, list.get(q));
                    break;
                }
            }

        }


        System.out.print("Числа по частоте встречаемости: ");

        for(int w = 0; w < list3.size(); w++)
        {
            System.out.print(list3.get(w) + " ");
        }

        System.out.println("");

    }
}
