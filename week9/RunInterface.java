import java.lang.Runnable;
class Threads implements Runnable{
    int num;
    // Threads(int num){
    //     this.num=num;
    // }
    public  void run(){
        System.out.print("gfg");
        }
        public static void main(String[] args) throws InterruptedException {
            Thread t1=new Thread(new Threads());
            t1.start();
            t1.start();
            System.out.print(t1.getState());
            // Threads t1=new Threads(9);
            // Threads t2=new Threads(5);
            // Thread s1=new Thread(t1);
            // Thread s2=new Thread(t2);
            // s1.start();
            // s2.start();
        }
    }
   

class RunInterface {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Threads());
        t1.start();
        t1.start();
        System.out.print(t1.getState());
        // Threads t1=new Threads(9);
        // Threads t2=new Threads(5);
        // Thread s1=new Thread(t1);
        // Thread s2=new Thread(t2);
        // s1.start();
        // s2.start();
    }
}