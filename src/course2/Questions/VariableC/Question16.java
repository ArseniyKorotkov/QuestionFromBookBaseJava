package course2.Questions.VariableC;

public class Question16
{
    public void task(int[][]matrix, int n)
    {
        System.out.println("Сортировка строк по сумме элементов");

        int[] spare = new int[n];

        boolean check = true;

        while(check)
        {
            check = false;

            for(int y = 1; y < n; y++)
            {
                int sum1 = 0;
                int sum2 = 0;

                for(int x = 0; x < n; x++)
                {
                    sum1 += matrix[y-1][x];
                }

                for(int x = 0; x < n; x++)
                {
                    sum2 += matrix[y][x];
                }

                if(sum1>sum2)
                {
                    for(int x = 0; x < n; x++)
                    {
                        spare[x] = matrix[y-1][x];
                        matrix[y-1][x] = matrix[y][x];
                        matrix[y][x] = spare[x];
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
