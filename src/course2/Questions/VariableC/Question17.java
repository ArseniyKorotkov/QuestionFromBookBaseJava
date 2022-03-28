package course2.Questions.VariableC;

public class Question17
{
    public void task(int[][]matrix, int n)
    {


        //значение количества локальных минимумов
        int localMinQuntity = 0;

        if( matrix[0][0]<matrix[1][0] && matrix[0][0]<matrix[0][1] )//условие для верхнего левого угла матрицы
        {
            localMinQuntity++;
            //System.out.println("check1");
        }

        if( matrix[0][n-1]<matrix[0][n-2] && matrix[0][n-1]<matrix[1][n-1] )//условие для верхнего левого угла матрицы
        {
            localMinQuntity++;
            //System.out.println("check2");
        }

        if(  matrix[n-1][0]<matrix[n-2][0] && matrix[n-1][0]<matrix[n-1][1] )//условие для нижнего левого угла матрицы
        {
            localMinQuntity++;
            //System.out.println("check3");
        }

        if(  matrix[n-1][n-1]<matrix[n-2][n-1] && matrix[n-1][n-1]<matrix[n-1][n-2] )//условие для нижнего правого угла матрицы
        {
            localMinQuntity++;
            //System.out.println("check4");
        }


        for(int y = 0; y < n; y++)
        {//перебираем строки
            for(int x = 0; x < n; x++)
            {//перебираем столбцы


                if( x==0 && y!=0 && y!=n-1 )//условие для левого края матрицы
                {
                    if(matrix[y][x]<matrix[y+1][x] && matrix[y][x]<matrix[y-1][x] && matrix[y][x]<matrix[y][x+1])
                    {
                        localMinQuntity++;
                        //System.out.println("check5");
                    }
                }

                if( x==n-1 && y!=0 && y!=n-1 )//условие для правого края матрицы
                {
                    if(matrix[y][x]<matrix[y+1][x] && matrix[y][x]<matrix[y-1][x] && matrix[y][x]<matrix[y][x-1])
                    {
                        localMinQuntity++;
                        //System.out.println("check6");
                    }
                }

                if( y==0 && x!=0 && x!=n-1 )//условие для верхнего края матрицы
                {
                    if(matrix[y][x]<matrix[y+1][x] && matrix[y][x]<matrix[y][x-1] && matrix[y][x]<matrix[y][x+1])
                    {
                        localMinQuntity++;
                        //System.out.println("check7");
                    }
                }

                if( y==n-1 && x!=0 && x!=n-1 )//условие для нижнего края матрицы
                {
                    if(matrix[y][x]<matrix[y-1][x] && matrix[y][x]<matrix[y][x-1] && matrix[y][x]<matrix[y][x+1])
                    {
                        localMinQuntity++;
                        //System.out.println("check8");
                    }
                }

                if( y!=0 && y!=n-1 && x!=0 && x!=n-1 )//условие для середины матрицы
                {
                    if(matrix[y][x]<matrix[y+1][x] && matrix[y][x]<matrix[y][x-1]
                            && matrix[y][x]<matrix[y][x+1] && matrix[y][x]<matrix[y-1][x])
                    {
                        localMinQuntity++;
                        //System.out.println("check9");
                    }
                }
            }
        }
        System.out.print("Количество локальных минимумов: ");
        System.out.println(localMinQuntity);
    }
}
