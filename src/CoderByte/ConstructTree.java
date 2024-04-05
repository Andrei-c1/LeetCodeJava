package CoderByte;

import java.util.*;
import java.io.*;

class ConstructTree {

    public static String TreeConstructor(String[] strArr) {
        // code goes here
        //1, chech every parent has 2 child {parent: [chil,chil]}
        //2. chack every child has 1 parent{chidl parent}

        HashMap<String,ArrayList<String>> parentChild = new HashMap<>();
        HashMap<String,String> childParent = new HashMap<>();

        for(String s: strArr){
            String child = s.substring(1, s.length() - 1)
                    .split(",")[0];
            String parent  = s.substring(1, s.length() - 1)
                    .split(",")[1];

            if(!parentChild.containsKey(parent)){
                parentChild.put(parent, new ArrayList<>());
            }
            parentChild.get(parent).add(child);

            if(parentChild.get(parent).size() > 2){

                return "false";
            }

            if(childParent.containsKey(child)){
                return "false";
            }
            childParent.put(child,parent);
        }
        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);

    }

}