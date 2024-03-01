#include<iostream>
using namespace std;
//parent class
class Demo1{
    public:
        int a=10;
        void display1(){
        cout<<"\nDemo1 class parent class"<<endl;
    }
};
//simple inheritance
class Demo2 :public Demo1{
    public:
        int b=20;
        void display2(){
        cout<<"\nDemo2 class simple inheritance \ndemo2->demo1"<<endl;
    }
};
//multilevel inheritance
class Demo3:public Demo2{
    public:
        int c=30;
        void display3(){
        cout<<"\nDemo3 class multilevel inheritance \ndemo3->demo2->demo1"<<endl;
    }
};
//hierarchial inheritance
class Demo4 :public Demo1{
    public:
        int d=40;
        void display4(){
        cout<<"\nDemo4 class hierarchial inheritance \ndemo4->demo1,demo2->demo1"<<endl;
    }
};
//hybrid inheritance
class Demo5: public Demo2{
    public:
        int e=50;
        void display5(){
        cout<<"\nDemo5 class hybrid inheritance \ndemo5->demo2,demo3->demo2***Hierarchial inheritance\ndemo2->demo1***simple inheritance"<<endl;
    }
}; 
int main()
{
        Demo2 obj2;//simple inheritance
        obj2.display2();
        Demo3 obj3;//multilevel inheritance
        obj3.display3();
        Demo4 obj4;//hierarchial inheritance
        obj4.display4();
        Demo5 obj5;//hybrid inheritance
        obj5.display5();
}