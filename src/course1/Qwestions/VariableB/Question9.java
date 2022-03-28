package course1.Qwestions.VariableB;

import java.util.ArrayList;
import java.util.*;

public class Question9
{
    public void task(ArrayList <Integer> list)
    {
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int q = 0; q<list.size(); q++)
        {
            list2.add(list.get(q));
        }

        //ПРИМЕР СОРТИРОВКИ МАССИВА
        Integer [] noList = new Integer[list.size()];//создаем массив

        for(int q = 0; q < list2.size(); q++)
        {
            noList[q] = list2.get(q);
        }

        Arrays.sort(noList);//прямая сортировка
        Arrays.sort(noList, Collections.reverseOrder());//обратная сортировка



        //ПРИМЕР СОРТИРОВКИ КОЛЛЕКЦИИ
        Collections.sort(list2);//прямая сортировка

        System.out.print("Числа по порядку: ");
        for(int w = 0; w < list2.size(); w++)
        {
            System.out.print(list2.get(w) + " ");
        }
        System.out.println();

        Collections.reverse(list2);//переворачиваем сортировку задом на перед

        System.out.print("Числа в обратном порядке: ");
        for(int w = 0; w < list2.size(); w++)
        {
            System.out.print(list2.get(w) + " ");
        }

        System.out.println();

    }
}
