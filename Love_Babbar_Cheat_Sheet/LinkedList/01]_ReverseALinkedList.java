package Love_Babbar_Cheat_Sheet.LinkedList;

class ReverseALinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next =  null;
        }
    }    
    // Function to reverse Linked List
    // Iterative Method
    Node reverse(Node node){
        Node prev = null;
        Node curr = node; 
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    //Recursive Method
    static Node rNode(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node rest = rNode(head.next);
        head.next.next = head;

        head.next = null;

        return rest;
    }
    /* Function to print linked list */
    static void print()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
 
    static void push(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    
    // Driver Code
    public static void main(String[] args)
    {
        ReverseALinkedList list = new ReverseALinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
 
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);

        // Recursive 
        /* Start with the empty list */
        
        push(20);
        push(4);
        push(15);
        push(85);
        
        System.out.println("Given linked list");
        print();
        
        head = rNode(head);
        
        System.out.println("Reversed Linked list");
        print();
    }
}   
