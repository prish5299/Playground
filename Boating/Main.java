#include<iostream>
using namespace std;
int main()
{
  int weight,adult,child,a,b,c;
  cin>>weight>>adult>>child;
  a=adult*75;
  b=child*30;
  c=a+b;
  if(c<=weight)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  
}