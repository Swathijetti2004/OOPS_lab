//Demonstrate partial abstraction in C++.
#include<iostream>
using namespace std;
//impure abstract class
class Management{
    public:
        virtual void curriculam()=0;
        void function(){
            
        }
};
class Dept: public Management{
    public:
    void function(){
        cout<<"Designs the college fee structure\n";
    }
    void curriculam(){
        cout<<"designs the course\n";
    }
};
int main(){
    Dept obj;
    obj.function();
    obj.curriculam();
}