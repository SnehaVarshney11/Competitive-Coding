package Amazon Questions.Tree;

class TwoMirrorTrees {
    boolean areMirror(Node a, Node b) {
        // Your code here
        if(a == null || b == null) return a==b;
        
        if(a.data != b.data){
            return false;
        }
        return areMirror(a.left, b.right) && areMirror(a.right, b.left);
    }
}