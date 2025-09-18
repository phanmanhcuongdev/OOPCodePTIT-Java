import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class J04005 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        String birth = scanner.nextLine().trim();
        float grade1 = scanner.nextFloat();
        float grade2 = scanner.nextFloat();
        float grade3 = scanner.nextFloat();
        scanner.close();

        Student a = new Student(name,birth,grade1,grade2,grade3);

        System.out.printf("%s %s %.1f",a.getName(),a.getBirth(),a.getAllGrade());


    }
}
class Student
{
    private String name;
    private LocalDate birth;
    private float grade1;
    private float grade2;
    private float grade3;
    private float allGrade;

    public Student(){}
    public Student(String name,String birth,float grade1,float grade2,float grade3)
    {
        this.name=name;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birth = LocalDate.parse(birth, fmt);
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
        this.allGrade = grade1+grade2+grade3;
    }

    public String getBirth() {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return birth.format(fmt);
    }
    public String getName() {return name;}
    public float getGrade1() {return grade1;}
    public float getGrade2() {return grade2;}
    public float getGrade3() {return grade3;}
    public float getAllGrade() {return allGrade;}

}
