package MarchDailyQues;

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        return copyRandomList(head, new HashMap<>());
    }
    public Node copyRandomList(Node node, Map<Node, Node> map){
        if(node==null) return null;
        if(map.containsKey(node)) return map.get(node);
        
        Node clone = new Node(node.val);
        map.put(node,clone);
        
        clone.next = copyRandomList(node.next, map);
        clone.random = copyRandomList(node.random, map);
        
        return clone;
    }
}
