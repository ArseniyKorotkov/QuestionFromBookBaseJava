package course2.Lessons.Lesson3.Operators;

public class LogicOperators
{
    public static void main(String[] args)
    {
        /**
         * пример использования тернарного оператора "?:"(if-then-else)
         *   строка 17 говорит: если purchaseItem > 3, то bonus = 10
         *                                              иначе  bonus = 0
         */

        /*
        int defineBonus(int purchaseItem)
        {
            int bonus;
            bonus = purchaseItem > 3 ? 10 : 0;
            return bonus;
        }
         */

        /**
         *пример использования оператора определения
         *принадлежности к типу instanceof
         */
        class Course {/*  */}
        class BaseCourse extends Course {/*  */}
        class FreeCourse extends BaseCourse {/*  */}
        class OptionalCourse extends Course {/*  */}

        Course c = new Course();
        BaseCourse b = new BaseCourse();
        FreeCourse f = new FreeCourse();
        OptionalCourse o = new OptionalCourse();
        /**
         *возвращает true, если объект принадлежит классу
         *или его классам-радителям
         ***всегда true для Object***
         ***всегда false для null***
         */
        System.out.println(b instanceof Course);
        System.out.println(f instanceof Course);
        System.out.println(f instanceof BaseCourse);
        System.out.println(c instanceof Object);
        System.out.println(c instanceof BaseCourse);
    }
}
