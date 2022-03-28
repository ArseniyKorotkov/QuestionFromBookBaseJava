package course1.Lessons.Lesson5.Compare;

import course1.Lessons.Lesson4.Coin.Coin;


public class CompareCoin //сравнение монет
{
    public void compareDiameter(Coin first, Coin second)
    {
        double delta = first.getDiameter() - second.getDiameter();

        if(delta > 0)
        {
            System.out.println("Первая монета больше второй на " + delta);
        }
        else if(delta == 0)
        {
            System.out.println("Монеты равны");
        }
        else
        {
            System.out.println("Вторая монета больше первой на " + -delta);
        }
    }
}
