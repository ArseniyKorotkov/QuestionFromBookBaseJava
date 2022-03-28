package course2.Questions.VariableA;

import java.util.ArrayList;
import java.util.Collections;

public class Question2
{
    public void task(ArrayList<Integer> list)
    {
        //создаем коллекцию для копирования list
        ArrayList <Integer> list2 = new ArrayList<Integer>();
        //создаем коллекцию для хранения адресов отрицательных чисел
        ArrayList <Integer> adressNegative = new ArrayList<>();
        //создаем коллекцию для хранения длин чисел list2
        ArrayList <Integer> numbersLength = new ArrayList<>();
        //создаем коллекцию для хранения сортированных по длине чисел
        ArrayList <Integer> numbersLengthSort = new ArrayList<>();

        //создаем значение размера листа
        int listSize = list.size();
        //заполняю list2 модулями коллекции list
        for(int q = 0; q<listSize; q++)
        {
            if(list.get(q)<0)
            {
                list2.add(list.get(q)*(-1));
                //запоминаю ареса отрицательных чисел
                adressNegative.add(q);
            }
            else
            {
                list2.add(list.get(q));
            }
        }

        //заполняю коллекцию значениями длин чисел коллекции list2
        for(int q = 0; q<listSize; q++)
        {
            if(!numbersLength.contains(String.valueOf(list2.get(q)).length()))
            {//если такое значение длины уже есть, то оно не записывается
                numbersLength.add(String.valueOf(list2.get(q)).length());
            }
        }
        //сортирую коллекцию длин чисел
        Collections.sort(numbersLength);

        int numbersLengthSize = numbersLength.size();
        //перебираю коллекцию длин чисел
        for(int q = 0; q < numbersLengthSize; q++)
        {
            //перебираю коллекцию list2
            for(int w = 0; w < listSize; w++)
            {
                if ( numbersLength.get(q) == String.valueOf(list2.get(w)).length() )
                {
                    if(adressNegative.contains(w))
                    {
                        numbersLengthSort.add(list2.get(w)*(-1));
                    }
                    else
                    {
                        numbersLengthSort.add(list2.get(w));
                    }

                }
            }
        }

        System.out.print("Значения в порядке возрастания их длин без учета минуса: ");

        for (int a : numbersLengthSort)
        {
            System.out.print(a + " ");
        }
        System.out.println();

        Collections.reverse(numbersLength);
        numbersLengthSort.clear();


        numbersLengthSize = numbersLength.size();
        //перебираю коллекцию длин чисел
        for(int q = 0; q < numbersLengthSize; q++)
        {
            //перебираю коллекцию list2
            for(int w = 0; w < listSize; w++)
            {
                if ( numbersLength.get(q) == String.valueOf(list2.get(w)).length() )
                {
                    if(adressNegative.contains(w))
                    {
                        numbersLengthSort.add(list2.get(w)*(-1));
                    }
                    else
                    {
                        numbersLengthSort.add(list2.get(w));
                    }

                }
            }
        }

        System.out.print("Значения в порядке убывания их длин без учета минуса: ");

        for (int a : numbersLengthSort)
        {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();
    }
}
