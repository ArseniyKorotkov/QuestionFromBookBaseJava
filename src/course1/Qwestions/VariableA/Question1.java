package course1.Qwestions.VariableA;

import java.util.Scanner;

public class Question1
{
    public void task()
    {
        System.out.print("Enter your name: ");

        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        System.out.println("Hello, " + s);
    }
}
