import java.util.*;
import java.util.Stack;

class StackDemo{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Stack <String> stackOfBangles = new Stack<String>();
        if(stackOfBangles.empty()){
            System.out.println("My hand has no bangles ");
        }
        else{
            System.out.println("My hand has bangles ");
        }   
        System.out.println(stackOfBangles);
        System.out.println("How many bangles do you want to insert :");
        int count=inp.nextInt();
        for (int i=1;i<=count;i++) {
            System.out.println("insert "+i+" th bangle : ");
            String bangle=inp.next();
            stackOfBangles.push(bangle);
        } 
        System.out.println("After inserting bangles your hand has the following bangles set: "+stackOfBangles);
        System.out.println("What is the colour of last bangle in my hand : "+stackOfBangles.peek());  
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