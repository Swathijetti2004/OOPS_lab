#include<iostream>
using namespace std;
class Demo1{
    public: 
        int a=10;
        void demo1Msg(){
            cout<<"Demo 1 class\n";
        }
};
//simple inheritance
class Demo2 :virtual public Demo1{
    public:
    void demo2Msg(){
            cout<<"Demo 2 class\n";
        }
};
//simple inheritance
class Demo3: virtual public Demo1{
    public:
    void demo3Msg(){
            cout<<"Demo 3 class\n";
        }
};
//Multiple inheritance
class Demo4: virtual public Demo2, virtual public Demo3{
    public:
    void demo4Msg(){
            cout<<"Demo 4 class\n";
        }
};
int main(){
    Demo4 obj;
    cout<<"Diamond inheritance\n";
    cout<<obj.a<<endl;//ambiguous
    obj.demo1Msg();//ambiguous
    obj.demo2Msg();
    obj.demo3Msg();
    obj.demo4Msg();
}