import java.util.Scanner;

public class J04001 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0)
        {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            System.out.printf("%.4f%n",Point.distance(new Point(x1,y1),new Point(x2,y2)));
        }
        scanner.close();
    }
}

class Point
{
    private double x;
    private double y;

    public Point()
    {

    }

    public Point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }

    public Point(Point p)
    {
        this.x=p.getX();
        this.y=p.getY();
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double distance(Point secondPoint)
    {
        return Math.sqrt((this.x-secondPoint.getX())*(this.x-secondPoint.getX())+(this.y-secondPoint.getY())*(this.y-secondPoint.getY()));
    }

    public static double distance(Point firstPoint,Point secondPoint)
    {
        return Math.sqrt((firstPoint.getX()-secondPoint.getX())*(firstPoint.getX()-secondPoint.getX())+(firstPoint.getY()-secondPoint.getY())*(firstPoint.getY()-secondPoint.getY()));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
