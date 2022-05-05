package Trie;

import java.util.HashMap;

class Trie{
    public class Node{
        char ch;
        HashMap<Character, Node> children;
        boolean isTerminal;
        public Node(char ch){
            this.ch = ch;
            children = new HashMap<>();
            isTerminal = false;
        }
    }
    private Node root;
    public Trie(){
        this.root = new Node('*');
    }
    public void insert(String word){
        Node cur = this.root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(cur.children.containsKey(ch)){
                cur = cur.children.get(ch);
            }else{
                Node n = new Node(ch);
                cur.children.put(ch, n);
                cur = n;
            }
        }
        cur.isTerminal = true;
    }
    public boolean search(String word){
        Node cur = this.root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(!cur.children.containsKey(ch)){
                return false;
            }else{
                cur = cur.children.get(ch);
            }
        }
        return cur.isTerminal;
    }
    public boolean startsWith(String prefix){
        Node cur = this.root;
        for(int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i);
            if(!cur.children.containsKey(ch)){
                return false;
            }else{
                cur = cur.children.get(ch);
            }
        }
        return true;
    }
    public static void main(String[] args){
        Trie t = new Trie();
        t.insert("Apple");
        t.insert("Mango");
        t.insert("Mango");
        System.out.println(t.search("Apple"));
        System.out.println(t.search("App"));
        System.out.println(t.startsWith("Go"));
    }
}
