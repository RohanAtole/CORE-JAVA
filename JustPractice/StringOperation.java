import java.io.*;
import java.util.Scanner;
public class StringOperation
{
public static void main(String args[])
{
int i,j,n;
String s1[]=new String[10];
String tmp;
Scanner sc=new Scanner(System.in);
try{
System.out.println("how many cities you want the enter:");
n=sc.nextInt();
System.out.println("enter the names of cities:");
for(i=0;i<n;i++)
s1[i]=sc.next();
System.out.println("cities are:");
for(i=0;i<n;i++)
System.out.println(s1[i]);
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if((s1[j].compareTo(s1[j+1]))<0)
{
tmp=s1[j];
s1[i]=s1[j+1];
s1[j+1]=tmp;
}
}
}
System.out.println("names of cities in descending order are");
for(i=0;i<n;i++)
System.out.println(s1[i]);
}
catch(Exception e)
{
}
}
}
