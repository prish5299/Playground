#include<iostream>
using namespace std;
int main()
{
  int petrol, distance, posible_dis;
  float mileage;
  cin>>mileage>>petrol>>distance;
  posible_dis = mileage * petrol;
  if(posible_dis>=distance)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}