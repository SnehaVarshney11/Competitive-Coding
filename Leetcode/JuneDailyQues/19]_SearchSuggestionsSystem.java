package Leetcode.JuneDailyQues;

import java.util.ArrayList;
import java.util.List;

class SearchSuggestionsSystem{
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        TrieNode root = buildTrie(products);
        List<List<String>> ans = new ArrayList<>();
        
        for(int i = 1; i <= searchWord.length(); i++){
            ans.add(findTopThree(root, searchWord.substring(0, i)));
        }
        return ans;
    }
    private List<String> findTopThree(TrieNode root, String search){
        List<String> ans = new ArrayList<>();
        TrieNode node = root;
        
        for(char ch : search.toCharArray()){
            if(node.children[ch - 'a'] == null) // means there is a word mbile without having o and we are finding the word starting with mo, then it returns nothing
                return ans;
            else{
                node = node.children[ch - 'a'];
            }
        }
        
        if(node.isWord){
            ans.add(search);
        }
        for(TrieNode child : node.children){
            if(child != null){
                List<String> res = dfs(child, search, new ArrayList<>());
                ans.addAll(res);
                if(ans.size() >= 3){
                    return ans.subList(0, 3);
                }
            }
        }
        return ans;
    }
    //implement dfs
    private List<String> dfs(TrieNode root, String word, List<String> list){
        if(root.isWord){
            list.add(word + root.c);
            if(list.size() >= 3){
                return list;
            }
        }
        for(TrieNode child : root.children){
            if(child != null){
                dfs(child, word + root.c , list);
            }
        }
        return list;
    }
    
    //Create Trie
    private TrieNode buildTrie(String[] products){
        TrieNode root = new TrieNode(' ');
        for(String prod : products){
            insert(prod, root);
        }
        return root;
    }
    //Create insert method
    private void insert(String product, TrieNode root){
        TrieNode node = root;
        
        for(int i = 0; i < product.length(); i++){
            char ch = product.charAt(i);
            if(node.children[ch - 'a'] == null){
                node.children[ch - 'a'] = new TrieNode(ch);
            }
            node = node.children[ch - 'a'];
        }
        node.isWord = true;
    }
    //Create trie class
    class TrieNode{
        char c;
        TrieNode[] children;
        boolean isWord;
        
        public TrieNode(char c){
            this.c = c;
            this.children = new TrieNode[26];
        }
    }
}