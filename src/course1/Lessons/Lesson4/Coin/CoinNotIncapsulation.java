package course1.Lessons.Lesson4.Coin;

public class CoinNotIncapsulation //работа над ошибками инкапсуляции
{
    public double diameter; //пример нарушения инкапсуляции
    private double weight; //правильная инкапсуляция

    public double getDiameter()
    {
        return diameter;
    }

    public void setDiameter(double value)
    {
        if(value > 0)
        {
            diameter = value;
        }
        else
        {
            diameter = 0.01; //значение по умолчанию
        }
    }

    public double takeWeight() //так называть нельзя
    {
        return weight;
    }

    public void setWeight(double value)
    {
        weight = value;
    }
}
