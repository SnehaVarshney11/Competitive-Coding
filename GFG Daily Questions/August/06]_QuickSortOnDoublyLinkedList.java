package August;

class Node{
    int data;
    Node next, prev;
}
class QuickSortOnDoublyLinkedList {
    public static Node partition(Node l, Node h)
    {
        //code here.
        int pivot = h.data;
        Node temp1 = l;//for traversing
        Node temp2 = l;//for placing nodes less than pivot
        while(temp1 != h){
            if(temp1.data < pivot){
                swap(temp1,temp2);
                temp2 = temp2.next;
            }
            temp1= temp1.next;
        }
        swap(temp2,h);
        return temp2;
    }
    static void swap(Node temp1, Node temp2){
        int temp = temp1.data;
        temp1.data = temp2.data;
        temp2.data = temp;
    }
}
