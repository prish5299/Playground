#include<iostream>
using namespace std;
int main()
{
  int x =sizeof(char);
  int y=sizeof(int);
  int z=sizeof(float);
  int a=sizeof(double);
  std::cout<<x<<"\n"<<y<<"\n"<<z<<"\n"<<a;
}