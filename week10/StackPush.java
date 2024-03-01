import java.util.Stack;
import java.util.Scanner;

class StackPush{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String extraBangle;
        Stack <String> stackOfBangles = new Stack<String>(); 
        stackOfBangles.push("redBangle");
        stackOfBangles.push("greenBangle");
        stackOfBangles.push("yellowBangle");  
        System.out.println("Bangles set on my hand : "+stackOfBangles);
        System.out.print("Enter which bangle do you want to insert : "); 
        extraBangle=inp.next();
        stackOfBangles.push(extraBangle);
        System.out.println("After inserting new bangle, bangles set : "+stackOfBangles);
    }
}