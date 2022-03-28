package course2.Questions.VariableA;

import java.util.ArrayList;

public class Question4
{
    public void task(ArrayList list)
    {
        ArrayList <Integer> list2 = new ArrayList<>(list);

        int minQuantityRepetition = String.valueOf(list2.get(0)).length();
        int adressNumberMinRepetitions = 0;

        int list2Size = list2.size();
        for(int q = 0; q<list2Size; q++)
        {//перебор чисел в коллекции
            int maxQuantityRepetition = 0;
            int numberSize = String.valueOf(list2.get(q)).length();
            for(int w = 0; w<numberSize; w++ )
            {//перебор цифр в числе
                int QuantityRepetition = 0;
                String c = String.valueOf(String.valueOf(list2.get(q)).charAt(w));
                for(int r = 0; r<numberSize; r++ )
                {//сравнение цифры с цифрами в числе
                    String c2 = String.valueOf(String.valueOf(list2.get(q)).charAt(r));
                    if( c.equals(c2) )
                    {
                        QuantityRepetition++;
                    }

                }
                if(QuantityRepetition > maxQuantityRepetition)
                {
                    maxQuantityRepetition = QuantityRepetition;
                }

            }
            if(maxQuantityRepetition < minQuantityRepetition)
            {
                minQuantityRepetition = maxQuantityRepetition;
                adressNumberMinRepetitions = q;
            }
        }
        System.out.println("Первое число с минимальным количеством одинаковых знаков: "
                + list2.get(adressNumberMinRepetitions));
        System.out.println();
    }
}
