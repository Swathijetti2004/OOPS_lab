//Write a C++ program to display Hello 'Username'', where 'Username' will be given by the user.
#include <iostream>
using namespace std;
bool isString(string n){
     int i;
        for(i=0;i<n.length();i++){
            //if((n[i]<65 && n[i]>90) || (n[i]<97 && n[i]>122)){
            if(n[i]<48 || n[i]>57){
                return true;
            }
        }
        return false;
}
int main()
{
    string name;
    cout<<"Enter your name : ";
    cin>>name;
    bool x=isString(name);
    if(x){
        cout<<"Hello "<<name<<endl;
    }
    else{
        cout<<"Inavalid user name.... "<<endl;
    }
    return 0;
}