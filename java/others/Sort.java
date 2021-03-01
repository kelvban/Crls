package others;

public class Sort {
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,3,5,1};
        int[] result=selectSort(arr);
        StringBuffer sb =new StringBuffer();
        for(Integer i:result){
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
}