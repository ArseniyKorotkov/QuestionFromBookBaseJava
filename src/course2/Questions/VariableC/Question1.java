package course2.Questions.VariableC;

import java.util.ArrayList;
import java.util.Collections;

public class Question1
{
    public void task(int [][] matrix,int n, int k)
    {
        System.out.println("Сортировка матрицы по строке номер "+k);
        System.out.println();
        //переводим номер строки с понятного пользователю в понятный компьютеру
        k--;
        //создаем запасные коллекции
        ArrayList <Integer> spareArray = new ArrayList<>();
        ArrayList <Integer> spareArray2 = new ArrayList<>();

        //вносим в запасную коллекцию1 строку по которой будет сортироваться матрица
        for(int q = 0; q<n; q++)
        {
            spareArray.add(matrix[k][q]);
        }

        //сортируем запасную коллекцию1 по возрастанию
        Collections.sort(spareArray);

        int a = 0;


        for(int q = 0; q<n; q++)
        {//перебираем числа в запасной коллекции1
            for(int w = q; w<n; w++)
            {//перебираем числа в строке по которой будет сортироваться матрица
                if(q == w)
                {//если числа находятся на одинаковых местах
                    if (spareArray.get(q) == matrix[k][w])
                    {//и равны друг другу
                        break;//ничего в этом столбце не меняем и переходим к проверке следующего столбца
                    }
                    else
                    {//и не равны друг другу
                        continue;//продолжаем поиск места этого столбца
                    }
                }

                //реализуем видимость процессов
                if(spareArray.get(q) == matrix[k][w])
                {//если элементы равны
                    System.out.println(matrix[k][q] +" меняется с "+  spareArray.get(q));
                    a++;

                    //переносим столбик в котором находится элемент в запасную коллекцию2
                    for(int r = 0; r<n; r++)
                    {
                        spareArray2.add(matrix[r][w]);
                    }

                    //переносим столбик со старого места на новое
                    for(int r = 0; r<n; r++)
                    {
                        matrix[r][w] = matrix[r][q];
                    }

                    //вставляем в матрицу столбик из запасной коллекции2 на старое место перемещенного столбика
                    for(int r = 0; r<n; r++)
                    {
                        matrix[r][q] = spareArray2.get(r);
                    }
                    //очищаем запасную коллекцию2
                    spareArray2.clear();

                    //вывод перестановок в строке на монитор
                    for(int x = 0; x<n; x++)
                    {
                        if(matrix[k][x] < 0)
                            System.out.print("["+matrix[k][x] + "] ");
                        else
                            System.out.print("[ "+matrix[k][x] + "] ");
                    }
                    System.out.println("шаг:"+a);
                    System.out.println();

                }
            }
        }
        System.out.println("ИТОГО:");
        //вывод получившиеся на монитор
        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                if(matrix[y][x] < 0)
                    System.out.print("["+matrix[y][x] + "] ");
                else
                    System.out.print("[ "+matrix[y][x] + "] ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Количество перемещений = "+a);
        System.out.println();





    }
}
