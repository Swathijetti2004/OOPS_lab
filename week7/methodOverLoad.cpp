#include<iostream>
using namespace std;
class Demo{
  public:
    void add(int a,int b){
        cout<<"Sum is: "<<a+b<<endl;
    }
    void add(int a,int b,int c){
        cout<<"Sum is: "<<a+b+c<<endl;
    }
    void add(int a,int b,int c,int d){
        cout<<"Sum is: "<<a+b+c+d<<endl;
    }
};
int main(){
    Demo obj;
    obj.add(2,3);//both integers
    obj.add(4,4.4);//one integer and one floating point
    obj.add(3.4,5,7);//two integers and one floating poin
    obj.add(1,2,3,4);//all are integers
}