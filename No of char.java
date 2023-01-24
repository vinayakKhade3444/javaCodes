class NoOfChar
{
public static void main(String args[])
{
String str="NCER";
int count=0,i;
for(i=0;i<str.length();i++)
{
if(str.charAt(i)!=' ')
{
count++;
}
}
System.out.println("Total number of characters in string is "+count);
}
}

