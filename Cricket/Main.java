#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int ball,run,num_run,num_ball;
  cin>>ball>>run>>num_run>>num_ball;
  float a=ball/6;
  int b=num_ball/6;
  int c=num_ball%6;
  float d=((float)b+(float)c/10);
  float cur_run=num_run/d;
  float tot_run=run/a;
  cout<<a<<"\n"<<fixed<<setprecision(1)<<d<<"\n"<<cur_run<<"\n"<<tot_run;
  if(cur_run>tot_run)
  {
    cout<<"\nEligible to Win";
  }
  else
    cout<<"\nNot Eligible to Win";
}