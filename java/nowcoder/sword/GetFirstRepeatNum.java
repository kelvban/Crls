public class GetFirstRepeatNum {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean result=false;
        int flag=0;
        for(int i=0;i<length;i++){
            if(flag==1)
            break;
            for(int j=i+1;j<length;j++){
                if(numbers[i]==numbers[j]){
                    duplication[0]=numbers[i];
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1){
            result=true;
        }else{
            duplication[0]=-1;
        }
        //System.out.println(duplication[0]);
        return result;
    }
    // public static void main(String[] args) {
    //     int [] arr={2,1,3,5,4};
    //     GetFirstRepeatNum getFirstRepeatNum=new GetFirstRepeatNum();
    //     int [] duplication={-1};
    //     boolean result=getFirstRepeatNum.duplicate(arr, arr.length, duplication);
    //     System.out.println(result);
    // }
}