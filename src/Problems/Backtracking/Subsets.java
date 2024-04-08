package Problems.Backtracking;

import java.util.ArrayList;
import java.util.List;

class Subsets{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dfs(ans,0,current,nums);
        return ans;


    }

    public void dfs(List<List<Integer>> ans, int i , List<Integer>current, int[]nums ){

        if(i >= nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        dfs(ans,i+1,current,nums);
        current.remove(current.size()-1);
        dfs(ans,i+1,current,nums);



    }
}