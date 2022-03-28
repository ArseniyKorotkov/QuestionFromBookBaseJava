package course1.Lessons.Lesson2.FirstProgram;

public class FirstProgram //вывод текста на экран объктно-ориентированным приложением
{
    public static void main(String[] args)
    {
        //объявление и создание обекта firstObject класса SloganAction
        SloganAction firstObject = new SloganAction();

        //вызов метода printSlogan() объекта firstObject
        firstObject.printSlogan();

    }
}
