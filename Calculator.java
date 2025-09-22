import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for addition,Enter 2 for subtraction,Enter 3 for multiplication,Enter 4 for division");
        int count =Integer.parseInt(sc.nextLine());
        //Switch loop for addition, subtraction, multiplication, division
        switch(count){
            case 1:
            {
                System.out.println("Addition of 2 number");
                System.out.println("Enter the 1st number");
                int first=Integer.parseInt(sc.nextLine());

                System.out.println("Enter the 2nd number");
                int second=Integer.parseInt(sc.nextLine());

                int add=first+second;
                System.out.println("Addition of 2 numbers are "+add);
                System.out.println("******************************************");
            }

            case 2:
            {
                System.out.println("Substraction of 2 number");
                System.out.println("Enter the 1st number");
                int first=Integer.parseInt(sc.nextLine());

                System.out.println("Enter the 2nd number");
                int second=Integer.parseInt(sc.nextLine());

                int sub=second-first;
                System.out.println("Substraction of 2 numbers are "+sub);
                System.out.println("******************************************");
            }

            case 3:
            {
                System.out.println("Multiplication of 2 number");
                System.out.println("Enter the 1st number");
                int first=Integer.parseInt(sc.nextLine());

                System.out.println("Enter the 2nd number");
                int second=Integer.parseInt(sc.nextLine());

                int mul=second*first;
                System.out.println("Multiplication of 2 numbers are "+mul);
                System.out.println("******************************************");
            }

            case 4:
            {
                System.out.println("Division of 2 number");
                System.out.println("Enter the 1st number");
                int first=Integer.parseInt(sc.nextLine());

                System.out.println("Enter the 2nd number");
                int second=Integer.parseInt(sc.nextLine());

                int div=second/first;
                System.out.println("Division of 2 numbers are "+div);
                System.out.println("******************************************");
            }
            break;
            default:
                break;
        }
    }
}
