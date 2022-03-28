package course2.Questions.Tests;

public class Quest25
{
    public static void main(String[] args)
    {
        boolean e1 = true;
        boolean e2 = false;
        String s = "x";

        if(e1)
            if(e2)
                s = "?S1";
            else
                s = "?S2";

        System.out.println(s);
        s = "x";

        if(e1)
        {
            if(e2)
                s = "1S1";
            else
                s = "1S2";
        }

        System.out.println(s);
        s = "x";

        if(e1)
        {
            if(e2)
            s = "2S1";
        }
        else
            s = "2S2";

        System.out.println(s);
        s = "x";

        if(e1)
            if(e2)
                s = "3S1";
            else;
            else
                s = "3S2";

        System.out.println(s);
        s = "x";

        if(e1)
            if(e2)
                s = "4S1";
            else s = "4S2";
            else;

        System.out.println(s);
    }
}
