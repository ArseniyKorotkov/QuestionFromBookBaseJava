package course2.Questions.VariableC;

import java.util.ArrayList;

public class Question8//поиск определителя матрицы
{
    public void task(int matrix[][], int n)
    {
        /**
         *
         * ОПРЕДЕЛЯЕМ АДРЕСА МАТРИЦЫ ДЛЯ ВЫЧИСЛЕНИЙ
         *
         */

        //создаем переменную, обозначающую количество блоков умножения для вычисления определителя матрицы
        int stringQuantity = 1;

        for(int q = 1; q <= n; q++)
        {//вычисляем количество блоков умножения для вычисления определителя матрицы исходя из ее размеров
            stringQuantity *= q;
        }

        //создаем массив адресов матрицы для вычислений
        int [][] adresses = new int[stringQuantity][n];

        //создаем массив адресов для проверки соответствия блока на применение в вычислениях
        ArrayList<Integer> adress = new ArrayList<Integer>();

        /**
         * ЗАПОЛНЕНИЕ МАССИВА
         */
        for(int q = 0; q<n; q++)
        {//заполняем массив значений адреса первым блоком
            adress.add(q, 0);
        }
        //создаем проверочную переменную для остановки цикла заполнения массива адресов
        boolean globalCheck = true;
        //создаем переменную счета строк массива адресов
        int yAdresses = 0;
        //создаем проверочную переменную для отбора подходящих адресов
        boolean check;


        while(globalCheck)
        {//цикл заполнения массива адресов
            check = true;

            for(int q = 0; q<n; q++)
            {//цикл проверки массива значений адреса на наличие одинаковых в элементов внем
                //создаем временную переменную для запоминания проверяемого элемента
                int spare = adress.get(q);
                //меняем проверяемый элемент в массиве значений адреса на тот,
                // которого быть в массиве не может. Я выбрал "-1"
                adress.set(q, -1);
                if(adress.contains(spare))
                {//если массив значений адреса все равно содержит в себе проверяемый элемент
                    check = false;//то сам адрес подлежит отбраковке
                }
                //возвращаем элемент на свое место
                adress.set(q, spare);
            }

            /**
             * КОПИРОВАНИЕ МАССИВА
             */
            if(check)
            {//если адрес прошел отбраковку
                for(int x = 0; x<n; x++)
                {//то он заносится в массив адресов
                    adresses[yAdresses][x] = adress.get(x);
                }
                //строка массива адресов перемещается на следующую
                yAdresses++;
            }

            /**
             * ФОРМИРОВАНИЕ СЛЕДУЮЩЕГО ШАГА
             */
            //прибавляем к последнему элементу массива значений адреса единицу
            adress.set(n-1, adress.get(n-1)+1);

            //проверяем, что бы увеличение на единицу соответствовало n-тичной системе счисления
            for(int x = n-1; x>=0; x--)
            {//цикл проверки каждого элемента с конца на соответствие n-тичной системе счисления
                if(adress.get(x) > n - 1)
                {//если значение больше, чем n
                    adress.set(x, 0);//то оно приравнивается нулю
                    adress.set(x-1, adress.get(x-1)+1);//предыдущий элемент увеличивается на единицу
                }
            }

            if(adress.get(0) == adress.get(1) && adress.get(0) == n-1)
            {//если первые два элемента массива равны n, то рассчеты можно прекращать
                globalCheck = false;
            }

        }//конец цикла заполнения адресов


        /**
         *
         * ПРОИЗВОДИМ УМНОЖЕНИЕ ЭЛЕМЕНТОВ ВНУТРИ БЛОКОВ МАССИВА АДРЕСОВ
         *
         */
        //создаем массив перемноженных между собой элементов массива адресов
        ArrayList <Integer> multiplicationsAdresses = new ArrayList<>();

        for(int y = 0; y<stringQuantity; y++)
        {//перебор строк в массиве адресов
            //создаем переменную значения умножения
            int resultMultiplication = 1;

            for(int x = 0; x<n; x++)
            {//перебор позиций в строке
                resultMultiplication *= matrix[x][ adresses[y][x] ];
            }
            //добавление результата в массив перемноженных между собой элементов массива адресов
            multiplicationsAdresses.add(resultMultiplication);
        }

        /**
         *
         * ПРОИЗВОДИМ ВЫЧИСЛЕНИЕ ЗНАКОВ ЭЛЕМЕНТОВ
         *
         */

        //первый этап присвоения знаков - приведение их к блокам +--++-
        for(int q = 0; q<multiplicationsAdresses.size(); q++)
        {
            if( (q-1)%6 == 0 || (q-2)%6 == 0 || (q-5)%6 == 0 )
            {//каждая вторая, третья и шестая строки (при счете от первой) модулируются как отрицательные
                multiplicationsAdresses.set(q, multiplicationsAdresses.get(q)*(-1));
            }
        }

        //второй этап присвоения знаков(умножение на "-1" в соответствии со знаками чисел матриц
        // более высокого порядка, чем 3
        int spareOld = -1;
        for(int n2 = n; n2>3; n2--)
        {//счет ступеней вычисления
            int spare = 1;
            for(int step = 1; step < n2; step++)
            {//вычисляем число для формулы
                spare *= step;
            }
            //переключетель умножения на "-1"
            boolean checkNegative = false;
            for(int numberFromStringQuantity = 0; numberFromStringQuantity<stringQuantity; numberFromStringQuantity++)
            {//счет номеров элементов
                if( numberFromStringQuantity % spare == 0 && numberFromStringQuantity !=0 )
                {//если номер строки делится на раннее расчитанное число то
                    if(checkNegative)
                    {//если переключатель включен
                        checkNegative = false;//то переключатель выключается
                        //System.out.println("НЕ умножаем. строка " + numberFromStringQuantity + ", порядок " + n2 );
                    }
                    else
                    {//если переключатель выключен
                        checkNegative = true;//то он включается
                        //System.out.println("умножаем. строка " + numberFromStringQuantity + ", порядок " + n2 );
                    }

                    if( numberFromStringQuantity % spareOld == 0 && numberFromStringQuantity !=0 && spareOld != -1)
                    {
                        checkNegative = false;//то переключатель выключается
                        //System.out.println("HE умножаем. строка " + numberFromStringQuantity + ", порядок " + n2 );
                    }
                }

                if(checkNegative)
                {
                    multiplicationsAdresses.set(numberFromStringQuantity, multiplicationsAdresses.get(numberFromStringQuantity)*(-1));
                }
            }
            spareOld = spare;
        }

        for(int q = 0; q<multiplicationsAdresses.size(); q++)
        {
            //System.out.println((q+1) + ". " + multiplicationsAdresses.get(q) );
        }

        /**
         *
         * ПРОИЗВОДИМ ВЫЧИСЛЕНИЕ ОПРЕДЕЛИТЕЛЯ МАТРИЦЫ
         *
         */

        int matrixIdentify = 0;

        for(int q = 0; q<multiplicationsAdresses.size(); q++)
        {
            matrixIdentify += multiplicationsAdresses.get(q);
        }

        System.out.println("Модуль матрицы: " + matrixIdentify);




    }//конец программы
}
