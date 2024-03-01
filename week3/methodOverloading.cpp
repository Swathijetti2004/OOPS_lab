#include<iostream>
using namespace std;
class Demo{
  public:
    void add(int a,int b){
        cout<<"Integer method\n";
    }
    void add(float a,float b){
        cout<<"Floating method\n";
    }
};
int main(){
    Demo obj(2,3);
}