import java.util.*;
import java.lang.*;
// class Hello{
//     void displayMessage(){
//         System.out.println("HEllo welcome to my program.");
//         Class.forName("ABC");
//         Hello object1=new Hello();
//         object1.displayMessage();
//         int[] arr;
//         arr=new int[-5];
//         for (int i=0;i<5;i++){
//             arr[i]=inp.nextInt();
//         }
//         for (int i=0;i<5;i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println("\n"+arr[45]+ " ");
//     }catch(ArrayIndexOutOfBoundsException  | NegativeArraySizeException obj1){
//         System.out.println("Array index out of range");
//     }
//     // catch(InputMismatchException obj){
//     //     System.out.println("only integers are allowed");
//     // }catch(NoSuchElementException obj){
//     //     System.out.println("array contains only integers");
//     // }
//     // catch(NegativeArraySizeException obj){
//     //     System.out.println("size of array is negative");
//     // }
//     // catch(NoSuchMethodException obj){
//     //     System.out.println("array contains only integers");
//     // }
//     // catch(ClassNotFoundException obj){
//     //     System.out.println("class not found");
//     // }
//     }
// }
public class Except {
    public static void main(String[] args){
        try{
            Scanner inp=new Scanner(System.in);
            int a[];
            
            int s=inp.nextInt();
            System.out.println("inavalidfkj"+s/0);
        }catch(ArithmeticException e){
            System.out.println("inavalidfkj");
        }
    }
}