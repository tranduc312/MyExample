package leetcode.ez;

public class GoalParserInterpretation1678 {

    public static void main(String[] args) {
        /*Input: command = "G()(al)"
        Output: "Goal"*/
        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
//        String command = "G()()()()(al)";
//        System.out.println(command.replace("()","o"));
    }

    static String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }
}
