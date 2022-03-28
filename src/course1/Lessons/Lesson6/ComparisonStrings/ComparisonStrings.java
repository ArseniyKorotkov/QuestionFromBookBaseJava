package course1.Lessons.Lesson6.ComparisonStrings;

public class ComparisonStrings //сравнение строк
{
    public static void main(String[] args)
    {
        String s1, s2;

        s1 = "Java";
        s2 = s1;//переменная ссылается на ту же ссылку
        System.out.println("сравнение ссылок " + ( s1 == s2)); //результат true

        s2 = new String(s1);
        System.out.println("сравнение ссылок " + ( s1 == s2)); //результат false
        System.out.println("сравнение значений " + s1.equals(s2));//результат true
    }
}
