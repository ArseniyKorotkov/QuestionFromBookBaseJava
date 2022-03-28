package course2.Lessons.Lesson6.Arrays;

public class Array
{
    public static void main(String[] args)
    {
        int arRef[], ar; //объявление ссылки на массив и переменной
        float[] arRefFloat, arFloat; //два массива
        int arDyn[] = new int[10]; //10 нулей
        String str[] = new String[7]; //7 null-ов

        //объявление с иниацилизацией
        int arInt[] = {1, 4 , -5, 6, 3 };
        int arInt2[] = new int[] {1, 4 , -5, 6, 3 };

        //объявление с помощью ссылки на объект
        Object arObj = new float[5];

        //допустимые присваивания ссылок
        arRef = arDyn;
        arDyn = arInt;
        arRefFloat = (float[])arObj;
        arObj = arInt2;
       // arRefFloat = (float[])arObj;//ошибка выполнения
        //недопустимые присваивания ссылок (нековариантность)
        //arInt = arByte;
        //arInt = (int[])arByte;

        //Массив массивов
        int arr[][] =   { {1},
                          {2,3},
                          {4,5,6}
                        };
        System.out.println(arr[2][1]);
    }
}
