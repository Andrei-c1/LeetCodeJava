package Problems.Backtracking;

import java.util.ArrayList;
import java.util.List;

class SubSets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dfs(res,current,0,nums);
        return res;
    }

    public void dfs(List<List<Integer>> res,List<Integer> current,int i,int[] nums){
        if(i >= nums.length){
            res.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        dfs(res,current,i+1,nums);
        while(i+1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }
        current.remove(current.size() -1);
        dfs(res,current,i+1,nums);

    }
}