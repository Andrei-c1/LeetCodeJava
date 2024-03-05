package Problems.ArraysNHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length + 1];


        for(int i: nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

        for(int n :freq.keySet()){
            int frequency = freq.get(n);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(n);
        }

        int index = 0;
        int[] res = new int[k];
        for(int i=nums.length;i>=0;i--){
            if(bucket[i] != null){
                for(int elem: bucket[i]){
                    res[index] = elem;
                    index++;
                    if(index == k)
                        return res;
                }
            }
        }
        return res;
    }
}
