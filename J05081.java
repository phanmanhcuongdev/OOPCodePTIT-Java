import java.util.*;
import java.io.*;



public class J05081
{
    public static void main(String[] args)
    {
        List<DanhSachMatHang> ds = new ArrayList<DanhSachMatHang> ();
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0)
        {
            String TenSanPham = scanner.nextLine();
            String DonViTinh = scanner.nextLine();
            int GiaMua = Integer.parseInt(scanner.nextLine());
            int GiaBan = Integer.parseInt(scanner.nextLine());
            DanhSachMatHang x = new DanhSachMatHang(TenSanPham,DonViTinh,GiaMua,GiaBan);
            ds.add(x);
        }
        scanner.close();
        Collections.sort(ds);
        for(DanhSachMatHang x : ds)
        {
            System.out.println(x.toString());
        }
    }
}

class DanhSachMatHang implements Comparable<DanhSachMatHang>
{
    private static int SoMatHang = 0;
    private String MaMatHang;
    private String TenMatHang;
    private String DonViTinh;
    private int GiaMua;
    private int GiaBan;
    private int LoiNhuan;

    public DanhSachMatHang(String TenMatHang,String DonViTinh,int GiaMua,int GiaBan) {
        this.MaMatHang = String.format("MH%03d", ++SoMatHang);
        this.TenMatHang = TenMatHang;
        this.DonViTinh = DonViTinh;
        this.GiaMua = GiaMua;
        this.GiaBan = GiaBan;
        this.LoiNhuan = GiaBan - GiaMua;
    }

    public int getLoiNhuan() {return LoiNhuan;}

    @Override
    public int compareTo(DanhSachMatHang o)
    {
        return o.getLoiNhuan() - this.LoiNhuan;
    }

    @Override
    public String toString()
    {
        return MaMatHang + " " + TenMatHang + " " + DonViTinh + " " + GiaMua + " " + GiaBan + " " + LoiNhuan;
    }
}