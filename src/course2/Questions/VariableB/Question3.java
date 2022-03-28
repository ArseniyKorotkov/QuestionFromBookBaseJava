package course2.Questions.VariableB;

public class Question3
{
    public void task(int a, int b, int c)
    {
        System.out.println();
        System.out.println("**************************************************************************");
        System.out.println("Решение квадратного уравнения где:");
        System.out.println("a = n = " + a);
        System.out.println("b = m = " + b);
        System.out.println("c = k = " + c);
        System.out.println("то есть: "+a+" * x^2 + "+b+" * x + "+c+" = 0");

        double diskriminant = (b*b)-(4*a*c);
        System.out.println("D = " + diskriminant);
        if(diskriminant < 0)
        {
            System.out.println("Решений нет");
        }

        if(diskriminant == 0)
        {
            double answer = (   (double)(-b)  -   Math.sqrt(diskriminant)   )/(2 * a);
            System.out.println("x = "+answer);
        }

        if(diskriminant > 0)
        {
            double answer1 = (   (double)(-b)  +   Math.sqrt(diskriminant)   )/(2 * a);
            double answer2 = (   (double)(-b)  -   Math.sqrt(diskriminant)     )/(2 * a);
            System.out.print("x = "+answer1+ "; "+ answer2);
        }



    }
}
