package leetcode.ez;

public class Main {

    public static void main(String[] args) {
        DesignanOrderedStream1656 main = new DesignanOrderedStream1656(5);

//        [3,"ccccc"],[1,"aaaaa"],[2,"bbbbb"],[5,"eeeee"],[4,"ddddd"]]
        System.out.println(main.insert(3,"ccccc"));
        System.out.println(main.insert(1,"aaaaa"));
        System.out.println(main.insert(2,"bbbbb"));
        System.out.println(main.insert(5,"eeeee"));
        System.out.println(main.insert(4,"ddddd"));

    }
}
