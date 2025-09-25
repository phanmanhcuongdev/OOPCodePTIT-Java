import java.util.Date;
import java.util.Scanner;

public class J04007 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String gender = scanner.nextLine();
        String birth = scanner.nextLine();
        String address = scanner.nextLine();
        String taxId = scanner.nextLine();
        String dateOfContract = scanner.nextLine();
        Employee x = new Employee(name,gender,birth,address,taxId,dateOfContract);
        scanner.close();
        System.out.println(x.toString());
    }
}
class Employee
{
    private String id = "00001";
    private String name;
    private String gender;
    private String birth;
    private String address;
    private String taxId;
    private String dateOfContract;

    public Employee(String name, String gender,String birth,String address, String taxId, String dateOfContract)
    {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
        this.taxId = taxId;
        this.dateOfContract = dateOfContract;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        this.dateOfContract = dateOfContract;
    }
    @Override
    public String toString()
    {
        return id + " " + getName() + " " +getGender() + " " + getBirth() + " " + getAddress() + " " + getTaxId() + " " + dateOfContract ;
    }
}
