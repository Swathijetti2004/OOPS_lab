/*Write a C++ class 'Box' and its members as the following :
* void boxArea(float length, float width) : as a member function defiend inside class/////
* void boxVolume(float length, float width, float height) : as a member function defined oustide class
* void displayBoxDimensions() : as a friend function//////////
* void displayWelcomeMessage() : as an inline function////////
Note: Take the input from the user*/
#include<iostream>
using namespace std;
class Box{
    public:
        float length;
        float width;
        float height;
    /*Box(float length, float width, float height){
        cout<<"Constructor......\n";
        this->length=length;
        this->width=width;
        this->height=height;
    }*/
    public:
        void boxVolume();
    public:
        void boxArea(float length, float width){
            cout<<"Area of the box : "<<length*width<<" Square Units"<<endl;
        }
    public:
        friend void displayBoxDimensions(Box);

    inline void displayWelcomeMessage(){
    cout<<"******Welcome to my program*******\n";
    }
};
void Box::boxVolume(){
    cout<<"Volume of the Box :"<<length*width*height<<" Cubic Units"<<endl;
}
void displayBoxDimensions(Box obj){

    cout<<"Length : "<<obj.length<<endl;
    cout<<"Width : "<<obj.width<<endl;
    cout<<"Height : "<<obj.height<<endl;
}

int main(){
    //float length,width,height;
    Box object;
    cout<<"Enter length,width,height: ";
    cin>>object.length>>object.width>>object.height;
    object.displayWelcomeMessage();
    displayBoxDimensions(object);
    object.boxArea(object.length,object. width);
    object.boxVolume();
}