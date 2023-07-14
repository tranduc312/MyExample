package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        testCategory();
        String id1 = "4f50c70d-56c2-4e67-9aff-4a27207cfb9b, 6f10019d-e5e0-45db-a83b-bbe941df2af4";
        String id2 = "4f50c70d-56c2-4e67-9aff-4a27207cfb9b,6f10019d-e5e0-45db-a83b-bbe941df2af4";
        String id3 = "";
        List<String> ids1 = testCa2(id1);
        List<String> ids2 = testCa2(id2);
        List<String> ids3 = testCa2(id3);
//        System.out.println(ids3.contains("4f50c70d-56c2-4e67-9aff-4a27207cfb9b"));
//        System.out.println(convertListToString(ids1));
//        System.out.println(convertListToString(ids2));

        System.out.println(String.join(",", Arrays.asList("4f50c70d-56c2-4e67-9aff-4a27207cfb9b", "6f10019d-e5e0-45db-a83b-bbe941df2af4")));
    }

    public static String convertListToString(List<String> categoryStrList){
        return String.join(",", categoryStrList);
    }
    static List<String> testCa2(String strValue) {

        return Arrays.stream(strValue.split(",")).map(Main::trim).map(Object::toString).collect(Collectors.toList());
    }

    public static String trim(String str) {
        return str == null ? null : str.trim();
    }

    static void testCategory() {
        String id1 = "4f50c70d-56c2-4e67-9aff-4a27207cfb9b, 6f10019d-e5e0-45db-a83b-bbe941df2af4";
        String id2 = "4f50c70d-56c2-4e67-9aff-4a27207cfb9b,6f10019d-e5e0-45db-a83b-bbe941df2af4";
        List<String> ids1 = handleStrToStrList(id1);
        List<String> ids2 = handleStrToStrList(id2);
        System.out.println();

//        List<Category> categories = Arrays.asList(new Category("4f50c70d-56c2-4e67-9aff-4a27207cfb9b", "HAIR"),
//                new Category("6f10019d-e5e0-45db-a83b-bbe941df2af4", "AOILS+-+SERUMS"));
//        List<String> rs = categories.stream().map(entity -> {
//            return entity.getName();
//        }).collect(Collectors.toList());
//
//        System.out.println(rs);
    }


    public static List<String> handleStrToStrList(String strValue) {
        if (!strValue.isEmpty()) {
            return Arrays.stream(strValue.split(",")).map(Object::toString).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}
