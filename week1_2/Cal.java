//Write a Java program to compute arithmetic operations with the user input and choice of operation(if..else if ..else)
import java.util.Scanner;

public class Cal{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number1 operator number2 (3 * 5) : ");
        Double a=s.nextDouble();
        char op=s.next().charAt(0);
        Double b=s.nextDouble();
        if(op=='+'){
            System.out.println("Sum : "+(float)(a+b));
        }
        else if(op=='-'){
            System.out.println("Difference : "+(int)(a-b));
        }
        else if(op=='*'){
            System.out.println("Multiplication : "+(float)(a*b));
        }
        else if(op=='/'){
            if(b==0){
                System.out.println("Invalid value for b");
            }
            else{
                System.out.println("Coefficient : "+(a/b));
            }
        }
        else if(op=='%'){
            if(b==0){
                System.out.println("Impossible answer ");
            }
            else{
            System.out.println("Remainder : "+(int)(a%b));
            }
        }
        else{
            System.out.println("Invalid operator!!");
        }
    }
}