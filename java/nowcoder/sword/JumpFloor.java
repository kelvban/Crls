class JumpFloor{
    public int JumpFloor(int target) {
        if(target==1)
        return target;
        int m=1;
        int n=2;
        for(int i=3;i<=target;i++){
            int q=m+n;
            m=n;
            n=q;
        }
        return n;
    }
    public int JumpFloorII(int target) {
        if(target<=0)
        return 0;
        return (target==1)?1:2*JumpFloorII(target-1);
    }
    public static void main(String[] args) {
        JumpFloor jumpFloor=new JumpFloor();
        System.out.println(jumpFloor.JumpFloorII(30));
    }
}