package course1.Qwestions.VariableB;


import java.util.ArrayList;

public class Question1
{
    public void task(ArrayList<Integer> list)
    {
        String even = "Четные числа: ";
        String odd = "Нечетные числа: ";


        for (int q = 0; q < list.size(); q++)//перебираем числа
        {
            int e = list.get(q);
            if (e % 2 == 0)       //находим делящиеся на 2 без остатка
            {
                even = even + e + " ";
            }
            else                  //остальные числа отправляем к нечетным
            {
                odd = odd + e + " ";
            }
        }
        System.out.println(even);
        System.out.println(odd);
        System.out.println(" ");
    }
}
