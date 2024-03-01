//Demonstrate partial abstraction in Java.
abstract class BtechCourse{
    abstract  void student();
    void faculty(){
        System.out.println("Instructs the students");
    }
}
class FastLearner extends BtechCourse{
    void student(){
        System.out.println("He/she can grasp the concept quickly");
    } 
}
class SlowLearner extends BtechCourse{
    void student(){
        System.out.println("He/she has to spend some extra efforts to learn the concept");
    } 
}
class PartialAbs{
    public static void main(String[] args) {
        FastLearner fast=new FastLearner();
        SlowLearner slow=new SlowLearner();
        fast.faculty();
        fast.student();
        slow.faculty();
        slow.student();
    }
}
