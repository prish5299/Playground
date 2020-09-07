#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float i,a,d,f;
  cin>>p>>r>>t;
  i=(p*r*t)/100;
  a=p+i;
  d=(i*2)/100;
  f=a-d;
  std::cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;
}