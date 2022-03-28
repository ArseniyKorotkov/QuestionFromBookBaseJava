package course1.Lessons.Lesson7.Consol;

import java.util.Scanner;

public class RunScanner
{
    public static void main(String[] args)
    {
        System.out.println("Введите имя и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name);
        scan.close();
    }
}
