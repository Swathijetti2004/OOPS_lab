import java.lang.*;
class Threads extends Thread{
    int num;
    Demo obj;
    Threads(Demo obj,int num){
        this.num=num;
        this.obj=obj;
    }
    public void run(){
       obj. multip(num);
    }
    
}
class Demo{
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
class Syncronised {
    public static void main(String[] args) {
        Demo obj=new Demo();
        Threads t1=new Threads(obj,3);
        Threads t2=new Threads(obj,6);
        t1.start();
        t2.start();
    }
}