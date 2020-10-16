package nowcoder.sword;
class Node{
    int val;
    Node next=null;
    Node(int val){
        this.val=val;
    }
}

class ReverseList{
    public Node reverseList(Node head){
        if (head == null || head.next==null) return head;

        Node pre = null;
        Node post = head;
        while(head!=null)
        {
            post = head.next;
            head.next = pre;
            pre = head;
            head = post;
        }

        return pre;
    }

    // public static void main(String[] args) {

    //      Node head=null;
    //     for(int i=0;i<5;i++){
    //         Node node=new Node(i);
    //         node.next=head;
    //         head=node;
    //     }
    //     ReverseList reverseList=new ReverseList();
    //     Node result=reverseList.reverseList(head);
    //     System.out.println(result.val);
    // }
}