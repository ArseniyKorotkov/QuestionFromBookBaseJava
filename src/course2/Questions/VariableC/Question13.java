package course2.Questions.VariableC;

public class Question13
{
    public void task(double[][]matrix, int n)
    {
        System.out.println("Ставим нули в конец строки");

        for(int y = n-1; y > -1; y--)
        {
            int z = n-1;//место, на которое будет ставится ноль
            for(int x = n-1; x > -1; x--)
            {
                if(matrix[y][x] == 0)
                {
                    if(x != z)
                    {
                        matrix[y][x] = matrix[y][z];
                        matrix[y][z] = 0;

                    }
                    z--;
                }

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
