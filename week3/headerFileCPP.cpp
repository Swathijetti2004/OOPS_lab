/*Write two header files in C++ as :
1. boxArea.h - void boxArea(float length, float width).
2. boxVolume.h - void boxVolume(float length, float width, float height)
Also using #include, #ifdef and #ifndef write a C++ program to display area and volume of box with user input*/
#include<iostream>
#ifndef  boxVolume
    #include "boxVolume.h"
#endif
#ifndef boxArea
    #include "boxArea.h"
#endif
using namespace std;
int main(void){
	float length,width,height;
	cout<<"Enter length,width,height of the box : ";
	cin>>length>>width>>height;
    	boxArea(length,width);
    	boxVolume(length,width,height);
}