package course2.Lessons.Lesson3.Operators;

public class BitOperatorAnd$procent$
{
    public static void main(String[] args)//страница 39
    {
        System.out.println("5%1=" + 5%1 + "5%2=" + 5%2);

        int b1 = 0b1110; //14
        int b2 = 0b1001; //9
        int i = 0;

        /**
         * Битовые операции работают над переменной в двоичной форме
         * соотнося их бинарный код в столбик относительно друг друга
         */

        //битовое "ИЛИ"
        System.out.println(b1 + "|" + b2 + " = " + (b1|b2) );
        //битовое "И"
        System.out.println(b1 + "&" + b2 + " = " + (b1&b2) );
        //битовое исключающее "ИЛИ"
        System.out.println(b1 + "^" + b2 + " = " + (b1^b2) );
        //битовое "НЕ"
        System.out.println(     "~" + b2 + " = " + (~b2) );
        //сдвиг вправо
        System.out.println(b1 + ">>" + ++i + " = " + (b1>>i) );
        //сдвиг влево
        System.out.println(b1 + "<<" + i + " = " + (b1<<i++) );
        //сдвиг вправо с появлением нулей
        System.out.println(b1 + ">>>" + i + " = " + (b1>>>i) );
    }
}
