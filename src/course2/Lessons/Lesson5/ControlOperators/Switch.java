package course2.Lessons.Lesson5.ControlOperators;

public class Switch
{
    public int defineLevel(String role)
    {
        int level = 0;
        switch (role)
        {
            case "guest":
                level = 1;
                break;
            case "client": level = 2;
                break;
            default: throw new IllegalArgumentException();
        }
            return level;
    }
}

