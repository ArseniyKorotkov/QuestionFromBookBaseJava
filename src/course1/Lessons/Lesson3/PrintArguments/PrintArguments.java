package course1.Lessons.Lesson3.PrintArguments; //работа с командной строкой

//для запуска программы через командную строку необходимо
//1. Вывести класс в папку src
//2. В папку через командную строку ввести javac ClassName.java
//3. Ввести в командную строку java ClassName
//* здесь ClassName - имя класса, которое может быть любым

public class PrintArguments
{
    public static void main(String[] args)
    {

        for(String str : args)
        {
            System.out.println("Your enter is: " + str);
            //русские буквы переданные из скомпилированной программы не читаются
        }


        /*
        for(int i = 0; i < args.length; i++)
        {
            System.out.println("Your enter is: " + args[i]);
        }
         */

        System.out.println("Hello2");
    }
}
