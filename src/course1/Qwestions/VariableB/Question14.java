package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question14
{
    public void task(ArrayList<Integer> list)
    {
        String str1 = "Из них являются средним соседних: ";

        for(int q = 1; q < list.size()-1; q++)
        {
            if(list.get(q) == (( list.get(q-1) + list.get(q+1) )/2 ) )
            {
                str1 = str1 + list.get(q) + " ";
            }
        }

        System.out.println(str1);
    }
}
