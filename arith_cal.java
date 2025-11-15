//basic arithmatic operation using try and catch exception
import java.util.Scanner;

public class arith_cal{
    public static void main(String args[]){

        System.out.println("Enter the two numbers:");
        Scanner sc=new Scanner(System.in);

        //accept two numbers for user
        int a= Integer.parseInt(sc.nextLine());
        int b= Integer.parseInt(sc.nextLine());

        //make a addition of two numbers
        System.out.println("Addition is:"+(a+b));

        //make a substraction of two numbers
        System.out.println("substraction is:"+(a-b));

        //make a multiplication of two numbers
        System.out.println("multiplication is:"+(a*b));

        //make a division of two numbers
        try {

            System.out.println("division is:" + (a / b));

        }
        catch(Exception e) {

            System.out.println("please enter the valid input");

        }

    }

}
