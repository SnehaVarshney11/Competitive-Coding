package October;

import java.util.ArrayList;
import java.util.List;

class GeekAndStrings {
    static class Node

    {   
        Node ch[];  
        boolean end;    
        int tc; 
        Node()  
        {   
            ch=new Node[26];    
            end=false;  
            tc=0;   
        }   
    }   
            
        public static void insert(String s,Node root)   
        {   
            Node curr=root; 
            for(int i=0;i<s.length();i++)   
            {   
                    
            int id=s.charAt(i)-'a'; 
            if(curr.ch[id]==null)   
            curr.ch[id]=new Node(); 
            curr.tc+=1; 
            curr=curr.ch[id];   
            }   
            curr.tc+=1; 
            curr.end=true;  
        }   
            
        public static int find(String s,Node root)  
        {   
            if(root==null)  
            return 0;   
                
            int count=0;    
            Node curr=root; 
            for(int i=0;i<s.length();i++)   
            {   
                int idx=s.charAt(i)-'a';    
                    
                if(curr.ch[idx]==null)  
                return count;   
                    
                curr=curr.ch[idx];  
            }   
            return curr.tc; 
        }   
    
    

    static List<Integer> prefixCount(int N, int Q, String li[], String query[])

    {

        List<Integer> ans=new ArrayList<>();

        Node root=new Node();

        

        for(int i=0;i<li.length;i++)

        {

            insert(li[i],root);

        }

        

        for(int i=0;i<query.length;i++)

        {

            int cnt=find(query[i],root);

            ans.add(cnt);

        }

        

        return ans;

    }
}
