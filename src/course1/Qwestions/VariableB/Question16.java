package course1.Qwestions.VariableB;

import java.util.ArrayList;

public class Question16
{
    public void task(ArrayList<Integer> list)
    {
        System.out.println("Треугольник паскаля на кол-во строк первого положительного" +
                " из введенных числа:");

        System.out.println(" ");

        ArrayList<Integer> list2 = new ArrayList<Integer>();//последняя строка
        ArrayList<Integer> list3 = new ArrayList<Integer>();//новая строка


        for(int p = 0; p < list.size(); p++)//перебор поиска первого положительного числа
        {
            if(list.get(p)>0)//нахождение первого положительного чтсла
            {

                list2.add(1);//добавляем единицу в первую строку
                System.out.println(list2.get(0));//выводим на экран первую строку

                for (int q = 1; q < list.get(p); q++) //перебор кол-ва итераций
                {
                    list3.add(1);//добавляем единицу в начало новой строки

                    for (int w = 0; w < list2.size(); w++) //перебор добавления чисел в коллекцию
                    {
                        if (w > 0) //добавляем суммы чисел в новую строку,
                            //где это возможно
                        {
                            list3.add(list2.get(w - 1) + list2.get(w));
                        }
                    }

                    list3.add(1);//добавляем единицу в конец новой строки


                    for (int t = 0; t < list3.size(); t++) //выводим новую строку на экран,
                        //она становится последней
                    {
                        System.out.print(list3.get(t) + " ");
                    }
                    System.out.println("");


                    list2.clear();//очищаем старую последнюю строку


                    for (int t = 0; t < list3.size(); t++) //замещаем ее актуальной последней строкой
                    {
                        list2.add(list3.get(t));
                    }

                    list3.clear();//очищаем место для записи следующей новой строки
                }
                break;
            }
        }
    }
}
