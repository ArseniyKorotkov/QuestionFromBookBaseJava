package course2.Questions.VariableC;

public class Question3
{
    public void task(int[][]matrix, int n)
    {
        System.out.println("Самая длинная последовательность чисел по возрастанию: ");
        //строка запоминания последовательности
        String longSequence = "";
        //строка запоминания самой большой последовательности
        String mostLongSequence = "";

        //длина последовательности
        int lengthOfLongSequence = 0;
        //длина самой большой последовательности
        int lengthOfMostLongSequence = 0;

        //крайнее число последовательности
        int extremeNumberOfTheSequence = 0;
        //следующее за последовательностью число
        int NextNumber = 0;
        //последнее число последовательности
        int lastNumberOfTheSequence = 0;

        //перебор матрицы
        for(int y = 0; y<n; y++)
        {//по строкам
            for(int x = 0; x<n; x++)
            {//по столбцам
                if(x+1 == n)
                {//если столбец крайний
                    if(y+1 != n)
                    {//если есть следующая строка
                        //крайнее число равно исследуемому
                        extremeNumberOfTheSequence = matrix[y][x];
                        //System.out.print(q + " ");
                        //следующее число равно первому числу следующей строки
                        NextNumber = matrix[y+1][0];
                        //System.out.println(z + " ");
                    }
                }
                else
                {//если столбец не крайний
                    //крайнее число равно исследуемому
                    extremeNumberOfTheSequence = matrix[y][x];
                    //System.out.print(q + " ");
                    //следующее число равно следующему за исследуемым
                    NextNumber = matrix[y][x+1];
                    //System.out.println(z + " ");
                }

                //System.out.println( extremeNumberOfTheSequence + " " + NextNumber);

                if(NextNumber>extremeNumberOfTheSequence &&  (x+1 != n || y+1 != n) )
                {//если следующее число больше крайнего и не является последним в матрице
                    //добавляется 1 к длине последовательности
                    lengthOfLongSequence++;
                    //вписываем крайнее число в последовательность
                    if(extremeNumberOfTheSequence < 0)
                    {
                        longSequence += "["+extremeNumberOfTheSequence + "] ";
                    }
                    else
                    {
                        longSequence += "[ "+extremeNumberOfTheSequence + "] ";
                    }
                    //последнее число приравниваем следующему за крайним
                    lastNumberOfTheSequence = NextNumber;

                }
                else
                {//если следующее число меньше или равно крайнему или является последним в матрице
                    if(lengthOfLongSequence>lengthOfMostLongSequence)
                    {//если размер последовательности больше размера самой большой последовательности
                        //размер самой большой последовательности равен размеру этой последовательности
                        lengthOfMostLongSequence = lengthOfLongSequence;
                        //размер последовательности обнуляется
                        lengthOfLongSequence = 0;
                        //последовательность + последнее ее число записывается как самая длинная
                        if(lastNumberOfTheSequence >= 0)
                        {
                            mostLongSequence = longSequence + "[ "+lastNumberOfTheSequence+"] ";
                        }
                        else
                        {
                            mostLongSequence = longSequence + "["+lastNumberOfTheSequence+"] ";
                        }
                    }
                    else
                    {//если размер последовательности меньше размера самой большой последовательности
                        //размер последовательности обнуляется
                        lengthOfLongSequence = 0;
                    }
                    //строка последовательности обнуляется
                    longSequence = "";
                }
            }
        }
        System.out.println(mostLongSequence);
    }
}
