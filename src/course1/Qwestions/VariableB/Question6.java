package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question6
{
    public void task(ArrayList <Integer> list)
    {
        String nepohoj = "Трехзначные числа без повторений цифр: ";

        for(int q = 0; q < list.size(); q++)          //перебираем числа
        {
            double listDouble = list.get(q);   //создаем listDouble для десятичного деления на 1000

            //находим трехзначные числа
            if (((listDouble/1000) >= 0.1)&&((listDouble/1000) < 1.0)  ||
                    ((listDouble/1000) <= (-0.1))&&((listDouble/1000) > (-1.0)))
            {
                //System.out.println(list.get(q)); //находим в чем нет одинаковых цифр
                if(list.get(q)<0) //если число отрицательное
                {
                    Integer listModule = list.get(q)*(-1); //то разбираем его модуль
                    String listString = listModule.toString();

                    char [] chars = listString.toCharArray();//разбираем число на цифры

                    //переводим char в Character для перевода в String
                    Character character0 = chars[0];
                    Character character1 = chars[1];
                    Character character2 = chars[2];

                    //переводим char в String для удобства сравнения
                    String char0 = character0.toString();
                    String char1 = character1.toString();
                    String char2 = character2.toString();

                    //сравниваем цифры и если нет похожих вносим их в список
                    if( !char0.equals(char1) && !char0.equals(char2) && !char2.equals(char1) )
                    {
                        nepohoj = nepohoj + list.get(q) + " ";
                    }

                }
                else//если число положительное
                {
                    String listString = list.get(q).toString();

                    char [] chars = listString.toCharArray();//разбираем число на цифры

                    //переводим char в Character для перевода в String
                    Character character0 = chars[0];
                    Character character1 = chars[1];
                    Character character2 = chars[2];

                    //переводим char в String для удобства сравнения
                    String char0 = character0.toString();
                    String char1 = character1.toString();
                    String char2 = character2.toString();

                    //сравниваем цифры и если нет похожих вносим их в список
                    if( !char0.equals(char1) && !char0.equals(char2) && !char2.equals(char1) )
                    {
                        nepohoj = nepohoj + list.get(q) + " ";
                    }
                }
            }
        }
        System.out.println(nepohoj);
        System.out.println("");
    }
}
