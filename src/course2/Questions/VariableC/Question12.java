package course2.Questions.VariableC;

import java.util.ArrayList;

public class Question12
{
    public void task(double[][]matrix, int n)
    {
        System.out.println("Находим минимальный элемент " +
                "и ставим его в позицию последней строки и последнего столбца путем их перестановки");
        //находим минимальный элемент
        double minInMatrix = matrix[0][0];
        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                if(matrix[y][x]<minInMatrix)
                {
                    minInMatrix = matrix[y][x];
                }
            }
        }

        //находим адрес минимального элемента, если их несколько, то первого по списку
        int[] adressMin = new int[2];
    OUT:for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                if(matrix[y][x]==minInMatrix)
                {
                    adressMin[0] = y;//заносим номер строки минимального элемента в массив
                    adressMin[1] = x;//заносим номер столбца минимального элемента в массив
                    break OUT;
                }
            }
        }

        ArrayList<Double> spareString = new ArrayList<>();
        if(adressMin[0] != n-1)
        {
            //меняем местами строку минимального элемента и последнюю строку

            //записываем строку минимального элемента во временный список
            for (int x = 0; x < n; x++)
            {
                spareString.add(matrix[ adressMin[0] ][x]);
            }

            //ставим последнюю строку на место строки минимального элемента
            for (int x = 0; x < n; x++)
            {
                matrix[ adressMin[0] ][x] = matrix[n - 1][x];
            }

            //заполняем последнюю строку строкой минимального элемента
            for (int x = 0; x < n; x++)
            {
                matrix[n - 1][x] = spareString.get(x);
            }
        }

        spareString.clear();

        if(adressMin[1] != n-1)
        {
            //меняем местами строку минимального элемента и последнюю строку
            //записываем строку минимального элемента во временный список
            for (int y = 0; y < n; y++)
            {
                spareString.add(matrix[y][ adressMin[1] ]);
            }

            //ставим последнюю строку на место строки минимального элемента
            for (int y = 0; y < n; y++)
            {
                matrix[y][ adressMin[1] ] = matrix[y][n-1];
            }

            //заполняем последнюю строку строкой минимального элемента
            for (int y = 0; y < n; y++)
            {
                matrix[y][n - 1] = spareString.get(y);
            }
        }






        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                if(matrix[y][x] < 0)
                    System.out.print("["+ String.format("%.2f", matrix[y][x]) + "] ");
                else
                    System.out.print("[ "+String.format("%.2f", matrix[y][x]) + "] ");
            }
            System.out.println();
        }



    }
}
