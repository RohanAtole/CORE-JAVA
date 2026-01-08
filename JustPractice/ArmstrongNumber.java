/*Q.11 armstrong or not
sol*/
import java.io.*;
import java.util.Scanner;
class ArmstrongNumber
{
    public static void main(String agrs[])
    {
        int n,s=0,r;
        int temp;
        System.out.println("Enter thee number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            s=s+(r*r*r);
            temp=temp/10;
        }
        if(s==n)
        {
            System.out.println("Number is Armstrong:");
        }
        else
        {
            System.out.println("Number is not Armstrong:");
        }
    }
}
