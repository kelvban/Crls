/**
 * deep clone the linked list
 */

public class RandomListNode {
    int label;
    RandomListNode next = null; //for the next node
    RandomListNode random = null; // for a random node

    RandomListNode(int label) {
        this.label = label;
    }
}

class CopyOfComplexLinkedList{

    public RandomListNode Clone(RandomListNode pHead)
    {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode p = pHead;
        while(p != null){
            RandomListNode node = new RandomListNode(p.label);
            map.put(p, node);
            p = p.next;
        }
        p = pHead;
        while(p != null){
            RandomListNode node = map.get(p);
            node.next = (p.next == null)?null: map.get(p.next);
            node.random = (p.random == null)?null: map.get(p.random);
            p = p.next;
        }
        return map.get(pHead);
    }
    
}