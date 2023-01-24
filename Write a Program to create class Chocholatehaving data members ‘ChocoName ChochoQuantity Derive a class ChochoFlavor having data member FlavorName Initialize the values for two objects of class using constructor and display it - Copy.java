class Chocolate
{
String ChocoName;
int ChocoQuantity;
Chocolate(String a,int b)
{
ChocoName= a;
ChocoQuantity=b;
}
void display()
{
System.out.println("Name of the choco: "+ChocoName);
System.out.println("Quantity of choco: "+ChocoQuantity);
}
}
class ChocoFlavor extends Chocolate
{
String FlavorName;
ChocoFlavor(String a,int b,String c)
{
super(a,b);
FlavorName=c;
}
void display1()
{
System.out.println("Flavor of the choco: "+FlavorName);
}
public static void main(String args[])
{
ChocoFlavor c1=new ChocoFlavor("Eclair",10,"Sweet");
ChocoFlavor c2=new ChocoFlavor("Melody",5,"Sweet");
c1.display();
c1.display1();
c2.display();
c2.display1();
}
}
