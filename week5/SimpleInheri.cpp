#include<iostream>
using namespace std;
class ElderSis{
    public:
        int numOfDressesE=10;
    public:
        void displayNumOfDressesE(){
        cout<<"Number of Elder sister dresses : "<<numOfDressesE<<endl;
        }
};
class YoungerSis: public ElderSis{
    public:
        int numOfDressesY=10;
        void displayNumOfDressesY(){
        numOfDressesY=numOfDressesY+numOfDressesE;
        cout<<"Number of Younger sister dresses : "<<numOfDressesY<<endl;
    }
};
int main(){
    YoungerSis obj;
    obj.displayNumOfDressesE();
    obj.displayNumOfDressesY();
}