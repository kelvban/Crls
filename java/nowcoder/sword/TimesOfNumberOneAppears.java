/**
 * Times Of Number One appears
 */

 class TimesOfNumberOneAppears{
    public int NumberOf1Between1AndN_Solution(int n) {
        int result=0;
        for(int i=1;i<=n;i++){
            String str=String.valueOf(i);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1')
                result++;
            }
        }
        return result;
    }
 }