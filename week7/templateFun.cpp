#include<iostream>
using namespace std;
template <typename t>
class Sample{
   public:
        void add(t a,t b){
           cout<<a<<b<<endl;
        }
        void add1(t a,t b){
           cout<<a+b<<endl;
        }
};
int main(){
   Sample<int> obj;
   obj.add(3,74);
   obj.add1(3.6,6.8);
   obj.add("Swa","thi");
}