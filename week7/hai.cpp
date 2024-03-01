// // C++ program for function overriding
// #include <bits/stdc++.h>
// using namespace std;

// class base {
// public:
// 	virtual void print()
// 	{
// 		cout << "print base class" << endl;
// 	}
// 	void show() { cout << "show base class" << endl; }
// };

// class derived : public base {
// public:
// 	void print() { cout << "print derived class" << endl; }

// 	void show() { cout << "show derived class" << endl; }
// };
// int main()
// {
// 	base* bptr;
// 	derived d;
// 	bptr = &d;

// 	// Virtual function, binded at
// 	// runtime (Runtime polymorphism)
// 	bptr->print();

// 	// Non-virtual function, binded
// 	// at compile time
// 	bptr->show();

// 	return 0;
// }
// A program with virtual destructor
#include <iostream>

using namespace std;

class base {
public:
	base()	
	{ cout << "Constructing base\n"; }
	virtual ~base()
	{ cout << "Destructing base\n"; }	
};

class derived : public base {
public:
	derived()	
	{ cout << "Constructing derived\n"; }
	~derived()
	{ cout << "Destructing derived\n"; }
};

int main()
{
//derived *d = new derived();
base *b=new base() ;
delete b;
return 0;
}
