#include<iostream>

int main()

{

int x,y,z;

float i,a,d,f;

std::cin>>x>>y>>z;

std::cin>>i>>a>>d>>f;

i=(x*y*z)/100;

a=x+i;

d=(i*2)/100;

f=a-d;

std::cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;

}