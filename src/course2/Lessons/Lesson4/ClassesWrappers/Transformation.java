package course2.Lessons.Lesson4.ClassesWrappers;

public class Transformation
{
    public static void main(String[] args)
    {
        Float ft = new Float(1.7); //dooble in Float
        Short s = new Short((short)5); //int in Short
        Short sh = new Short("5"); //String in Short
        double d = s.doubleValue(); //Short in double
        byte b = (byte)(float)ft; // Float in byte
        Character ch = new Character('3'); //int in Charaster
        int i = Character.digit(ch.charValue(), 10); //Charaster in int


        //String in Integer/int
        String arg = "71";
        try
        {
            int value1 = Integer.parseInt(arg); //return int
            int value2 = Integer.valueOf(arg); //return Integer
            int value3 = Integer.decode(arg); //return Integer
            int value4 = new Integer(arg); //make Integer - it`s BAD!!!
        }
        catch (NumberFormatException e)
        {
            System.err.println("It is NOT NUMBER!!!");
        }

        //Integer/int in String
        int value = 72;
        String arg1 = Integer.toString(value); //good
        String arg2 = String.valueOf(value); //good
        String arg3 = "" + value; //BAD!!!


        //Float f1 = 7;//bad
        Float f2 = (float)7;
        Float f3 = 7F;
        Float f4 = new Float("7");







    }
}
