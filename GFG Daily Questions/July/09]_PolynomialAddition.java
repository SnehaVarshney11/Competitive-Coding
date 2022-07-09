package July;

class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}
class PolynomialAddition {
    public static Node addPolynomial(Node p1,Node p2)
    {
        //Add your code here.
        Node t1=p1 , t2=p2;
       Node ans,prev=new Node(-1,-1);
       ans=prev;
       while(t1 !=null && t2 != null)
       {
           if(t1.pow==t2.pow)
           {
               ans.next=new Node(t1.coeff+t2.coeff, t1.pow);
               t1=t1.next;
               t2=t2.next;
           }
           else if(t1.pow>t2.pow)
           {
               ans.next=new Node(t1.coeff, t1.pow);
               t1=t1.next;
           }
           else
           {
               ans.next=new Node(t2.coeff, t2.pow);
               t2=t2.next;
           }
           ans=ans.next;
       }
       if(t1!=null)
       {
           ans.next=t1;
       }
       if(t2!=null)
       {
           ans.next=t2;
       }
       return prev.next;
    }
}
