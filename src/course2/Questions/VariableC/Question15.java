package course2.Questions.VariableC;

public class Question15
{
    public void task(int[][]matrix, int n)
    {
        System.out.print("Количество седловых точек матрицы: ");


        int quntity = 0;

        //перебираем числа для проверки
        for(int y = 0; y < n; y++)
        {
            for(int x = 0; x < n; x++)
            {
                boolean check = true;
                //перебираем проверку
                for(int z = 0; z < n; z++)
                {
                    if(matrix[y][x] > matrix[y][z] && x!=z)
                    {
                        check = false;
                    }
                }

                for(int z = 0; z < n; z++)
                {
                    if(matrix[y][x] < matrix[z][x] && y!=z)
                    {
                        check = false;
                    }
                }
                if (check)
                {
                    quntity++;
                }
            }
        }
        System.out.println(quntity);
    }
}
