package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question4
{
    public void task(ArrayList<Integer> list)
    {
        String crat5 = "Числа делящиеся на 5: ";
        String crat7 = "Числа делящиеся на 7: ";

        for(int q = 0; q < list.size(); q++) //перебираем числа
        {
            if(list.get(q)%5 == 0)     //находим делящиеся на 5 без остатка
            {
                crat5 = crat5 + list.get(q) + " ";
            }

            if(list.get(q)%7 == 0)     //находим делящиеся на 7 без остатка
            {
                crat7 = crat7 + list.get(q) + " ";
            }
        }
        System.out.println(crat5);
        System.out.println(crat7);
        System.out.println("");

    }
}
