package vn.edu.giadinh.tuan09;

public class bubble {
    public static void main(String[] args) {
        int[] a={1,7,5,9,-1,0,19};
        bubbleSort(a);
        System.out.println(binarysearch(a, 9));
    }
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    static int binarysearch(int arr[], int x){
        int l=0, r=arr.length-1;
        while( l <= r){
            int m =1+(r-1)/2;
            if(arr[m]==x){
                return m;
            }
            if(arr[m]<x){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return -1;
    }
}
