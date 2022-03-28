package course1.Qwestions.VariableB;

import java.io.*;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainB1
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        String [] strings = str.split(" ");
        ArrayList <String> listString = new ArrayList<String>();
        ArrayList <Integer> list = new ArrayList<Integer>();

        for(int q = 0; q < strings.length; q++)//заполняю лист listString
        {//с фильтрацией лишних пробелов
            if(strings[q].equals(" ")||strings[q].equals(""))
            {
            }
            else
            {
                listString.add(strings[q]);
            }
        }

        try//форматирую String в int и заполняю list числами
        {
            for (int q = 0; q < listString.size(); q++)
            {
                Integer w = Integer.parseInt(listString.get(q));
                list.add(w);
            }
        }
        catch (NumberFormatException e)
        {
            System.err.println("You entered an invalid value...");
            System.err.println("Try again, please!");
        }


        new Question1().task(list);
        new Question2().task(list);
        new Question3().task(list);
        new Question4().task(list);
        new Question5().task(list);
        new Question6().task(list);
        new Question7().task(list);
        new Question8().task(list);
        new Question9().task(list);
        new Question10().task(list);
        new Question11().task(list);
        new Question12().task(list);
        new Question13().task(list);
        new Question14().task(list);
        new Question15().task(list);
        new Question16().task(list);


    }
}

