import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J06009{
    public static void main(String[] args){
        try
        {
            Scanner sc = new Scanner(new File("KH.in"));
            List<KhachHang> khachHangs = KhachHang.Input(sc);
            sc.close();

            Scanner sc1 = new Scanner(new File("MH.in"));
            List<MatHang> matHangs = MatHang.Input(sc1);
            sc1.close();

            Scanner sc2 = new Scanner(new File("HD.in"));
            List<HoaDon> hoaDons = HoaDon.Input(sc2,matHangs,khachHangs);
            sc2.close();

            for(HoaDon x: hoaDons)
            {
                System.out.println(x.toString());
            }


        }catch(FileNotFoundException ex)
        {

        }
    }
}

class KhachHang{
    private static int dem = 0;

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    private String maKhachHang;
    private String tenKhachHang;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public KhachHang() {}

    public KhachHang(String tenKhachHang,String gioiTinh,String ngaySinh,String diaChi){
        this.maKhachHang = String.format("KH%03d",++dem);
        this.gioiTinh = gioiTinh;
        this.tenKhachHang = tenKhachHang;
        this.ngaySinh = parseTo_ddMMyyyy(ngaySinh);
        this.diaChi = diaChi;
    }

    public static String parseTo_ddMMyyyy(String s)
    {
        List<DateTimeFormatter> fmts = Arrays.asList(
                DateTimeFormatter.ofPattern("dd/MM/yyyy"),
                DateTimeFormatter.ofPattern("MM/dd/yyyy"),
                DateTimeFormatter.ofPattern("d/M/yyyy"),
                DateTimeFormatter.ofPattern("M/d/yyyy")
        );

        for(DateTimeFormatter fmt : fmts)
        {
            try
            {
                LocalDate date = LocalDate.parse(s,fmt);
                return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }catch (DateTimeParseException ex){}
        }
        return "00/00/0000";

    }

    public static List<KhachHang> Input(Scanner sc){
        List<KhachHang> result = new ArrayList<>();
        int x = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < x;i++ )
        {
            String tenKhachHang = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            result.add(new KhachHang(tenKhachHang,gioiTinh,ngaySinh,diaChi));
        }
        return result;
    }

}

class HoaDon{
    private static int dem = 0;
    private String maHoaDon ;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;

    public HoaDon(String maKhachHang,String maHangHoa,int soLuong,List<MatHang> matHangs,List<KhachHang> khachHangs) {
        this.maHoaDon = String.format("HD%03d",++dem);
        this.soLuong = soLuong;
        for(MatHang x : matHangs){
            if(x.getMaMatHang().equals(maHangHoa))
            {
                this.matHang = x;
            }
        }

        for(KhachHang x : khachHangs){
            if(x.getMaKhachHang().equals(maKhachHang))
            {
                this.khachHang = x;
            }
        }
    }

    @Override
    public String toString()
    {
        return String.format("%s %s %s %s %s %d %d %d %d",this.maHoaDon,this.khachHang.getTenKhachHang(),this.khachHang.getDiaChi(),this.matHang.getTenMatHang(),this.matHang.getDonViTinh(),this.matHang.getGiaMua(),this.matHang.getGiaBan(),soLuong,this.matHang.getGiaBan()*soLuong);
    }

    public static List<HoaDon> Input(Scanner sc,List<MatHang> matHangs,List<KhachHang> khachHangs){
        List<HoaDon> result = new ArrayList<>();
        int x = Integer.parseInt(sc.nextLine());
        for(int i=0;i<x;i++){
            String maKhachHang = sc.next();
            String maMatHang = sc.next();
            int soLuong = sc.nextInt();
            result.add(new HoaDon(maKhachHang,maMatHang,soLuong,matHangs,khachHangs));
        }
        return result;
    }

}

class MatHang{
    private static int dem = 0;
    private String maMatHang;
    private String tenMatHang;
    private String donViTinh;
    private int giaMua;
    private int giaBan;

    public MatHang() {}

    public MatHang(String tenMatHang,String donViTinh,int giaBan,int giaMua){
        this.maMatHang = String.format("MH%03d",++dem);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaBan = giaBan;
        this.giaMua = giaMua;
    }

    public static List<MatHang> Input(Scanner sc){
        List<MatHang> result = new ArrayList<>();
        int x = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < x;i++ )
        {
            String tenMatHang = sc.nextLine();
            String donViTinh = sc.nextLine();
            int giaMua = Integer.parseInt(sc.nextLine());
            int giaBan = Integer.parseInt(sc.nextLine());
            result.add(new MatHang(tenMatHang,donViTinh,giaBan,giaMua));
        }
        return result;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    public void setMaMatHang(String maMatHang) {
        this.maMatHang = maMatHang;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
}