package course1.Qwestions.VariableA;

import java.util.Scanner;

public class Question5
{
    public void task()
    {

        try
        {
            System.out.println("Enter number for addition: ");
            System.out.println("        ...for stop enter not number");

            int result = 0;
            while(true)
            {
                Scanner scan = new Scanner(System.in);
                String scanString = scan.next();
                int scanInt = Integer.parseInt(scanString);

                result = result + scanInt;
                System.out.print(" = " + result + " + ");
            }
        }
        catch (NumberFormatException e)
        {
            System.err.println("Enter error. Enter NUMBER!!!");
            System.out.println();
            System.out.println();
        }
    }
}
