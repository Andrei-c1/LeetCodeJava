package Problems.ArraysNHashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0) - 1);
        }

        for(Map.Entry<Character,Integer> m: map.entrySet()){
            if(m.getValue() != 0){
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] count = new int[26];

        for(int i=0; i<s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i: count){
            if(i!=0){
                return false;
            }

        }
        return true;

    }
}
