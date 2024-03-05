package Problems.ArraysNHashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        for(int num:set){
            int count = 1;
            if(!set.contains(num-1)){
                while(set.contains(num+1)){
                    count++;
                    num++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
