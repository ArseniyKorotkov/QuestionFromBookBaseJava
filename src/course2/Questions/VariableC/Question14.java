package course2.Questions.VariableC;

public class Question14
{
    public void task(double matrix[][],  int n)
    {
        System.out.println("Округляем значения матрицы до целых чисел");
        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                matrix[y][x] = (double)Math.round(matrix[y][x]);
            }
        }

        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                if(matrix[y][x] < 0)
                    System.out.print("["+String.format("%.0f",matrix[y][x]) + "] ");
                else
                    System.out.print("[ "+String.format("%.0f",matrix[y][x]) + "] ");
            }
            System.out.println();
        }
    }
}
