/**
 * 指数运算
 * */
class Power{
    public double getResult(double base,int power) {
        double result=base;
        int p=Math.abs(power);
        if(p==0){
            return result=1;
        }else{
            for(int i=1;i<p;i++){
                result*=base;
            }
        }
        if(power<0){
            result=1/result;
        }
        return result;
    }
    public static void main(String[] args) {
        Power power=new Power();
        System.out.println(power.getResult(10, 2));
    }
}
