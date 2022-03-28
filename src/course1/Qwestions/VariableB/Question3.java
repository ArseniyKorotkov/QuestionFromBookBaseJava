package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question3
{
    public void task(ArrayList<Integer> list)
    {
        String crat3 = "Числа делящиеся на 3: ";
        String crat9 = "Числа делящиеся на 9: ";

        for(int q = 0; q < list.size(); q++)//перебираем числа
        {
            if(list.get(q)%3 == 0)      //находим делящиеся на 3 без остатка
            {
                crat3 = crat3 + list.get(q) + " ";
            }

            if(list.get(q)%9 == 0)      //находим делящиеся на 9 без остатка
            {
                crat9 = crat9 + list.get(q) + " ";
            }
        }
        System.out.println(crat3);
        System.out.println(crat9);
        System.out.println("");

    }
}
