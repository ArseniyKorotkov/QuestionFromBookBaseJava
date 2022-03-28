package course2.Questions.VariableB;

public class Question4
{
    public void task(int k)
    {
        System.out.println();
        System.out.println("*************************************************************************");
        if (k<0)
        {
            k *= (-1);
        }

        switch(k)
        {
            case 1:
                System.out.println("Модулю числа k, равному " +k+ ", соответствует месяц Январь");
                break;
            case 2:
                System.out.println("Модулю числа k, равному " +k+ ", соответствует месяц Февраль");
                break;
            case 3:
                System.out.println("Модулю числа k, равному " +k+ ", соответствует месяц Март");
                break;
            case 4:
                System.out.println("Модулю числа, равному " +k+ ", соответствует месяц Апрель");
                break;
            case 5:
                System.out.println("Модулю числа k, равному " +k+ ", соответствует месяц Май");
                break;
            case 6:
                System.out.println("Модулю числа k, равному " +k+ ", соответствует месяц Июнь");
                break;
            case 7:
                System.out.println("Модулю числа k, равному " +k+ ", соответствует месяц Июль");
                break;
            case 8:
                System.out.println("Модулю числа k, равному " +k+ ", соответствует месяц Август");
                break;
            case 9:
                System.out.println("Модулю числа k, равному " +k+ ", соответствует месяц Сентябрь");
                break;
            case 10:
                System.out.println("Модулю числа k, равному " +k+ ", соответствует месяц Октябрь");
                break;
            case 11:
                System.out.println("Модулю числа k, равному " +k+ ", соответствует месяц Ноябрь");
                break;
            case 12:
                System.out.println("Модулю числа k, равному " +k+ ", соответствует месяц Декабрь");
                break;
            default:
                System.out.println("Модулю числа k, равному " +k+ ", не соответствует никакой месяц");
        }
    }
}
