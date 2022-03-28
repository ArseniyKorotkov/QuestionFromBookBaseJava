package course1.Qwestions.VariableA;

import java.util.Scanner;

public class Question4
{
    public void task()
    {
        System.out.print("Enter password: ");

        Scanner scan = new Scanner(System.in);
        String passwordIn = scan.next();
        String password = "koding";

        if(password.equals(passwordIn))
        {
            System.out.println("You password it is OK!");
            System.out.println("Welcome to your program");
            System.out.println("...");
        }
        else
        {
            System.out.println("Good, BUT it is NO PASSWORD!!!");
        }

    }
}
