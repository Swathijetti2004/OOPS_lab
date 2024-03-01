// class Demo1{
//     int a=10;
//     void display1(){
//         System.out.println("Demo class 1");
//     }
// }
// class Demo2 extends Demo1{
//     int b=10;
//     void display2(){
//         System.out.println("Demo class 2");
//     }
// }
// class Demo3 extends Demo1{
//     int c=10;
//     void display3(){
//         System.out.println("Demo class 3");
//     }
// }
// class Demo4 extends Demo2 , Demo3{
//     int b=10;
//     void display4(){
//         System.out.println("Demo class 4");
//     }
// }
// class Diamond{
//     public static void main(String[] args) {
//         Demo4 obj=new Demo4();
//         obj.display1();
//     }
// }

interface DemoInterface1  
{  
public default void display()   
{  
System.out.println("the display() method of DemoInterface1 invoked");  
}  
}  
interface DemoInterface2  
{  
public default void display()   
{  
System.out.println("the display() method of DemoInterface2 invoked");  
}  
}  
public class Diamond implements DemoInterface1, DemoInterface2  
{  
public void display()   
{  
DemoInterface1.super.display();  
DemoInterface2.super.display();  
}  
public static void main(String args[])   
{  
Diamond obj = new Diamond();  
obj.display();  
}  
}  