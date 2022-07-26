package July;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
class LengthOfLongestPalindromeInLL {
    public static int maxPalindrome(Node head)
        {
          //add code here.
            Node curr = head;
         Node prev = null;
         
         int ans =0;
         while(curr != null){
             Node next = curr.next;
             curr.next = prev;
             
             // for odd case 2<-3<-4 5 4->3->2
             ans = Math.max(ans, 2*count(prev, next)+1);
             // even
             ans = Math.max(ans, 2*count(curr,next));
             prev = curr;
             curr = next;
             
         }
         return ans;
         
       }
       
       static int count(Node first , Node last){
           Node a = first;
           Node b = last;
           
           int count =0;
           
           while( a!= null && b!=null){
               if(a.data == b.data){
                   a=a.next;
                   b=b.next;
                   
                   // this will iterate line by line 
                   count++;
               }
               else{
                   break;
               }
           }
           return count;
       }
}
