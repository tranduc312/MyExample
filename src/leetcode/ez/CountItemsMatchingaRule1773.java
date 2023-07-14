package leetcode.ez;

import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingaRule1773 {

    public static void main(String[] args) {
        /*Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
        Output: 1
        Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].*/
        System.out.println(countMatches(Arrays.asList(Arrays.asList("phone", "blue", "pixel"),
                        Arrays.asList("computer","silver","lenovo"),
                        Arrays.asList("phone","gold","iphone")),
                "color",
                "silver"));
        System.out.println(countMatches(Arrays.asList(Arrays.asList("phone","blue","pixel"),
                        Arrays.asList("computer","silver","phone"),
                        Arrays.asList("phone","gold","iphone")),
                "type",
                "phone"));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int rs = 0;
        for (int i = 0; i < items.size(); i++) {
            if ("type".equals(ruleKey) && ruleValue.equals(items.get(i).get(0))) rs++;
            if ("color".equals(ruleKey) && ruleValue.equals(items.get(i).get(1))) rs++;
            if ("name".equals(ruleKey) && ruleValue.equals(items.get(i).get(2))) rs++;
        }
        return rs;
    }
}
