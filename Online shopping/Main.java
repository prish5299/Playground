#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f,g,h,i;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int b1=(a*b)/100;
  int t1=a-b1+c;
  int b2=(d*e)/100;
  int t2=d-b2+f;
  int b3=(g*h)/100;
  int t3=g-b3+i;
  cout<<"In Flipkart Rs."<<t1<<"\n";
  cout<<"In Snapdeal Rs."<<t2<<"\n";
  cout<<"In Amazon Rs."<<t3<<"\n";
  if(t1<=t2&&t1<=t3)
    cout<<"He will prefer Flipkart";
  else if(t2<=t3&&t2<=t1)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
    
}