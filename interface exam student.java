interface Exam
{
void Per_cal();
}
class Student
{
int Roll_no,m1,m2;
String name;
void get(int r,int mark1,int mark2,String n)
{
Roll_no=r;
m1=mark1;
m2=mark2;
name=n;
}
}
class Result1 extends Student implements Exam
{
int total;
float per;
public void Per_cal()
{
total=m1+m2;
per=(to	tal*100)/200;
}
void show()
{
Per_cal();
System.out.println("Roll No.: "+Roll_no+"\nName: "+name+"\nPercentage: "+per);
}
public static void main(String args[])
{
Result1 r=new Result1();
r.get(205,82,90,"Vinayak");
r.show();
}
}
