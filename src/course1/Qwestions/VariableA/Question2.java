package course1.Qwestions.VariableA;

import java.util.Scanner;

public class Question2
{
    public void task()
    {
        System.out.print("Enter to reverse: ");

        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String revers = new StringBuffer(str).reverse().toString();
        System.out.println(revers);
    }
}
