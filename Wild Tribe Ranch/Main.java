#include<iostream>
using namespace std;
int main()
{
	int max_weight, weight=0;
    std::cin>>max_weight>>weight;
    if(weight<max_weight)
    {
    	std::cout<<"Yes, you can enter.";
    }
    else if(weight==max_weight)
    {
    	std::cout<<"Yes, you can enter. Kindly use a rope.";
    }
    else
	{
    	std::cout<<"Sorry, you can't enter";
    }
}