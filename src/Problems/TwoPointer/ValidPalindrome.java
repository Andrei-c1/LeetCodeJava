package Problems.TwoPointer;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int st = 0;
        int en = s.length() - 1;

        while(st < en){
            Character start = s.charAt(st);
            Character end = s.charAt(en);
            if(!Character.isLetterOrDigit(start)){
                st++;
                continue;
            }
            if(!Character.isLetterOrDigit(end)){
                en--;
                continue;
            }
            if (Character.toLowerCase(start) != Character.toLowerCase(end)){
                return false;
            }
            st++;
            en--;
        }


        return true;
    }
}
