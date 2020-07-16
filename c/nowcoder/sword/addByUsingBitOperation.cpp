#include <iostream>
 
using namespace std;
class Solution{
	public:
		int addNum(int num1,int num2){
			while(num2!=0){
				int temp=num1^num2;
				num2=(num1&num2)<<1;
				num1=temp;
			}
			return num1; 
		}
}; 
//int main(){
//	Solution solution;
//	int result=solution.addNum(5,4);
//	cout<<result<<endl;
//}
