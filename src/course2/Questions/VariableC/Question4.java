package course2.Questions.VariableC;

public class Question4
{
    public void task(int[][]matrix, int n)
    {
        System.out.println("Сумма элементов матрицы, расположенных между " +
                "первым и вторым положительным элементом каждой строки");

        int sum = 0;
        int spareSum = 0;

        for(int y = 0; y<n; y++)
        {//перебор строк
            int check = 0;//элемент для проверки обнуляется после проверки каждой строки
            spareSum = 0;//временная копилка обнуляется после проверки каждой строки
            for(int x = 0; x<n; x++)
            {//перебор элементов в строке
                if(matrix[y][x]>0)
                {//если элемент положительный
                    check++;//элемент для проверки увеличивается на 1
                    if(check == 2)
                    {//если положительный элемент встретился втрой раз в строке
                        sum += spareSum;//то результат временной копилки перекладывается в постоянную
                        break;//и проверка переходит к следующей строке
                    }
                    continue;//и переходит к проверке следующего элемента
                }
                if(check == 1)
                {//если положительный элемент встретился один раз в строке
                    spareSum += matrix[y][x];//то числа после его складываются во временную копилку
                }
                if(check == 2)
                {//если положительный элемент встретился втрой раз в строке
                    sum += spareSum;//то результат временной копилки перекладывается в постоянную
                }
            }
        }
        System.out.println(sum);
    }
}
