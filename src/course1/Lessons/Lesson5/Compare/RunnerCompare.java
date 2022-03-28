package course1.Lessons.Lesson5.Compare;

import course1.Lessons.Lesson4.Coin.Coin;

public class RunnerCompare
{
    public static void main(String[] args)
    {
        Coin ob1 = new Coin();
        ob1.setDiameter(-11); //сообщение о неправильных данных
        ob1.setDiameter(12);
        ob1.setWeight(150);

        Coin ob2 = new Coin();
        ob2.setDiameter(21);
        ob1.setWeight(170);

        CompareCoin ca = new CompareCoin();
        ca.compareDiameter(ob1, ob2);
    }
}
