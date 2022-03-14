package MarchDailyQues;

import java.util.Stack;

class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] p = path.split("/");
        
        for(int i=0; i<p.length; i++){
            if(!s.isEmpty() && p[i].equals("..")) s.pop();
            else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals("..")) s.push(p[i]);
            
        }
        if(s.isEmpty()) return "/";
        while(!s.isEmpty()){
            sb.insert(0, s.pop()).insert(0,"/");
        }
        return sb.toString();
    }
}
