/*Using a constructor and destructor in C++, Write a C++ class 'Student' and assign the following :
* string fullName
* int rollNum
* double semPerentage
* string collegeName
* int collegeCode*/
#include<iostream>
using namespace std;
class Student{
    public:
        string fullName;
        int rollNum;
        double semPerentage;
        string collegeName="MVGR";
        int collegeCode=33;
    Student(){
        cout<<"Enter Student details.....\n";
    }
    public:
        void display(){
            cout<<"*****Student details*****\n";
            cout<<"student name :"<<fullName<<endl;
            cout<<"student roolnumber :"<<rollNum<<endl;
            cout<<"student sempercentage :"<<semPerentage<<endl;
            cout<<"college name :"<<this->collegeName<<endl;
            cout<<"college code :"<<this->collegeCode<<endl;
        }
    ~Student(){
        cout<<"Student class is distroyed by using destructor....\n";
    }
    
};
int main(void){
    Student obj;
    cout<<"Enter student name : ";
    cin>>obj.fullName;
    cout<<"Enter student rollnumber : ";
    cin>>obj.rollNum;
    cout<<"Enter student sempercentage: ";
    cin>>obj.semPerentage;
    /*cout<<"Enter college name : ";
    cin>>obj.collegeName;
    cout<<"Enter college code : ";
    cin>>obj.collegeCode;*/
    obj.display();
}