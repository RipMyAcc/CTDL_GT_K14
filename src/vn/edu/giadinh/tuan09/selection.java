package vn.edu.giadinh.tuan09;

public class selection {
    public static void main(String[] args) {
        int[] a={1,7,5,9,-1,0,19};
        selectionSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0; i < arr.length - 1 ;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;

                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i]=smallerNumber;
        }
    }
}
