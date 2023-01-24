import java.util.Scanner;
class Student
{
           int rollno,m1,m2,total;
           String name;
           float per;
           void getdata()
           {
                     Scanner sc=new Scanner(System.in);
                     System.out.println("Enter Roll No: ");
                     rollno=sc.nextInt();
                     System.out.println("Enter Name: ");
                     name=sc.next();
                     System.out.println("Enter marks of two subjects: ");
                     m1=sc.nextInt();
                     m2=sc.nextInt();
           }
           void display()
           {
                     total=m1+m2;
                     per=(total*100)/200;
                     System.out.println("Roll No: "+rollno+"\t Name: "+name+"\t Percentage:     
                     "+per);
           }
           public static void main(String args[])
           {
 	         Student s=new Student();
         s.getdata();
         s.display();
}
}
