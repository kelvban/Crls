/**
 * The reverse order of pairs in an array
 */
package nowcoder.sword;

public class ReverseOfPairInArray {
    private int count;
public int InversePairs(int [] array) {
if(array==null || array.length==0) return -1;
MergeSort(array,0,array.length-1);
return count;
}
private void MergeSort(int[] array,int start,int end){
if(start>=end) return;
int mid=(start+end)/2;
MergeSort(array,start,mid);
MergeSort(array,mid+1,end);
Merge(array,start,mid,end);
}
private void Merge(int[] array,int start,int mid,int end){
int[] temp=new int[end-start+1];
int k=0,i=start,j=mid+1;
while(i<=mid && j<=end){
if(array[i]<=array[j]){
temp[k++]=array[i++];
}else{
temp[k++]=array[j++];
count=(count+(mid-i+1))%1000000007;
}
}
while(i<=mid){
temp[k++]=array[i++];
}
while(j<=end){
temp[k++]=array[j++];
}
for(int m=0; m<k; m++){
array[start+m] = temp[m];
}
}
}