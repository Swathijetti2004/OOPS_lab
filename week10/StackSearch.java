import java.util.Stack;
import java.util.Scanner;
import java.util.EmptyStackException;
class StackSearch{
    public static void main(String[] args) {
        Stack <String> stackOfBangles = new Stack<String>(); 
        stackOfBangles.push("redBangle");
        stackOfBangles.push("greenBangle");
        stackOfBangles.push("yellowBangle");  
        System.out.println("Bangles set on my hand : "+stackOfBangles);
        System.out.println("Searching for GREEN BANGLE (position is): "+stackOfBangles.search("greenBangle")); 
        System.out.println("Searching for BLUE BANGLE (position is): "+stackOfBangles.search("blueBangle")); 
    }
}