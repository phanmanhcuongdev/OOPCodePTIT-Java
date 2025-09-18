import java.util.Scanner;

public class J04002 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String c = scanner.next();
        scanner.close();

        if(a<=0||b<=0)
        {
            System.out.println("INVALID");
            return;
        }

        Rectange rec = new Rectange(a,b,c);
        System.out.printf("%d %d %s\n",(int)rec.findPerimeter(),(int)rec.findArea(),rec.getColor());
    }
}
class Rectange
{
    private double width;
    private double height;
    private String color;

    public Rectange() {}

    public Rectange(double width,double height,String color)
    {
        this.color=color.substring(0,1).toUpperCase()+color.substring(1).toLowerCase();
        this.width=width;
        this.height=height;

    }

    public double getWidth() {return width;}
    public double getHeight() {return height;}
    public String getColor() {return color;}

    public void setWidth(double width) {this.width=width;}
    public void setHeight(double height) {this.height=height;}
    public void setColor(String color) {this.color=color;}

    public double findArea() {return height*width;}
    public double findPerimeter() {return (height+width)*2;}

}