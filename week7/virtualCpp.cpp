//Demonstrate pure abstraction using virtual functions in C++.
#include<iostream>
using namespace std;
class PureAbstract{
    public:
    virtual void examCell()=0;
    void collegeFinance();
};
class Derived : public PureAbstract{
    public:
    void examCell(){
        cout<<"Inside the admin block\n";
    }
    void collegeFinance(){
        cout<<"In the derived class\n";
    }
};
int main(){
    Derived obj;
    obj.collegeFinance();
    obj.examCell();
}