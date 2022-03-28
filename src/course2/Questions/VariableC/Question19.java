package course2.Questions.VariableC;

public class Question19
{
    public void task(int[][]matrix, int n)
    {
        System.out.println("Перестановка столбцов по убываню сумм их характеристик");

        int[] spare = new int[n];
        boolean check = true;

        while(check)
        {
            check = false;

            for(int x = 1; x < n; x++)
            {//перебираем столбцы
                int sum1 = 0;
                int sum2 = 0;

                for(int y = 0; y < n; y++)
                {//перебираем строки
                    sum1 += Math.abs(matrix[y][x-1]);
                }

                for(int y = 0; y < n; y++)
                {//перебираем строки
                    sum2 += Math.abs(matrix[y][x]);
                }

                if(sum1<sum2)
                {
                    for(int y = 0; y < n; y++)
                    {//перебираем строки
                        spare[y] = matrix[y][x];
                        matrix[y][x] = matrix[y][x-1];
                        matrix[y][x-1] = spare[y];
                        check = true;
                    }
                }
            }
        }

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

    }
}
