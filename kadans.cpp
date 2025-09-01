#include<iostream>
#include<algorithm>
#include<cmath>
using namespace std;

int main(){
    int i,n;

    cout<<"Enter the array size "<<endl;
    cin>>n;

    int arr[n];
    cout<<"Enter the array element:"<<endl;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int sum=0;
    int maxsum=INT_MIN;
    
    for(int i=0;i<n;i++){
        sum+=arr[i];
        maxsum=max(sum,maxsum);

        if(sum<0){
            sum=0;
        }
    }
    cout<<"sum is :"<<maxsum<<endl;
}