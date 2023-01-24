class Book
{
int id,price;
String name;
Book(int i,String n,int p)
{
id=i;
name=n;
price=p;
}
void display()
{
System.out.println("Id: "+id+"\t Name: "+name+"\t Price: "+price);
}
public static void main(String args[])
{
Book b1=new Book(129,"Java ",200);
b1.display();
Book b2=new Book(205,"Python",150);
b2.display();
}
}
