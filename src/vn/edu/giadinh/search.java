package vn.edu.giadinh;

public class search {
    public static void main(String[] args) {
        int[] a={1,7,5,9,-1,0,19};
        System.out.println(search(a, 9));
    }
    public static int search(int arr[],int x){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
