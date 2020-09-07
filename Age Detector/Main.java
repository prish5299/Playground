#include<iostream>
using namespace std;
int main()
{
 	int birth_yr,curnt_yr;
  	cin>>birth_yr>>curnt_yr;
  	if(birth_yr>curnt_yr)
    {
      int a = 1900+birth_yr;
      int b = 2000+curnt_yr;
      cout<<b-a;
    }
  	else
    {
      int a = 2000+birth_yr;
      int b = 2000+curnt_yr;
      cout<<b-a;
    }
  
}