package course2.Questions.VariableA;

import java.util.ArrayList;

public class Question8
{
    public void task(ArrayList<Integer> list)
    {
        ArrayList <Integer> list2 = new ArrayList<Integer>(list);
        int counter = 0;
        String answer = "";

        for(int q = 0; q<list2.size(); q++)
        {
            String str1 = String.valueOf(list2.get(q));
            String str2 = new StringBuffer(str1).reverse().toString();
            if(str1.equals(str2) && counter < 2 && String.valueOf(list2.get(q)).length()>1)
            {
                answer = String.valueOf(list2.get(q));
                counter++;
            }
        }
        if(counter > 1)
        {
            System.out.println("Второе полиндромное число (кроме однозначных) в списке: " + answer);
        }
        else
        {
            System.out.println("Единственное полиндромное число (кроме однозначных) в списке: " + answer);
        }
        System.out.println();
    }
}
