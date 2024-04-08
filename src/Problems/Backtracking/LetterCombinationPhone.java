package Problems.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class LetterCombinationPhone {
    private Map<Character, String> digitToChar = Map.of(
            '2',
            "abc",
            '3',
            "def",
            '4',
            "ghi",
            '5',
            "jkl",
            '6',
            "mno",
            '7',
            "pqrs",
            '8',
            "tuv",
            '9',
            "wxyz"
    );

    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();
        String current = "";
        dfs( res,current,digits,0);
        return res;
    }
    public void dfs(List<String> res,String current,String digits,int i){
        if(current.length() == digits.length()){
            res.add(current);
            return;
        }
        if (i >= digits.length()) {
            return;}
        String digit = digitToChar.get(digits.charAt(i));

        for(int j=0;j<digit.length();j++){
            dfs(res,current + digit.charAt(j),digits,i+1);
        }



    }

}