//Write a C++ program to compute arithmetic operations with the user input and choice of operation(switch case).
#include<iostream>
int main(void)
{
	float n1,n2;
	char op;
	std::cout<<"Enter two numbers : ";
	std::cin>>n1>>n2;
	std::cout<<"Enter operator : ";
	std::cin>>op;
	switch(op){
		case '+':std::cout<<"sum = "<<n1+n2<<std::endl;
			break;
		case '-':std::cout<<"difference = "<<n1-n2<<std::endl;
			break;
		case '*':std::cout<<"multiplication = "<<n1*n2<<std::endl;
			break;
		case '/':
			if(n2==0){
				std::cout<<"division with zero is not possible"<<std::endl;
				break;
			}
			std::cout<<"coeff = "<<n1/n2<<std::endl;
			break;
		// case '%':
        //     if(n2==0){
        //         std::cout<<"Impossible answer "<<std::endl;
        //     }
        //     else{
        //     	std::cout<<"Remainder : "<<(n1%n2)<<std::endl;
        //     }
		// 	break;
		default:std::cout<<"None of the above"<<std::endl;
			break;
	}
}
