import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.min;
import static java.lang.Integer.max;

public class J01025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1a = scanner.nextInt();int y1a=scanner.nextInt(); int x2a=scanner.nextInt();int y2a=scanner.nextInt();
        int x1b = scanner.nextInt();int y1b=scanner.nextInt(); int x2b=scanner.nextInt();int y2b=scanner.nextInt();

        int minX=min(x1a,x1b);
        int maxX=max(x2a,x2b);
        int minY=min(y1a,y1b);
        int maxY=max(y2a,y2b);

        int side = max(maxX-minX,maxY-minY);
        System.out.println(side*side);

    }
}