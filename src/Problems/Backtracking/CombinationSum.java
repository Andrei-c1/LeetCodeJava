package Problems.Backtracking;

import java.util.ArrayList;
import java.util.List;

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dfs(result,current,0,candidates,target);
        return result;


    }
    public void dfs(List<List<Integer>> res,List<Integer> current, int i,int[] nums,int target ){
        int sum = current.stream().mapToInt(Integer::intValue).sum();
        if(sum == target){
            res.add(new ArrayList<>(current));
            return;
        }
        if(i >= nums.length){
            return;
        }


        current.add(nums[i]);
        dfs(res,current,i+1,nums,target);
        current.remove(current.size()-1);
        dfs(res,current,i+1,nums,target);
    }
}
