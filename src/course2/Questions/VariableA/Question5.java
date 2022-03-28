package course2.Questions.VariableA;

import java.util.ArrayList;

public class Question5
{
    public void task(ArrayList list)
    {
        ArrayList list2 = new ArrayList(list);

        boolean parity = true;

        String numberParityChars = "";

        for(int q = 0; q<list2.size(); q++)
        {
            for(int w = 0; w < String.valueOf(list2.get(q)).length(); w++)
            {
                int numberChar = Integer.parseInt(String.valueOf(String.valueOf(list2.get(q)).charAt(w)));
                if(numberChar % 2 != 0)
                {
                    parity = false;
                }
            }
            if(parity)
            {
                numberParityChars += list2.get(q)+" ";
            }
            parity = true;
        }
        System.out.println("Числа, содержащие только четные цифры: " + numberParityChars);




        String numberParityEqualAdd = "";

        for(int q = 0; q<list2.size(); q++)
        {
            int parityCharInNumber = 0;
            int addCharInNumber = 0;
            for(int w = 0; w < String.valueOf(list2.get(q)).length(); w++)
            {
                int numberChar = Integer.parseInt(String.valueOf(String.valueOf(list2.get(q)).charAt(w)));
                if(numberChar % 2 == 0)
                {
                    parityCharInNumber++;
                }
                else
                {
                    addCharInNumber++;
                }
            }
            if(parityCharInNumber == addCharInNumber)
            {
                numberParityEqualAdd += list2.get(q)+" ";
            }
        }

        System.out.println("Числа с равным кол-вом четных и нечетных: "+ numberParityEqualAdd);
    }
}
