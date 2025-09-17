import java.util.Scanner;

public class J01001 {
    // tính diện tích và chu vi
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        scanner.close();
        if(x<=0|| y<=0) System.out.println("0");
        else System.out.printf("%.0f %.0f\n",(x+y)*2,x*y);
    }
}
