package course2.Questions.VariableA;

import java.util.ArrayList;

public class Question7
{
    public void task(ArrayList <Integer> list)
    {
        //создаю копию основной коллекции
        ArrayList <Integer> list2 = new ArrayList<>(list);
        //создаю коллекцию для проверки содержимого на повторения
        ArrayList <String> checkList = new ArrayList<>();
        System.out.print("Первое число с неповторяющимися цифрами: ");


        for(int q = 0; q < list2.size(); q++)
        {//перебираю числа
            //создаю переключатель события
            boolean check = true;
            for(int w = 0; w < String.valueOf(list2.get(q)).length(); w++)
            {//заполняю коллекцию для проверки цифрами из числа основной коллекции
                checkList.add( String.valueOf( String.valueOf(list2.get(q)).charAt(w)) );
            }
            for(int w = 0; w < String.valueOf(list2.get(q)).length(); w++)
            {//провожу сверку на соответствие
                //создаю копию проверяемой цифры
                String str = checkList.get(w);
                //удаляю из проверочной коллекции проверяемую цифру
                checkList.remove(w);
                //ставлю на место проверяемой цифры элемент, который точно не может быть в этой коллекции
                //для сохранения кол-ва элементов во избежание ошибки при переборе
                checkList.add(w, "timesElement");
                //если в проверочной коллекции еще есть такие цифры, то...
                if(checkList.contains(str))
                {
                    //...переключатель выключается
                    check = false;
                    //...проверочная коллекция очищается
                    checkList.clear();
                    //...переходим к следующей цифре
                    break;

                }
            }
            //если переключатель не выключился, то...
            if(check)
            {
                //...выводим на экран соответствующее число
                System.out.println(list2.get(q));
                //...завершаем поиск
                break;
            }
        }
        System.out.println();
    }
}
