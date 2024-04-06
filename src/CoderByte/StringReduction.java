package CoderByte;

import java.util.HashMap;
import java.util.Map;

public class StringReduction {

    public static int StringReduction(String str) {
        Map<String, String> reductionRules = new HashMap<>();
        reductionRules.put("ab", "c");
        reductionRules.put("ac", "b");
        reductionRules.put("bc", "a");
        reductionRules.put("ba", "c");
        reductionRules.put("ca", "b");
        reductionRules.put("cb", "a");
        int changes = 0;

        while (true) {
            for (Map.Entry<String, String> rule : reductionRules.entrySet()) {
                if (str.contains(rule.getKey())) {
                    str = str.replace(rule.getKey(), rule.getValue());
                    changes += 1;
                }
                if(changes == 0)
                    return str.length();
                changes = 0;
            }

            }

    }

    public static void main(String[] args) {
        System.out.println(StringReduction("cab"));  // Output: 2
        System.out.println(StringReduction("bcab")); // Output: 1
    }
}