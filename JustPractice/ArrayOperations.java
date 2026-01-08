import java.io.*;
import java.util.Scanner;
class ArrayOperations
{
    public static void main (String args[])
    {
        int j,s,i,k=0,m=0,n;
        int r[]=new int[10] ;
        int prime[]=new int[10] ;
        int perfect[]=new int[10] ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Of Elements :=> ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the "+i+" Number of the Array :=> ");
            r[i]=sc.nextInt();
        }

        for(j=0;j<10;j++)
        {
            int flag=0;
            if(r[j]==0||r[j]==1)
            {
                continue;
            }
            else
            {
                for(i=2;i<r[j];i++)
                {
                    if(r[j]%i==0)
                    flag=1;
                }
            }
            if(flag==0)
            {
            prime[k]=r[j];
            k++;
            }
            s=0;
            for(i=1;i<r[j];i++)
            {
                n=r[j]%i;
                if(n==0)
                s=s+i;
            }
            if(s==r[j])
            {
                perfect[m]=r[j];
                m++;
            }
        }
            System.out.println("\nPerfect Numbers are ");
            for(i=0;i<m;i++)
            {
                System.out.print(perfect[i]+" ");
            }
            System.out.println("\nPrime Numbers are");
            for(i=0;i<k;i++)
            {
                System.out.print(prime[i]+" ");
            }
    }
}
