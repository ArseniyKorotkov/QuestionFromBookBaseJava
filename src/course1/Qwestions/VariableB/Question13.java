package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question13
{
    public void task(ArrayList<Integer> list)
    {
        String str1 = "Из них из полиндромы(кроме однозначных): ";

        for(int q = 0; q < list.size(); q++)
        {
            String str = list.get(q).toString();
            String strReverse = new StringBuffer(str).reverse().toString();

            if(str.equals(strReverse) && str.length()!=1)
            {
                str1 = str1 + list.get(q) + " ";
            }
        }
        System.out.println(str1);
    }
}
