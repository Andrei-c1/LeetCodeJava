package Problems.MathNGeometry;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();

        while(!visited.contains(n)){
            visited.add(n);
            n = sumSquare(n);
            if(n == 1)
                return true;
        }
        return false;


    }
    public int sumSquare(int n) {
        int out = 0;
        while(n != 0){
            int digit = n % 10;
            digit = digit * digit;
            out += digit;
            n = n / 10;
        }
        return out;

    }
}
