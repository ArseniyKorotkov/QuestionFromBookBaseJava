package course2.Questions.VariableA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainA2
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readerString = reader.readLine();

        boolean newString = true;
        boolean negative = false;
        int negativeN = 0;

        int readerStringLength = readerString.length();
        for(int q = 0; q < readerStringLength; q++)
        {
            char inputNumberChar = readerString.charAt(q);

            try
            {
                if(String.valueOf(inputNumberChar).equals("-"))
                {
                    negative = true;
                }

                int inputNumber = Integer.parseInt(String.valueOf(inputNumberChar));

                if(negative)
                {
                    inputNumber = inputNumber*(-1);
                    //System.out.println(inputNumber);
                    negative = false;
                }
                negativeN = 0;
                if(newString)
                {
                    list.add(inputNumber);
                    newString = false;
                }
                else
                {
                    list.add(list.size()-1, Integer.parseInt(String.valueOf(list.get(list.size()-1))
                            .concat(String.valueOf(inputNumber))));
                    list.remove(list.size()-1);
                }
            }
            catch (NumberFormatException e)
            {
                newString = true;
                if(negativeN > 0)
                {
                    negative = false;
                }
                if(String.valueOf(inputNumberChar).equals("-"))
                {
                    negativeN++;
                }
            }
        }

        //new Question1().task(list);
        //new Question2().task(list);
        //new Question3().task(list);
        //new Question4().task(list);
        //new Question5().task(list);
        //new Question6().task(list);
        //new Question7().task(list);
        new Question8().task(list);


    }
}
