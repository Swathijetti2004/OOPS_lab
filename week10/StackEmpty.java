import java.util.Stack;

class StackEmpty{
    public static void main(String[] args) {
        Stack <String> stackOfBangles = new Stack<String>();   
        if(stackOfBangles.empty()){
            System.out.println("My hand has no bangles ");
        }
        else{
            System.out.println("My hand has bangles ");
        }   
        System.out.println(stackOfBangles);
    }
}