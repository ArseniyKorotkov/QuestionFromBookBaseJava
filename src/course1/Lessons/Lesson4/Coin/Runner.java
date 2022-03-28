package course1.Lessons.Lesson4.Coin;

public class Runner
{
    public static void main(String[] args)
    {
        CoinNotIncapsulation rub = new CoinNotIncapsulation();
        rub.diameter = -13; //допущенный прямой доступ позволяет делать такие ошибки
        rub.setWeight(100);
        //rub.weight = -150;//запрещенный прямой доступ не дает делать такие ошибки(complite error!)


    }
}
