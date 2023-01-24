import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int num,temp,sum=0;
temp=n;
while(n!=0)
{
num=n%10;
sum=sum+(num*num*num);import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int flag=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
System.out.println(n+" is not a Prime number");
flag=1;
break;
}
}
if(flag==0)
			System.out.println(n+" is a Prime number");
}
}

n=n/10;
}
if(sum==temp)
			System.out.println(temp+" is a Armstrong number");
else
			System.out.println(temp+" is not a Armstrong number");
}
}
