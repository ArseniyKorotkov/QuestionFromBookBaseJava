package course2.Questions.VariableC;

import java.util.ArrayList;

public class Question2
{
    public void task(int [][] matrix,int n, int k)
    {
        System.out.println("Циклический сдвиг матрицы на "+k+" шагов вверх");
        //создаес запасной массив
        ArrayList<Integer> spareList = new ArrayList<>();

        for(int q = 0; q<k; q++)
        {//совершаем количество перестановок k раз
            for(int w = 0; w<n;w++)
            {//переносим первую строку в звпасной массив
                spareList.add(matrix[0][w]);
            }

            for(int w = 1; w<n;w++)
            {//переносим все строки на строку вверх
                for(int r = 0; r<n;r++)
                {
                    matrix[w-1][r]=matrix[w][r];
                }
            }

            for(int w = 0; w<n;w++)
            {//ставим строку из запосного масива на место последней строки
                matrix[n-1][w] = spareList.get(w);
            }
            //очищаем запосной массив
            spareList.clear();
        }

        //вывод получившигося массива на экран
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
    }
}
