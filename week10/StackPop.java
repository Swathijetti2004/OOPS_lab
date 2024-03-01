import java.util.Stack;
import java.util.EmptyStackException;
class StackPop{
    public static void main(String[] args) {
        Stack <String> stackOfBangles = new Stack<String>(); 
        stackOfBangles.push("redBangle");
        stackOfBangles.push("greenBangle");
        stackOfBangles.push("yellowBangle");  
        try{
            for (int i=1;i<=4;i++){
                System.out.println("Bangles set : "+stackOfBangles);
                System.out.println("What is the first bangle i have to remove : "+stackOfBangles.pop()); 
            }
        }catch(EmptyStackException e){
            System.out.println("My hand has no bangles.");
        } 
    }
}