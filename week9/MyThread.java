import java.lang.*;
class Threads extends Thread{
    int num;
    Threads(int num){
        this.num=num;
    }
    public void run(){
        multip(num);
    }
    synchronized void multip(int n){
            for (int i=0;i<=5;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
            try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                e.printStackTrace();
                }
        }
    }
}
class MyThread {
    public static void main(String[] args) {
        Thread t1=Thread.currentThread();
        System.out.println(t1);
    //     Threads t2=new Threads(5);
    //    t1.start();
    //    t2.start();
    }
}