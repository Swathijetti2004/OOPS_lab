//Write a C++ function to check whether a number is even or odd.
#include<iostream>
void check(int);
using namespace std;
int main(void)
{
   int num;
   cout<<"Enter a number : ";
   cin>>num;
   check(num);
}
void check(int num){
       if((num)%2==0){
           cout<<"It is even number "<<endl;         
       }
       else if(num%2==1){
           cout<<"It is odd number "<<endl;
       }
       else{
        cout<<"Invalid .... "<<endl;
       }
}