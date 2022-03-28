package course2.Questions.VariableB;

public class Question2
{
    public void task(int k)
    {
        System.out.println("******************************************************************************");
        System.out.println("Матрица для модуля числа k равного "+ k + ":");
        if (k<0)
        {
            k *= (-1);
        }
        for(int q = 0; q<k; q++)
        {//q - номер строки
            for(int w = 0; w<k; w++)
            {//w - номер столбца
                if(q == w)
                {
                    System.out.print(q + " ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
