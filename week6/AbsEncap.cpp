/*Write a C++ class 'AccessSpecifierDemo' with the following members:
Member Variables :
1. private int priVar
2. protected int proVar
3. public int pubVar
Member Methods:
1. public void setVar(int priValue,int proValue, int pubValue)
2. public void getVar()
Assign values for each member variable(priVar,proVar,pubvar) and using methods(setVar(),getVar()) and disaply them.*/
#include<iostream>
using namespace std;
class AccessSpecifierDemo{
    private:
      int priVar;
    protected:
      int proVar;
    public:
      int pubVar;
    public:
        void setVar(int priValue,int proValue, int pubValue){
            this->priVar=priValue;
            this->proVar=proValue;
            this->pubVar=pubValue;
        }
    public:
        void getVar() {
            cout<<"Private variable : "<<priVar<<endl;
            cout<<"Protected variable : "<<proVar<<endl;
            cout<<"Public variable : "<<pubVar<<endl;
        } 
};
int main(){
    AccessSpecifierDemo obj;
    obj.setVar(10,20,30);
    obj.getVar();
}