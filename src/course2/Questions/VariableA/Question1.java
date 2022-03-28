package course2.Questions.VariableA;

import java.util.ArrayList;

public class Question1
{
    public void task(ArrayList<Integer> list)
    {
        //создаем коллекцию для копирования листа
        ArrayList <Integer> list2 = new ArrayList<Integer>();
        //создаем коллекцию для хранения адресов отрицательных чисел
        ArrayList <Integer> adressNegative = new ArrayList<>();

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

        //занимаю место в памяти для искомых значений
        int longNumberLength = String.valueOf(list2.get(0)).length();
        int smallNumderLength = String.valueOf(list2.get(0)).length();
        int longNumber = 0;
        int smallNumder = 0;

        //нахожу длину самого длинного и самого короткого чисел
        for(int q = 0; q<listSize; q++)
        {
            if(String.valueOf(list2.get(q)).length() > longNumberLength)
            {
                longNumberLength = String.valueOf(list2.get(q)).length();
            }
            if(String.valueOf(list2.get(q)).length() < smallNumderLength)
            {
                smallNumderLength = String.valueOf(list2.get(q)).length();
            }
        }

        boolean negative = false;

        //создаю значение длины коллекции адресов негативных чисел
        int adressNegativeSize = adressNegative.size();

        String longNumberStr = "";
        String smallNumberStr = "";

        //перебираю числа list2 на соответствие длине самого длинного и короткого чисел
        for(int q = 0; q<listSize; q++)
        {
            if(String.valueOf(list2.get(q)).length() == longNumberLength)
            {//если длина числа равна длине самого длинного числа
                for(int w = 0; w < adressNegativeSize; w++)
                {//проверяем адрес этого числа на его наличие в коллекции отрицательных чисел
                    if(q == adressNegative.get(w))
                    {//если адрес из коллекции отрицательных чисел - возвращаем ему минус и выводим его на экран
                        longNumber = list2.get(q)*(-1);
                        longNumberStr += longNumber + " ";

                        negative = true;
                    }
                }
                if(!negative)
                {//если адрес не из коллекции отрицательных чисел - выводим его на экран
                    longNumber = list2.get(q);
                    longNumberStr += longNumber + " ";
                }
                negative = false;
            }

            if(String.valueOf(list2.get(q)).length() == smallNumderLength)
            {//если длина числа равна длине самого короткого числа
                for(int w = 0; w < adressNegativeSize; w++)
                {//проверяем адрес этого числа на его наличие в коллекции отрицательных чисел
                    if(q == adressNegative.get(w))
                    {//если адрес из коллекции отрицательных чисел - возвращаем ему минус и выводим его на экран
                        smallNumder = list2.get(q)*(-1);
                        smallNumberStr += smallNumder + " ";

                        negative = true;
                    }
                }

                if(!negative)
                {//если адрес не из коллекции отрицательных чисел - выводим его на экран
                    smallNumder = list2.get(q);
                    smallNumberStr += smallNumder + " ";
                }
                negative = false;
            }
        }

        System.out.println("Самое длинное число " + longNumberStr + " длиною " +
                longNumberLength + " ед. без учета минусов");
        System.out.println("Самое короткое число " + smallNumberStr + " длиною " +
                smallNumderLength + " ед. без учета минусов");

        System.out.println();

    }
}
