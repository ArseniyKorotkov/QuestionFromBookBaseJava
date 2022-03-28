package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question5
{
    public void task(ArrayList<Integer> list)
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

        System.out.print("Те же числа по убыванию модулей: ");

        for(int r = 0; r<list2.size(); r++)
        {
            System.out.print(list2.get(r) + " ");
        }

        System.out.println("");




    }
}
