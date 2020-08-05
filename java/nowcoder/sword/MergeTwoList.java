class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}

class MergeTwoList{

    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null&&list2==null){
            return null;
        }
        else if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }
        return null;
    }
}