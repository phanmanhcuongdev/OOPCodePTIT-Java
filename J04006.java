import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class J04006 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        String clasS = scanner.nextLine().trim();
        String birth = scanner.nextLine().trim();
        float grade1 = scanner.nextFloat();
        scanner.close();

        Student a = new Student();

        a.setName(name);a.setBirth(birth);a.setClasS(clasS);a.setGrade1(grade1);a.setId("B20DCCN001");

        System.out.printf("%s %s %s %s %.2f",a.getId(),a.getName(),a.getClasS(),a.getBirth(),a.getGrade1());

    }
}
class Student
{
    private String name;
    private LocalDate birth;
    private float grade1;
    private String id;
    private String clasS;

    public Student(){}
//    public Student(String name,String birth,float grade1,String id)
//    {
//        this.name=name;
//
//        DateTimeFormatter fmt = new DateTimeFormatterBuilder()
//            .appendValue(ChronoField.DAY_OF_MONTH)
//            .appendLiteral('/')
//            .appendValue(ChronoField.MONTH_OF_YEAR)
//            .appendLiteral('/')
//            .appendValue(ChronoField.YEAR, 4)
//            .toFormatter();
//        this.birth = LocalDate.parse(birth, fmt);
//        this.grade1=grade1;
//        this.id=id;
//        this.clasS = "B20DCCN001";
//    }

    public String getBirth() {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return birth.format(fmt);
    }
    public String getName() {return name;}
    public float getGrade1() {return grade1;}
    public String getId() {return id;}
    public String getClasS() {return clasS;}
    public void setName(String name) {this.name = name;}
    public void setId(String id) {this.id = id;}
    public void setClasS(String clasS) {this.clasS = clasS;}
    public void setBirth(String birth)
    {
        DateTimeFormatter fmt = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.DAY_OF_MONTH)
            .appendLiteral('/')
            .appendValue(ChronoField.MONTH_OF_YEAR)
            .appendLiteral('/')
            .appendValue(ChronoField.YEAR, 4)
            .toFormatter();
        this.birth = LocalDate.parse(birth, fmt);
    }
    public void setGrade1(float grade1){this.grade1=grade1;}
}
