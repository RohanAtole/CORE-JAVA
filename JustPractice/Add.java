import java.io.*;
import java.util.Scanner;
public class Add
{
  public static void main(String args[])
  {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the two numbers:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=a+b;
    System.out.println("Addition of number is:"+c);
  }
}
