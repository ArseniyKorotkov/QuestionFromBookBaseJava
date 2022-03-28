package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question8
{
    public void task(ArrayList<Integer> list)
    {
        boolean key = false;
        String cell = "Простыми из них являются: ";

        for(int q = 0; q < list.size(); q++)
        {
            for(int w = 1; w <= list.get(q); w++)
            {
               if(   (list.get(q) % w != 0) || ( (list.get(q) % w == 0) && (w == 1) ) ||
                       ( (list.get(q) % w == 0) && (w == list.get(q)) ) )
               {
                   key = true;
               }
               else
               {
                   key = false;
                   w = list.get(q) + 1;
               }
            }


            if(key)
            {
                cell = cell + (list.get(q))+ " ";
            }

        }
        System.out.println(cell);
    }
}
