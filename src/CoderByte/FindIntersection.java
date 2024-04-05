package CoderByte;

import java.util.*;
import java.io.*;

class Main {

    public static String FindIntersection(String[] strArr) {
        String result = "";
        Set<Integer> intersections = new HashSet<>();
        for (String num: strArr[0].split(",")){
            intersections.add(Integer.valueOf(num.trim()));
        }

        for(String num: strArr[1].split(",")){
            if(intersections.add(Integer.valueOf(num.trim()))== false) {
                result = result + num.trim() + "," ;
            }

        }

        if(result == "")
            return "false";

        return result.substring(0,result.length()-1);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);

    }

}
