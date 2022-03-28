package course2.Questions.Tests;

public class Quest24
{
    public static void main(String[] args)
    {
        //классы надо создать перед тем, как использовать
        class MedicalStaff {}
        class Doctor extends MedicalStaff {}
        class Nurse extends MedicalStaff {}
        class HeadDoctor extends MedicalStaff {}

        MedicalStaff medic = new HeadDoctor();
        if(medic instanceof Nurse)
        {
            System.out.println("Nurse");
        }
        else if (medic instanceof Doctor)
        {
            System.out.println("Doctor");
        }
        else if (medic instanceof HeadDoctor)
        {
            System.out.println("HeadDoctor");
        }





    }
}
