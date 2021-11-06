package vn.edu.giadinh.tuan09;

public class sort {
    public static void main(String[] args) {
        int[] a={1,7,5,9,-5,-1,19};
        sort(a);
        }
    static void sort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key= arr[i];
            int j = i - 1;
            while ( j >= 0 && arr[j] > key ){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
        System.out.println();
    }
}
