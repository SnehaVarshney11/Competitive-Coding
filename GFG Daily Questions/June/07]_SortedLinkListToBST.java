package June;

class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d; 
        next = null;
    }
}

class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }
    
}


class SortedLinkListToBST{
    public TNode makeBST(LNode root){
        if(root == null) 
            return null;
        if(root.next == null)
            return new TNode(root.data);
            
        LNode slow = root, fast = root.next;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        LNode mid = slow.next;
        slow.next = null;
        
        TNode n = new TNode(mid.data);
        //Find left
        n.left = makeBST(root);
        //Find right
        n.right = makeBST(mid.next);
        
        return n;
    }
    public TNode sortedListToBST(LNode head)
    {
        //code here
        return makeBST(head);
    }
}