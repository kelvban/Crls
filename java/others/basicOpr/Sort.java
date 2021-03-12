package others;

import javafx.scene.effect.Light.Point;

public class Sort {
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,3,5,1};
        quickSort(arr,0,arr.length-1);
        StringBuffer sb =new StringBuffer();
        for(Integer i:arr){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());

    }
    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(i!=min){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        return arr;
    }

    public static void quickSort(int[] arr,int left,int right){
        int dp;
        if(left<right){
            dp=partition(arr, left, right);
            quickSort(arr, left, dp-1);
            quickSort(arr, dp+1, right);
        }
    }
    public static int partition(int[] arr,int left,int right){
        int pivot=arr[left];
        while(left<right){
            while(left<right&&arr[right]>=pivot){
                right--;
            }
            if(left<right){
                arr[left++]=arr[right];
            }
            while(left<right&&arr[left]<=pivot){
                left++;
            }
            if(left<right){
                arr[right--]=arr[left];
            }
        }
        arr[left]=pivot;
        return left;
    }

    // public static int[] swap(int[] arr,int i,int j){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    //     return arr;
    // }
}