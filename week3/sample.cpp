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
            Student *b=new Student()
            // this->collegeName="Mvgr";
            // this->collegeCode=33;
        }
        //parameterised constructor
        Student(Student &obj, string fullName, double semPerentage){
            cout<<"*****param constructor*****\n";
            this->collegeName=obj.collegeName;
            this->collegeCode=obj.collegeCode;
            this->fullName=fullName;
            this->semPerentage=semPerentage;
        }
        Student(Student &a){
            cout<<"Name : "<<a.fullName<<endl;
            cout<<"Sempercentage : "<<a.semPerentage<<endl;
            cout<<"College name : "<<a.collegeName<<endl;
            cout<<"College code : "<<a.collegeCode<<endl;
        }
};
int main(){
    Student obj1;//creating objects
    string name;
    float percentage;
    cout<<"Enter name :";
    cin>>name;
    cout<<"Enter sem percentage :";
    cin>>percentage;
    Student obj2(obj1,name,percentage);
    Student obj3(obj2);
}