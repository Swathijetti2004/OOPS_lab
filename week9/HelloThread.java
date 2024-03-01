import java.lang.Thread;
import java.util.Scanner;
Class HelloThread1 extends Thread{
    // int n;
    // HelloThread(int n){
    //     this.n=n;
    // }
    public void run(){
        
        multip();
    }
    void multip(){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
Class HelloThread{
    public static void main(String[] args) {
        HelloThread1 obj1=new HelloThread1();
        HelloThread1 obj2=new HelloThread1();
        obj1.start();
        obj2.start();
    }
}