import java.util.Scanner;
import java.util.array;
public class ArraySort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[]array=new int[5];
      
        System.out.println("enter the five element:");
        for(int i=0;i<5;i++)
        {
          array[i]=sc.nextInt();
        }
        arrays.sort(array);
        System.out.println("Element in descending order:");
        for(int i=4;i>0;i--)
        {
          System.out.println(array[i]);
        }
    }
}
