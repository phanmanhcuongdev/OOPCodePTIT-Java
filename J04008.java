import java.util.Scanner;
import java.lang.*;

public class J04008
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0)
        {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();

            Point first = new Point(x1,y1);
            Point second = new Point(x2,y2);
            Point third = new Point(x3,y3);

            if(!(Point.distance(first,second)+Point.distance(second,third)>Point.distance(first,third) &&
                    Point.distance(first,third)+Point.distance(second,third)>Point.distance(first,second) &&
                    Point.distance(first,second)+Point.distance(first,third)>Point.distance(second,third)) )
            {
                System.out.println("INVALID");
            }
            else
            {
                System.out.printf("%.3f\n",Point.distance(first,second)+Point.distance(first,third)+Point.distance(second,third));
            }

        }

    }
}
class Point
{
    private double x;
    private double y;
    public Point(){}
    public Point(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX() {return x;}
    public double getY() {return y;}
    public void setX(double x) {this.x = x;}
    public void setY(double Y) {this.y = y;}
    public double distance(Point second)
    {
        return Math.sqrt((x-second.getX())*(x-second.getX())+(y-second.getY())*(y-second.getY()));
    }
    public static double distance(Point first,Point second)
    {
        return Math.sqrt((first.getX()-second.getX())*(first.getX()-second.getX())+(first.getY()-second.getY())*(first.getY()-second.getY()));
    }
}