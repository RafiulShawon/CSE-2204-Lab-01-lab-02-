#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cout<<"Eneter the size of the array:"<<endl;
    cin>>n;

    int arr[n];
    cout<<"Enter the size of the array:"<<endl;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int compare=0,swaping=0;

    for(int i=0;i<n-1;i++){
        compare++;
        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                swap(arr[j],arr[j+1]);
            }
            swaping++;

        }
        
    }
    cout<<"Sorted array:"<<endl;
        for(int i=0;i<n;i++){
            cout<<arr[i]<<" ";
        }

        cout<<"Number of comparison:"<<compare<<endl;
        cout<<"Number of swap:"<<swaping<<endl;

}