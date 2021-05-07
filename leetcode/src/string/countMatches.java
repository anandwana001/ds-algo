package string;

import java.util.List;

public class countMatches {

    // https://leetcode.com/problems/count-items-matching-a-rule/

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        short match = 0;
        short i = 0;

        if (ruleKey.equals ("color")) {
            i = 1;
        } else if (ruleKey.equals ("name")) {
            i = 2;
        }

        for(List<String> item: items) {
            if(item.get(i).equals(ruleValue)) {
                match++;
            }
        }
        return match;
    }
}
