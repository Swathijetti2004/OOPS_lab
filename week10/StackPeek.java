import java.util.Stack;

class StackPeek{
    public static void main(String[] args) {
        Stack <String> stackOfBangles = new Stack<String>(); 
        stackOfBangles.push("redBangle");
        stackOfBangles.push("greenBangle");
        stackOfBangles.push("yellowBangle");  
        System.out.println(stackOfBangles);
        System.out.println("What is the colour of last bangle in my hand : "+stackOfBangles.peek());  
    }
}