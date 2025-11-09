import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J07010 {
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(new File("SV.in"));

            List<NhanVien> nhanViens = NhanVien.Input(sc);

            sc.close();

            for(NhanVien nhanVien : nhanViens){
                System.out.println(nhanVien.toString());
            }

        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Không tìm thấy file");
        }
    }
}

class NhanVien{
    private static int dem = 0;
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private double gpa;

    public NhanVien(String hoTen,String lop,String ngaySinh,double gpa) {
        this.maSV = String.format("B20DCCN%03d",++dem);
        this.hoTen = hoTen;
        this.lop = lop;
        this.gpa = gpa;
        this.ngaySinh = LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern("d/M/yyyy")).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString()
    {
        return String.format("%s %s %s %s %.2f",maSV,hoTen,lop,ngaySinh,gpa);
    }

    public static List<NhanVien> Input(Scanner sc){
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> nhanViens = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String Class = sc.nextLine();
            String dateOfBirth = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            nhanViens.add(new NhanVien(name,Class,dateOfBirth,gpa));
        }
        return nhanViens;
    }
}
