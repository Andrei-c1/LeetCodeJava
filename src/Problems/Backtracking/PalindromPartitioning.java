package Problems.Backtracking;

import java.util.ArrayList;
import java.util.List;

class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> resPart = new ArrayList<>();
        List<String> current = new ArrayList<>();
        dfs(resPart,current,0,s);
        return resPart;
    }

    public void dfs(List<List<String>> res, List<String> current,int i,String s){

        if(i >= s.length()){
            res.add(new ArrayList<>(current));
            return;
        }

        current.add(String.valueOf(s.charAt(i)));
        dfs(res,current,i+1,s);
        current.remove(current.size()-1);
        dfs(res,current,i+1,s);

    }
}
