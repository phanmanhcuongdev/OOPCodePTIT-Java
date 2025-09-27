import java.util.Scanner;
import java.math.BigInteger;
import java.lang.String;

public class J04015
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        String name = scanner.nextLine();
        BigInteger basic_salary = scanner.nextBigInteger();
        scanner.close();
        BigInteger fullsalary = BigInteger.ZERO;
        BigInteger support = BigInteger.ZERO;
        int number = 0;
        if(id.substring(0,2).equals("HP"))
        {
            number = Integer.parseInt(id.substring(2));
            support = BigInteger.valueOf(900000);
            fullsalary = basic_salary.multiply(BigInteger.valueOf(number)).add(support);
        }
        if(id.substring(0,2).equals("HT"))
        {
            number = Integer.parseInt(id.substring(2));
            support = BigInteger.valueOf(2000000);
            fullsalary = basic_salary.multiply(BigInteger.valueOf(number)).add(support);
        }
        if(id.substring(0,2).equals("GV"))
        {
            number = Integer.parseInt(id.substring(2));
            support = BigInteger.valueOf(500000);
            fullsalary = basic_salary.multiply(BigInteger.valueOf(number)).add(support);
        }
        GiaoVien a = new GiaoVien(id,name,support,fullsalary,number);
        System.out.println(a.toString());
    }

}
class GiaoVien
{
    private String id;
    private String name;
    private BigInteger support;
    private BigInteger income;
    private int number;
    public GiaoVien(String id,String name,BigInteger support,BigInteger income,int number)
    {
        this.number = number;
        this.id = id;
        this.name = name;
        this.support = support;
        this.income = income;
    }

    @Override
    public String toString()
    {
        return id + " " + name + " " + number + " " + support + " " + income;
    }

}