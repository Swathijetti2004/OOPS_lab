//Write a Java program to display Hello 'Username'', where 'Username' will be given by the user.
import java.util.Scanner;

public class Msg{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter user name : ");
        String name=s.next();
        boolean x=isString(name);
        if(x){
            System.out.println("Hello "+name);
        }
    }
    static boolean isString(String n){
        int i;
        for(i=0;i<=n.length();i++){
            if(n.charAt(i)<48 || n.charAt(i)>57){
                return true;
            }
        }
        return false;
    }
}