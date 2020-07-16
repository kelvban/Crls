/*
 * 输入一个整数，统计其二进制中1的个数
 * */
class CountNumof1{
    public int count(int num){
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((num >>> i & 1) == 1)
                ++count;
        }
        return count;
    }
    public static void main(String[] args) {
        CountNumof1 countNumof1=new CountNumof1();
        System.out.println(countNumof1.count(6));
    }
}
