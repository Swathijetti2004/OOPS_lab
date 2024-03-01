//parent class
class Demo1{
    int a=10;
    void display1(){
        System.out.println("\nDemo1 class parent class");
    }
}
//simple inheritance
class Demo2 extends Demo1{
    int b=20;
    void display2(){
        System.out.println("\nDemo2 class simple inheritance \ndemo2->demo1");
    }
}
//multilevel inheritance
class Demo3 extends Demo2{
    int c=30;
    void display3(){
        System.out.println("\nDemo3 class multilevel inheritance \ndemo3->demo2->demo1");
    }
}
//hierarchial inheritance
class Demo4 extends Demo1{
    int d=40;
    void display4(){
        System.out.println("\nDemo4 class hierarchial inheritance \ndemo4->demo1,demo2->demo1");
    }
}
//hybrid inheritance
class Demo5 extends Demo2{
    int e=50;
    void display5(){
        System.out.println("\nDemo5 class hybrid inheritance \ndemo5->demo2,demo3->demo2***Hierarchial inheritance\ndemo2->demo1***simple inheritance");
    }
} 
class InheriTypes{
    public static void main(String[] args) {
        Demo2 obj2=new Demo2();//simple inheritance
        obj2.display2();
        Demo3 obj3=new Demo3();//multilevel inheritance
        obj3.display3();
        Demo4 obj4=new Demo4();//hierarchial inheritance
        obj4.display4();
        Demo5 obj5=new Demo5();//hybrid inheritance
        obj5.display5();
    }
}