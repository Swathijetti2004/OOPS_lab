#include<iostream>
#include<iomanip>
using namespace std;
void endlfun()
{
cout<<"endl use"<<endl;
cout<<"line1"<<endl<<"line2"<<endl;
}
void endsfun()
{
cout<<"ends use"<<endl;
cout<<'a'<<ends;
cout<<'b'<<ends;
cout<<'c'<<endl;
}
void flushfun()
{
cout<<"flush use"<<endl;
cout<<"example of flush"<<flush<<endl;
}
void setwfun()
{
cout<<"setw use"<<endl;
cout<<setw(10)<<23<<endl;
cout<<setw(10)<<03<<endl;
}
void setfillfun()
{
cout<<"setfill use"<<endl;
cout<<setfill('+')<<setw(5)<<12<<endl;
cout<<setfill('.')<<setw(5)<<1<<endl;
}
void setprecisionfun()
{
cout<<"setpresition use"<<endl;
cout<<setprecision(5)<<67.45708<<endl;
cout<<setprecision(7)<<57.0989109<<endl;
}
int main()
{
endlfun();
endsfun();
flushfun();
setwfun();
setfillfun();
setprecisionfun();
}
