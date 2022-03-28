package course2.Questions.VariableC;

public class Question9
{
    public void task(double matrix[][], int n)
    {
        for(int y = 0; y<n; y++)
        {//перебираем строки

            double sumMatrixString = 0;//сумма элементов в строке
            double averageMatrixString = 0;//среднее арифметическое элементов строки

            for(int x = 0; x<n; x++)
            {//перебираем столбцы
                sumMatrixString += matrix[y][x];//складываем все элементы строки
            }

            averageMatrixString = sumMatrixString/(double) n;//находим среднее арифметическое элементов строки

            for(int x = 0; x<n; x++)
            {//перебираем столбцы
                //вычетаем среднее арифметическое элементов строки из элементов строки
                matrix[y][x] = matrix[y][x] - averageMatrixString;
            }
        }
        System.out.println("Вычитание из элементов матрицы среднего значения соответствующей строки");
        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                if( matrix[y][x] < 0)
                    System.out.print("["+ String.format("%.2f",  matrix[y][x]) + "] ");
                else
                    System.out.print("[ "+String.format("%.2f",  matrix[y][x]) + "] ");
            }
            System.out.println();
        }

    }
}
