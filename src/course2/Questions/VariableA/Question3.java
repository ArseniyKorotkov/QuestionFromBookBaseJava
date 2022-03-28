package course2.Questions.VariableA;

import java.util.ArrayList;

public class Question3
{
    public void task(ArrayList<Integer> list)
    {
        ArrayList<Integer> list2 = new ArrayList<>(list);

        int intListSize = list.size();
        int lengthNumberSum = 0;
        for(int q = 0; q<intListSize; q++)
        {
            if(list2.get(q) < 0)
            {
                lengthNumberSum += String.valueOf(list2.get(q)).length() - 1;
            }
            else
            {
                lengthNumberSum += String.valueOf(list2.get(q)).length();
            }
        }

        double mediumLengthNumber = Double.valueOf(lengthNumberSum)/Double.valueOf(intListSize);

        System.out.print("Числа с длиной больше средней: ");

        for(int q = 0; q<intListSize; q++)
        {
            if(String.valueOf(list2.get(q)).length() > mediumLengthNumber)
            {
                System.out.print(list2.get(q) + " ");
            }
        }
        System.out.println();

        System.out.print("Числа с длиной меньше средней: ");

        for(int q = 0; q<intListSize; q++)
        {
            if(String.valueOf(list2.get(q)).length() < mediumLengthNumber)
            {
                System.out.print(list2.get(q) + " ");
            }
        }
        System.out.println();
        System.out.println();
    }
}
