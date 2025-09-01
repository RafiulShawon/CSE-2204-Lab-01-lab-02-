#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter the size array:"<<endl;
    cin>>n;

    int arr[n];
    cout<<"Enter the number of array:"<<endl;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int compare=0,swapping=0;
    for(int i=0;i<n-1;i++){
        compare++;
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                swap(arr[i],arr[j]);
                swapping++;
            }          
        }
    }
    cout<<"Sorrted array:"<<endl;
for(int i=0;i<n;i++){
    cout<<arr[i]<<" ";
}

cout<<"Number of swapping:"<<swapping<<endl;
cout<<"Number of compare:"<<compare<<endl;


}