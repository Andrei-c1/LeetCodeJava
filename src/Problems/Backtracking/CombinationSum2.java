package Problems.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
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
        while( i+1 < nums.length && nums[i] == nums[i+1] ){
            i++;
        }
        dfs(res,current,i+1,nums,target);



    }
}
