#include<iostream>
#include<iomanip>
using namespace std;
void endl_function()
{
cout<<"\nendl usage"<<endl;
cout<<"line_1"<<endl<<"line_2"<<endl;
}
void ends_function()
{
cout<<"\nends usage"<<endl;
cout<<'a'<<ends;
cout<<'b'<<ends;
cout<<'c'<<endl;
}
void flush_function()
{
cout<<"\nflush usage"<<endl;
cout<<"example of flush"<<flush<<endl;
}
void setw_function()
{
cout<<"\nsetw usage"<<endl;
cout<<setw(10)<<5000<<endl;
cout<<setw(20)<<100<<endl;
}
void setfill_function()
{
cout<<"\nsetfill usage"<<endl;
cout<<setfill('+')<<setw(4)<<50<<endl;
cout<<setfill('.')<<setw(8)<<100<<endl;
}

void setprecision_function()
{
cout<<"\nsetpresition usage"<<endl;
cout<<setprecision(6)<<87.98657897<<endl;
cout<<setprecision(3)<<"dgfgfv.jhdfhjd"<<endl;
}
int main()
{
endl_function();
ends_function();
flush_function();
setw_function();
setfill_function();
setprecision_function();
}