/*Using a constructor and destructor in C++, Write a C++ class 'Student' and assign the following :
1. default constructor (string collegeName = "MVGR", int collegeCode=33)
2. parameterized constructor (string fullName, double semPerentage)
Also create the objects respectivelty asd display their values.*/
#include<iostream>
using namespace std;
class Student{
   public:
       string collegeName;
       int collegeCode;
       string fullName;
       double semPerentage;
       //default constructor
       Student(){
           cout<<"*****Default constructor*****\n";
           this->collegeName="Mvgr";
           this->collegeCode=33;
       }
       //parameterised constructor
       Student(string fullName, double semPerentage){
           cout<<"*****param constructor*****\n";
           this->fullName=fullName;
           this->semPerentage=semPerentage;
       }
       Student(Student &p1,Student &p2){
           this->collegeName=p1.collegeName;
           this->collegeCode=p1.collegeCode;
           this->fullName=p2.fullName;
           this->semPerentage=p2.semPerentage;
       }
       void display(){
           cout<<"Name : "<<fullName<<endl;
           cout<<"Sempercentage : "<<semPerentage<<endl;
           cout<<"College name : "<<collegeName<<endl;
           cout<<"College code : "<<collegeCode<<endl;
       }
};
int main(){
   string name;
   float percentage;
   cout<<"Enter name :";
   cin>>name;
   cout<<"Enter sem percentage :";
   cin>>percentage;
   Student obj1;
   Student obj2(name,percentage);
   Student obj3(obj1,obj2);
   obj3.display();
}
