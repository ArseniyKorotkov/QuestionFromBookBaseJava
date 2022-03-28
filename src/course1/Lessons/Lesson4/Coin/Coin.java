package course1.Lessons.Lesson4.Coin;

public class Coin //правильная инкапсуляция
{
    private double diameter; //исправлен доступ по правилам инкапсуляции
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
            System.out.println("Отрицательный диаметр"); //указание на ошибку
        }
    }

    public double getWeight() //так называть нужно
    {
        return weight;
    }

    public void setWeight(double value)
    {
        weight = value;
    }
}
