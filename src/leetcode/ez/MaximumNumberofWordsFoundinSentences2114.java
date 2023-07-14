package leetcode.ez;

public class MaximumNumberofWordsFoundinSentences2114 {

    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
        System.out.println(mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"}));
    }

    static int mostWordsFound(String[] sentences) {
        int rs = 0;
        for (String sentence : sentences) {
            int len = sentence.split(" ").length;
            rs = Math.max(rs, len);
        }
        return rs;
    }
}
