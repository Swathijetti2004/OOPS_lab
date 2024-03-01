class GenericDemo{
    // T length,width;
    <T>void adds(T a, T b){
        // length=a;
        // width=b;
        System.out.println(a*b);
    }
    // void area(){
    //     System.out.println(length*width);
    // }
    public static void main(String[] args) {
        GenericDemo obj=new GenericDemo();
        obj.adds<Integer,Integer>(2,4);
        //obj.area();
    }
}


using namespace std;
 
class A {
    int a;
 
public:
    int* ptr;
 
    A()
    {
        cout << "Constructor was Called!"
             << endl;
    }
 
    ~A()
    {
        cout << "Destructor was Called!"
             << endl;
    }
};
 
int main()
{
 
    A* a = new A;
    cout << "Object of class A was "
         << "created using new operator!"
         << endl;
 
    delete (a);
    cout << "Object of class A was "
         << "deleted using delete keyword!"
         << endl;
 
    cout << endl;
 
    A* b = (A*)malloc(sizeof(A));
    cout << "Object of class A was "
         << "created using malloc()!"
         << endl;
 
    free(b);
    cout << "Object of class A was "
         << "deleted using free()!"
         << endl;
 
    return 0;
}