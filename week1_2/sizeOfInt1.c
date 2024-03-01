//Write a C program to display size of int in windows and linux.
#include<stdio.h>
void main()
{
    printf("The size of integer in windows is : %d\n",sizeof(int));
   printf("The size of integer in windows is (ld): %ld\n",sizeof(int));
}