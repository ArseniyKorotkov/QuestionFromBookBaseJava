package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question15
{
    public void task(ArrayList<Integer> list)
    {
        String str1 = "m/n для первых двух положительных чисел: ";

        for(int q = 0; q < list.size()-1; q++)
        {
            if(list.get(q) > 0 && list.get(q+1) > 0 )
            {
                double p = (double)list.get(q)/(double)list.get(q+1);
                System.out.println(str1 + p);
                break;
            }
        }
    }
}
