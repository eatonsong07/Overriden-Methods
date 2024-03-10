public class Student extends Person{

    private int grade;

    private String school;

    public Student(String name, int age,int grade1,String school1){
        super(name,age);
        grade=grade1;
        school=school1;
        System.out.println("Student");
    }

    public String getInformation()
    {

        return super.getInformation() + "\nI go to " + school+ ". I am in "+ grade +"th grade.";
    }

}
