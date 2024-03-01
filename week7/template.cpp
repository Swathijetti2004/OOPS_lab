#include<iostream>
using namespace std;
template <class t>
class Large{
    public:
    void max(t a, t b){
        if(a>b){
            cout<<"larger value is : "<<a<<endl; 
        }
        else{
            cout<<"larger value is : "<<b<<endl; 
        }
    }
};
int main(){
    Large <int>obj;
    obj.max(2,6);
    obj.max(2.5,98.8);
    //obj.max("a","A");
}