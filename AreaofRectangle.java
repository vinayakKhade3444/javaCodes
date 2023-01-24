import java.util.Scanner;
class Rectangle
{
          int length,width,area;
          void getdata()
          {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter length & width: ");
                    length=sc.nextInt();
                   width=sc.nextInt();
          }
          void display()
          {
                    area=length*width;
                    System.out.println("Area of rectangle is "+area);
          }
          public static void main(String args[])
          {
                    Rectangle r=new Rectangle();
                    r.getdata();
                    r.display();
          }
}
