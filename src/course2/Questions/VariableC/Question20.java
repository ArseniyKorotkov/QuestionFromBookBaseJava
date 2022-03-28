package course2.Questions.VariableC;

import java.util.ArrayList;
import java.util.Collections;

public class Question20
{
    public void task(int[][]matrix, int n)
    {
        ArrayList<Integer> allElements = new ArrayList<>();
        int adressY = 0;
        int adressX = 0;
        int spare = 0;

        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                allElements.add(matrix[y][x]);
            }
        }

        Collections.sort(allElements);
        Collections.reverse(allElements);

        for(int q = 0; q<n; q++)
        {
        OUT:for(int y = 0; y<n; y++)
            {
                for(int x = 0; x<n; x++)
                {
                    if(x != y)
                    {
                        if(matrix[y][x] == allElements.get(q))
                        {
                            spare = matrix[y][x];
                            matrix[y][x] = matrix[q][q];
                            matrix[q][q] = spare;
                            break OUT;
                        }
                    }
                    else
                    {
                        if(matrix[y][x] == allElements.get(q) && x>q)
                        {
                            spare = matrix[y][x];
                            matrix[y][x] = matrix[q][q];
                            matrix[q][q] = spare;
                            break OUT;
                        }
                    }
                }
            }
        }

        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                if(matrix[y][x] < 0)
                    System.out.print("["+matrix[y][x] + "] ");
                else
                    System.out.print("[ "+matrix[y][x] + "] ");
            }
            System.out.println();
        }

    }
}
