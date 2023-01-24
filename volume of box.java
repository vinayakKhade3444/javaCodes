class Box
{
int length,width,height,volume;
Box(int l,int w,int h)
{
length=l;
width=w;
height=h;
}
void display()
{
volume=length*width*height;
System.out.println("Volume of Box: "+volume);
}
public static void main(String args[])
{
Box b1=new Box(5,3,9);
b1.display();
Box b2=new Box(10,6,8);
b2.display();
Box b3=new Box(12,16,10);
b3.display();
}
}
