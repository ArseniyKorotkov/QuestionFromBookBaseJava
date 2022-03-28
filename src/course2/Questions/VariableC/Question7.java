package course2.Questions.VariableC;

public class Question7
{
    public void task(int[][] matrix, int n, int k)
    {
        System.out.println("Поворачиваем матрицу на 90 градусов против часовой стрелки k раз:");

        //создаем запасной массив для повернутой матрицы
        int[][] matrix90 = new int[n][n];

        for(int q = 0; q<k; q++)
        {//повторяем k раз
            for(int y = 0; y<n; y++)
            {//перебираем столбцы
                for(int x = 0; x<n; x++)
                {//перебираем строки
                    matrix90[y][x] = matrix[x][(n-1)-y];//заполняем запасной массив повернутой матрицей
                }
            }

            for(int y = 0; y<n; y++)
            {
                System.arraycopy(matrix90[y], 0, matrix[y], 0, n);//заполняем основной массив
            }
        }

        //вывод на монитор
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
