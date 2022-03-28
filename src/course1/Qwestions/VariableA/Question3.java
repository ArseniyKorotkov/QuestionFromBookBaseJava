package course1.Qwestions.VariableA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question3
{
    public void task()
    {
        System.out.print("Enter quantity for random number: ");

        try
        {
            Scanner scan = new Scanner(System.in);
            String scanStr = scan.next();
            int scanInt = Integer.parseInt(scanStr);

            for(int q = 0; q<scanInt; q++)
            {
                double random = Math.random()*100;
                DecimalFormat df = new DecimalFormat("##");
                String decimalString = df.format(random);
                System.out.print(decimalString + " ");
            }
            System.out.println();

        }
        catch (NumberFormatException e)
        {
            System.err.println("Enter error. Enter NUMBER!!!");
        }


    }
}
