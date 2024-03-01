//Write a Java function to check whether a number is even or odd.
import java.util.Scanner;

public class Odd{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=s.nextInt();
        check(num);
        //System.out.println("Hello "+name);
    }
    static void check(int num){
        if(num%2==0){
            System.out.println("It is even number ");           
        }
        else{
            System.out.println("It is odd number "); 
        }
    }
    static{
        System.out.println("static block "); 
    }
}