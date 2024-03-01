#include<iostream>
using namespace std;
class Demo1{
    public: 
        int a=10;
        void demo1Msg(){
            cout<<"Demo 1 class\n";
        }
};
class Demo2 {
    public:
    void demo2Msg(){
            cout<<"Demo 2 class\n";
        }
};
//multiple inheritance
class Demo3: public Demo1,public Demo2{
    public:
        void demo3Msg(){
            cout<<"Demo 3 class\n";
        }
};
int main(){
    Demo3 obj;
    cout<<"Multiple inheritance\n";
    cout<<obj.a<<endl;
    obj.demo1Msg();
    obj.demo2Msg();
    obj.demo3Msg();
}