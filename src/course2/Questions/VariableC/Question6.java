package course2.Questions.VariableC;

public class Question6
{
    public void task(int[][] matrix, int n)
    {
        System.out.print("Первая норма матрицы: ");//самая большая сумма модулей элементов среди строк
        int norm1 = 0;//создаем значение нормы1

        for(int y = 0; y<n; y++)
        {//перебираем строки
            int candidateNorm1 = 0;//создаем значение суммы модулей элементов строки
            for(int x = 0; x<n; x++)
            {//перебираем элементы строки
                    candidateNorm1 += Math.abs(matrix[y][x]);//суммируем их модули
            }

            if(candidateNorm1>norm1)
            {//если сумма модулей строки больше самой большой суммы модулей сторки
                norm1 = candidateNorm1;//она становится нормой1
            }
        }
        System.out.println(norm1);//вывод на монитор нормы1




        System.out.print("Вторая норма матрицы: ");//самая большая сумма модулей элементов среди столбцов
        int norm3 = 0;//создаем значение нормы2

        for(int y = 0; y<n; y++)
        {//перебор столбцов
            int candidateNorm3 = 0;//создаем значение суммы модулей элементов столбца
            for(int x = 0; x<n; x++)
            {//перебираем элементы столбца
                if(matrix[x][y]>0)
                {//суммируем их
                    candidateNorm3 += matrix[x][y];
                }
                else
                {//по модулю
                    candidateNorm3 += (matrix[x][y])*(-1);
                }

            }
            if(candidateNorm3>norm3)
            {//если сумма модулей столбца больше самой большой суммы модулей столбца
                norm3 = candidateNorm3;//она становится нормой2
            }
        }
        System.out.println(norm3);//вывод на монитор нормы2



        System.out.print("Третья норма матрицы: ");//корень суммы квадратов всех элементов матрицы

        int sumSquaringNumberMatrix = 0;//создаем значение суммы квадратов всех элементов матрицы
        //перебираем все элементы матрицы
        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                sumSquaringNumberMatrix += Math.pow(matrix[y][x], 2);//складываем сумму квадратов всех элементов матрицы
            }
        }
        double norm2 = Math.sqrt(sumSquaringNumberMatrix);//находим корень суммы квадратов всех элементов матрицы
        System.out.println(norm2);//вывод на монитор нормы3

    }
}
