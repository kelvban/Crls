package others;

import java.lang.annotation.Target;

public class Search {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        int result=binarySearch(arr, 5, 0, 4);
        System.out.print(result+1);
    }

    public static int binarySearch(int[] arr,int key,int low,int high){
        int middle=(low+high)/2;
        if(arr[middle]>key){
            return binarySearch(arr, key, low, middle-1);
        }else if(arr[middle]<key){
            return binarySearch(arr, key, middle+1, high);
        }else{
            return middle;
        }
    }
}