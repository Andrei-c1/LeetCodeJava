package Problems.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        LinkedList<List<Integer>> sol = new LinkedList<List<Integer>>();


        for(int fix=0;fix<nums.length;fix++){
            if(fix == 0 || nums[fix]!=nums[fix-1]){
                int l = fix + 1;
                int r = nums.length-1;

                while(l<r){
                    if((nums[fix] + nums[l] + nums[r]) == 0){
                        ArrayList<Integer> miniSol = new ArrayList<>();
                        miniSol.add(nums[fix]);
                        miniSol.add(nums[l]);
                        miniSol.add(nums[r]);
                        sol.add(miniSol);
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;
                        }

                        l++;

                    }
                    else if((nums[fix] + nums[l] + nums[r]) > 0){
                        r--;
                    }
                    else{
                        l++;
                    }

                }
            }
        }

        return sol;

    }
}
