package course2.Questions.VariableB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1
{
    public void task(int q, int w, int e) throws IOException
    {
        int n = q;
        int m = w;
        int k = e;

        //0
        if(n < k && k <= m)
        {
            System.out.println(k +" = (" + n + ", " + m + "] true");
        }
        else
        {
            System.out.println(k +" = (" + n + ", " + m + "] false");
        }

        //1
        if(n <= k && k < m)
        {
            System.out.println(k +" = [" + n + ", " + m + ") true");
        }
        else
        {
            System.out.println(k +" = [" + n + ", " + m + ") false");
        }

        //2
        if(n < k && k < m)
        {
            System.out.println(k +" = (" + n + ", " + m + ") true");
        }
        else
        {
            System.out.println(k +" = (" + n + ", " + m + ") false");
        }

        //3
        if(n <= k && k <= m)
        {
            System.out.println(k +" = [" + n + ", " + m + "] true");
        }
        else
        {
            System.out.println(k +" = [" + n + ", " + m + "] false");
        }
        System.out.println();
    }
}
