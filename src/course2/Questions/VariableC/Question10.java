package course2.Questions.VariableC;

import java.util.ArrayList;

public class Question10
{
    public void task(double[][] matrix, int n) {
        double maxElement = matrix[0][0];

        //находим максимальный элемент
        for (int y = 0; y < n; y++)
        {//перебираем строки
            for (int x = 0; x < n; x++)
            {//перебираем столбцы
                if (matrix[y][x] > maxElement)
                {//если текущий элемент больше максимального
                    maxElement = matrix[y][x];//то максимальный элемент равен текущему
                }
            }
        }

        //создаем копию массива в формате String
        String[][] matrixString = new String[n][n];

        //заполняем копию массива
        for (int y = 0; y < n; y++)
        {
            for (int x = 0; x < n; x++)
            {
                matrixString[y][x] = String.valueOf(matrix[y][x]);
            }
        }


        //нахождение адресов максимального элемента
        ArrayList<Integer> adress = new ArrayList<>();//создаем массив адресов
        for (int y = 0; y < n; y++)
        {//перебираем строки
            for (int x = 0; x < n; x++)
            {//перебираем столбцы
                if( matrixString[y][x].equals(String.valueOf(maxElement)) )
                {//если элемент равен максимальному
                    //то запоминаем его адрес
                    adress.add(y);//четные элементы массива adress равны строке расположения максимального элемента
                    adress.add(x);//нечетные элементы массива adress равны столбцу расположения максимального элемента
                }

            }
        }
        System.out.println();

        //по соответствию с адресом заменяем элементы на слово "delete"
        for (int y = 0; y < n; y++)
        {//перебираем строки
            for (int x = 0; x < n; x++)
            {//перебираем столбцы
                for(int w = 0; w < adress.size(); w=w+2)
                {//перебираем четные адреса в массиве адресов
                    if(adress.get(w) == y && adress.get(w+1) == x)
                    {//если y равен четному элементу массива adress и х равен следующему элементу массива adress
                        for(int q = 0; q<n; q++)
                        {//то все элементы в строке = "delete"
                            matrixString[y][q] = "delete";
                        }
                        for(int q = 0; q<n; q++)
                        {//и все элементы в стобце = "delete"
                            matrixString[q][x] = "delete";
                        }
                    }
                }
            }
        }


        //узнаем новое кол-во столбцов для нового массива
        //создаем значение кол-ва столбцов для нового массива
        int x2 = 0;

        for (int y = 0; y < n; y++)
        {//перебираем строки
            //создаем значение кол-ва элементов в конкретной строке
            int x2false = 0;
            for (int x = 0; x < n; x++)
            {//перебираем столбцы
                if(!matrixString[y][x].equals("delete"))
                {//если значение элемента не равно "delete"
                    x2false++;//значение кол-ва элементов в конкретной строке увеличивается
                }
            }
            if(x2false>x2)
            {//если количество элементов в конкретной строке больше настоящего
                x2 = x2false;//настоящее количество элементов равно количеству элементов в конкретной строке
            }
        }

        //узнаем новое кол-во строк
        int y2 = 0;
        for (int y = 0; y < n; y++)
        {//перебираем столбцы
            //создаем значение кол-ва элементов в конкретном столбце
            int y2false = 0;
            for (int x = 0; x < n; x++)
            {//перебирраем строки
                if(!matrixString[x][y].equals("delete"))
                {//если значение элемента не равно "delete"
                    y2false++;//значение кол-ва элементов в конкретнм столбце увеличивается
                }
            }
            if(y2false>y2)
            {//если количество элементов в конкретном столбце больше настоящего
                y2 = y2false;//настоящее количество элементов равно количеству элементов в конкретном столбце
            }
        }

        //создаем новый массив
        String[][] shortMatrix = new String[y2][x2];
        //создаем счетчики для нового массива
        int r =0;//счетчик строк
        int t =0;//счетчик столбцов

        for(int y = 0; y<n; y++)
        {//перебираем строки массива matrixString
            for(int x = 0; x<n; x++)
            {//перебираем столбцы массива matrixString
                if(!matrixString[y][x].equals("delete"))
                {//если элемент не равен "delete"
                    shortMatrix[r][t] = matrixString[y][x];//то он вносится в новый массив
                    if(t<x2-1)
                    {//если счетчик столбцов не больше допустимого и не станет больше допустимого после увеличения
                       t++;//то счетчик столбцов увеличивается на 1
                    }
                    else
                    {//иначе
                        r++;//счетчик строк увеличивается на 1
                        t=0;//счетчик столбцов обнуляется
                    }
                }
            }
        }
/*
        //вывод массива на экран
        System.out.println("Массив с заменой строк и столбцов максимальных элементов матрицы на \"delete\"");
        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                if(matrixString[y][x].contains("-"))
                    System.out.print("["+matrixString[y][x] + "] ");
                else
                    System.out.print("[ "+matrixString[y][x] + "] ");
            }
            System.out.println();
        }
        System.out.println();

 */

        //вывод нового массива на экран
        System.out.println("Массив с удалением строк и столбцов содержащих максимальный элемент матрицы");
        for(int y = 0; y<y2; y++)
        {
            for(int x = 0; x<x2; x++)
            {
                if(shortMatrix[y][x].contains("-"))
                    System.out.print("["+String.format("%.2f",Double.parseDouble(shortMatrix[y][x]))  + "] ");
                else
                    System.out.print("[ "+String.format("%.2f",Double.parseDouble(shortMatrix[y][x])) + "] ");
            }
            System.out.println();
        }
    }
}
