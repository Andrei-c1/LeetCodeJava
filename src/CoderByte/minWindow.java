package CoderByte;
import java.util.*;
import java.io.*;
class minWindow {

    public static String MinWindowSubstring(String[] strArr) {
        // code goes here
        HashMap<Character,Integer> count = new HashMap<>();
        String s = strArr[0];
        String t = strArr[1];
        int matched = 0;
        int resultStart = 0;
        int minWindowLen = s.length()+1;
        int l = 0;

        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        for(int r=0;r<s.length();r++){

            Character current = s.charAt(r);
            if(count.containsKey(current)){
                count.put(current,count.get(current)-1);
                if(count.get(current) == 0)
                    matched ++;
            }

            while(matched == count.size()){
                if(minWindowLen > r - l +1){
                    minWindowLen = r - l + 1;
                    resultStart = l;
                }

                Character delete = s.charAt(l++);
                if(count.containsKey(delete)){
                    if(count.get(delete) == 0)
                        matched--;
                    count.put(delete,count.get(delete) + 1 );
                }



            }
        }


        if(minWindowLen > s.length())
            return "";

        return s.substring(resultStart,resultStart+minWindowLen);
    }


    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
    }

}
