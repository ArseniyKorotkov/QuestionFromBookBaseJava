package course2.Questions.VariableC;

public class Question5
{
    public void task(int[][]matrix, int n)
    {
        System.out.println("Транспонированние матрицы:");
        //создаем запасной массив
        int [][] matrix2 = new int[n][n];
        //копируем элементы основного массива в запасной в порядке транспонирования
        //т.е. столбцы в строки
        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                matrix2[y][x] = matrix[x][y];
            }
        }

        //вносим изменения из запасного массива в основной
        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                matrix[y][x] = matrix2[y][x];
            }
        }

        //визуализация транспонированной матрицы
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
