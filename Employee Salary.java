import java.util.Scanner;
class Employee
{
             int empid,basic_salary;
             String name;
             float total,da,hra;
             void getdata()
             {
                      Scanner sc=new Scanner(System.in);
                      System.out.println("Enter Employee Id: ");
                      empid=sc.nextInt();
                      System.out.println("Enter Name: ");
                      name=sc.next();
                      System.out.println("Enter Basic Salary: ");
                      basic_salary=sc.nextInt();
             }
             void display()
             {
                      da=(10*basic_salary)/100;
                      hra=(20*basic_salary)/100;
                      total=basic_salary+da+hra;
                      System.out.println("Id: "+empid+"\t Name: "+name+"\t Basic  
                      Salary:"+basic_salary+"\t Total Salary: "+total);
             }
             public static void main(String args[])
             {
                       Employee emp1=new Employee();
                       emp1.getdata();
                       emp1.display();
                       Employee emp2=new Employee();
                       emp2.getdata();
                       emp2.display();
             }
}
