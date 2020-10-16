package nowcoder.sword;
class RectCover{
    public int RectCover(int target) {
        if(target<=0){
        return 0;
        }else if(target==1||target==2){
        return target;
        }else{
            return RectCover(target-1)+RectCover(target-2);
        }

    }
    public static void main(String[] args) {
        RectCover rectCover=new RectCover();
        System.out.println(rectCover.RectCover(5));
    }
}