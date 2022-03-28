package course2.Questions.VariableC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class MainC2
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int n = Integer.parseInt(reader.readLine());//опредилитель матрицы
            int k = Integer.parseInt(reader.readLine());//номер для обработки матрицы по заданию

            if(n<2 || 0>=k ||  k>n)
            {
                System.err.println("Первое число должно быть не меньше 2.");
                System.err.println("Второе число должно быть положительным, но не больше первого!");
            }
            else
            {
                int [][] matrix = new int[n][n];
/*
                matrix[0][0] = 4;
                matrix[0][1] = 2;
                matrix[0][2] = 1;
                matrix[0][3] = 3;
                matrix[1][0] = 2;
                matrix[1][1] = 1;
                matrix[1][2] = 3;
                matrix[1][3] = 2;
                matrix[2][0] = 1;
                matrix[2][1] = 3;
                matrix[2][2] = 2;
                matrix[2][3] = 1;
                matrix[3][0] = 3;
                matrix[3][1] = 2;
                matrix[3][2] = 1;
                matrix[3][3] = 3;
*/

                for(int y = 0; y<n; y++)
                {
                    for(int x = 0; x<n; x++)
                    {
                        matrix[y][x] = new Random().nextInt(n*2+1)-n;
                        //matrix[y][x] = new Random().nextInt(n+1)+2;
                        //matrix[y][x] = 1;
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

                System.out.println();

/*
                new Question1().task(matrix, n, k);
                System.out.println();

                new Question2().task(matrix, n, k);
                System.out.println();

                new Question3().task(matrix, n);
                System.out.println();

                new Question4().task(matrix, n);
                System.out.println();

                new Question5().task(matrix, n);
                System.out.println();

                new Question6().task(matrix, n);
                System.out.println();

                new Question7().task(matrix, n, k);
                System.out.println();
*/
                new Question8().task(matrix, n);
                System.out.println();
/*
                double[][] matrixDouble = new double[n][n];
                for(int y = 0; y<n; y++)
                {
                    for(int x = 0; x<n; x++)
                    {
                        matrixDouble[y][x] = matrix[y][x];
                    }
                }

                new Question9().task(matrixDouble, n);
                System.out.println();

                new Question10().task(matrixDouble, n);
                System.out.println();

                new Question11().task(matrixDouble, n);
                System.out.println();

                new Question12().task(matrixDouble, n);
                System.out.println();

                new Question13().task(matrixDouble, n);
                System.out.println();

                new Question14().task(matrixDouble, n);
                System.out.println();

                for(int y = 0; y<n; y++)
                {
                    for(int x = 0; x<n; x++)
                    {
                        matrix[y][x] = (int)matrixDouble[y][x];
                    }
                }



                new Question15().task(matrix, n);
                System.out.println();

                new Question16().task(matrix, n);
                System.out.println();

                new Question17().task(matrix, n);
                System.out.println();

                new Question18().task(matrix, n);
                System.out.println();

                new Question19().task(matrix, n);
                System.out.println();

                new Question20().task(matrix, n);
                System.out.println();

 */

            }
        }
        catch (NumberFormatException e)
        {
            System.err.println("Enter two number");
        }




    }
}
