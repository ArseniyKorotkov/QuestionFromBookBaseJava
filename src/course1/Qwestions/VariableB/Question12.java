package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question12
{
    public void task(ArrayList<Integer> list)
    {
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(1);
        fibonacci.add(2);

        String str = "Из них из последовательности Фибоначчи: ";

        for(int q = 0; q < 45; q++)
        {
            fibonacci.add(fibonacci.get(q) + fibonacci.get(q+1) );
        }

        for(int q = 0; q < 45; q++)
        {
            for(int w = 0; w < list.size(); w++)
            {
                if(list.get(w) == fibonacci.get(q))
                {
                    str = str + list.get(w) + " ";
                }
            }
        }
        System.out.println(str);

    }
}
