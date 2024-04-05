package CoderByte;

import java.util.*;
import java.io.*;

class LongestWord {

    public static String LongestWord(String sen) {
        sen = sen.replaceAll(
                "[^a-zA-Z0-9\s]", "");
        String longest = "";

        for(String word: sen.split(" ")){
            if(word.length() > longest.length()){
                longest = word;
            }
        }

        // code goes here
        return longest;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
