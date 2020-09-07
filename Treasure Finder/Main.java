#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int box1,box2,box3;
  int i,d,e;
  cin>>box1>>box2>>box3;
  if(box1>box2 && box1>box3)
  {
    if(box2>box3)
    {
      d=box2;
    }
    else
    {
      d=box3;
    }
  }
  else if(box2>box1 && box2>box3)
  {
    if(box3>box1)
    {
      d=box3;
    }
    else
    {
      d=box1;
    }
  }
  else
  {
    if(box1>box2)
    {
      d=box1;
    }
    else
    {
      d=box2;
    }
  }
  cout<<"The treasure is in box which has number "<<d<<"\n";
  for(i=1;i<=5;i++)
  {
   	if(box1%i==0 && box2%i==0 && box3%i==0)
    {
     	e=i;
   	}
  }
  cout<<"The code to open the box is "<<e;
}
      
    