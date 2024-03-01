/*Demonstrate Operator overlaoding in C++.*/
#include <iostream>
using namespace std;
class Sample {
private:
    int real, imag;  
public:
    Sample(int r = 0, int i = 0)
    {
        real = r;
        imag = i;
    }
    Sample operator+(Sample & obj,Sample &obj56)
    {
        Sample res;
        res.real = obj56.real + obj.real;
        res.imag = obj56.imag + obj.imag;
        return res;
    }0
    void print() { 
        cout << real << " + i" << imag << '\n'; 
    }
};
  
int main()
{
    Sample c1(2, 5), c2(6, 1);
    Sample c3 = c1 + c2;
    c3.print();
}