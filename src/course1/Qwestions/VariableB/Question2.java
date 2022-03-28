package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question2
{
    public void task(ArrayList<Integer> list)
    {
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int q = 0; q<list.size(); q++)
        {
            list2.add(list.get(q));
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
                                            //выводим первый и последний объекты
        System.out.println("Самое большое число: " + list2.get(0));
        System.out.println("Самое маленькое число: " + list2.get(list.size()-1));
        System.out.println("");

    }
}
