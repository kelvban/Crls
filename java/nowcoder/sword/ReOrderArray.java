/*
 *
 * 将数组中的奇数提前，偶数奇数次序不变
 * */
class ReOrderArray{
    public void reOrderArray(int [] array){
        int oddNum=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                oddNum++;
            }
        }
        int [] tempArray=array.clone();
        int odd=0;
        int even=oddNum;
        for(int i=0;i<tempArray.length;i++){
            if(tempArray[i]%2==1){
                array[odd]=tempArray[i];
                odd++;
            }else{
                array[even]=tempArray[i];
                even++;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int [] array={1,3,4,2,5};
        ReOrderArray reOrderArray=new ReOrderArray();
        reOrderArray.reOrderArray(array);
    }
}
