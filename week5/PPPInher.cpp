#include<iostream>
using namespace std;
class Parent{
    public:
        int a=10;
        int b=20;
        void add(){
            cout<<"Sum of a , b is : "<<a+b<<endl;
        }
    private:
        void hello(){
            cout<<"HELLO"<<endl;
        }
};
class PublicChild: public Parent{
    public:
    void msgPublicChild(){
        cout<<"Public child\n";
    }
};
class PrivateChild: private Parent{
    public:
    void msgPrivateChild(){
        cout<<"Private child\n";
    }
};
class ProtectedChild: public Parent{
    public:
    void msgProtectedChild(){
        cout<<"Protected child\n";
    }
};
int main(){
    PublicChild obj1;
    PrivateChild obj2;
    ProtectedChild obj3;
    cout<<"\nContent accessible in public child is : \n";
    cout<<obj1.a<<" and "<<obj1.b<<endl;
    obj1.add();
    //obj1.hello();//private method is not accessible
    obj1.msgPublicChild();
    cout<<"\nContent accessible in private child is : "<<endl;
    //cout<<obj2.a<<" and "<<obj2.b<<endl;////inaccicible
    //obj2.add();//inaccicible
    //obj2.hello();//inaccicible
    obj2.msgPrivateChild();
    cout<<"\nContent accessible in protected child is : \n";
    cout<<obj3.a<<" and "<<obj3.b<<endl;
    obj3.add();
    //obj3.hello();//inaccicible
    obj3.msgProtectedChild();
}