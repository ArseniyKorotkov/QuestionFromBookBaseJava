package course2.Questions.VariableC;

import java.util.ArrayList;

public class Question11
{
    public void task(double[][] matrix, int n)
    {
        //создаем копию массива в формате String
        String[][] matrixString = new String[n][n];

        //заполняем копию массива
        for (int y = 0; y < n; y++)
        {//перебираем строки
            for (int x = 0; x < n; x++)
            {//перебираем столбцы
                matrixString[y][x] = String.valueOf(matrix[y][x]);
            }
        }

        //ищем строки заполненные нулями
        ArrayList<Integer> numberZeroString = new ArrayList<>();
        for (int y = 0; y < n; y++)
        {//перебираем строки
            boolean check = true;
            for (int x = 0; x < n; x++)
            {//перебираем столбцы
                if( !matrixString[y][x].equals("0.0") )
                {
                    check = false;
                }
            }
            if(check)
            {
                numberZeroString.add(y);
                //System.out.println(y + "string");
            }

        }

        //ищем столбцы заполненные нулями
        ArrayList<Integer> numberZeroColumn = new ArrayList<>();
        for (int y = 0; y < n; y++)
        {//перебираем столбцы
            boolean check = true;
            for (int x = 0; x < n; x++)
            {//перебираем строки
                if( !matrixString[x][y].equals("0.0") )
                {
                    check = false;
                }
            }
            if(check)
            {
                numberZeroColumn.add(y);
                //System.out.println(y+"column");
            }
        }



        //заменяю элементы строк заполненных нулями на "delete"
        if(!numberZeroString.isEmpty())
        {
            for(int nZS = 0; nZS < numberZeroString.size(); nZS++)
            {
                for(int x = 0; x < n; x++)
                {
                    matrixString[numberZeroString.get(nZS)][x] = "delete";
                }
            }
        }

        //заменяю элементы столюцов заполненных нулями на "delete"
        if(!numberZeroColumn.isEmpty())
        {
            for(int nZC = 0; nZC < numberZeroColumn.size(); nZC++)
            {
                for(int x = 0; x < n; x++)
                {
                    matrixString[x][numberZeroColumn.get(nZC)] = "delete";
                }
            }
        }
/*
        //вывод на экран
        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                    System.out.print("["+matrixString[y][x] + "] ");
            }
            System.out.println();
        }

 */

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

        //вывод нового массива на экран
        System.out.println("Массив с удалением строк и столбцов содержащих только нули");
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
