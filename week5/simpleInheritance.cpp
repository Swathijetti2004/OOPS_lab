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
class Demo2 : public Demo1{
    public:
    void demo2Msg(){
            cout<<"Demo 2 class\n";
        }
};
int main(){
    Demo2 obj;
    cout<<"Simple inheritance\n";
    cout<<obj.a<<endl;
    obj.demo1Msg();
    obj.demo2Msg();
}