package course2.Questions.VariableA;

import java.util.ArrayList;

public class Question6
{
    public void task(ArrayList list) throws InterruptedException
    {
        ArrayList <Integer> list2 = new ArrayList(list);
        boolean up = false;
        String answer = "";

        for(int q = 0; q < list2.size(); q++)
        {
            for(int w = 1; w < String.valueOf(list2.get(q)).length(); w++)
            {
                if(  Integer.valueOf(String.valueOf(String.valueOf(list2.get(q)).charAt(w - 1))) <
                        Integer.valueOf(String.valueOf(String.valueOf(list2.get(q)).charAt(w)))   )
                {
                    up = true;
                }
            }
            if(up)
            {
                System.out.println("uyt");
                answer = String.valueOf(list2.get(q));
                break;
            }

        }

        System.out.println("Число с цифрами по возрастанию: " + answer);

    }
}
