package leetcode.test;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        testCategory();
        /*String id1 = "4f50c70d-56c2-4e67-9aff-4a27207cfb9b, 6f10019d-e5e0-45db-a83b-bbe941df2af4";
        String id2 = "4f50c70d-56c2-4e67-9aff-4a27207cfb9b,6f10019d-e5e0-45db-a83b-bbe941df2af4";
        String id3 = "";
        List<String> ids1 = testCa2(id1);
        List<String> ids2 = testCa2(id2);
        List<String> ids3 = testCa2(id3);
//        System.out.println(ids3.contains("4f50c70d-56c2-4e67-9aff-4a27207cfb9b"));
//        System.out.println(convertListToString(ids1));
//        System.out.println(convertListToString(ids2));

        System.out.println(String.join(",", Arrays.asList("4f50c70d-56c2-4e67-9aff-4a27207cfb9b", "6f10019d-e5e0-45db-a83b-bbe941df2af4")));*/
//        testAssert();
        /*testBoolean(null, false); // false
        testBoolean(false, false); // true
        testBoolean(true, false); // false

        testBoolean(null, true); // false
        testBoolean(false, true); // false
        testBoolean(true, true); // true*/
//        testEqualPrimitive();
//        testToString();
//        testReference();
//        AbstractMap abstractMap;
//        List list;
//        List<?> list1;
//        ObjectStreamConstants objectStreamConstants;
//        testColletionsEmptyList();
//        testIntValue();
//        testValueOf();
//        testNextBoolean();
//        testNull();
        String s = null + "A";
        System.out.println(s);
    }

    private static void testNull() {
        Category category = new Category();
        System.out.println(Objects.nonNull(category));

    }

    private static void testNextBoolean() {
        for (int i = 0; i < 10; i++) {
            System.out.println(new Random().nextBoolean());
        }
    }

    static void testValueOf() {
        System.out.println(String.valueOf(null));
    }

    static void testIntValue() {
        Integer i = null;
        System.out.println(i.intValue());
    }

    static void testColletionsEmptyList() {
//        List<Category> list = Collections.emptyList();
        List<Category> list = null;
        List<String> names = list.stream().map(Category::getName).collect(Collectors.toList());
        System.out.println(names);
    }

    static void testReference() {
        Category category = new Category("1", "2");
        Category c2 = category;
        category.setName("3");
        System.out.println();
    }

    static void testToString() {
        Object o1 = null;
        System.out.println(o1.toString());
    }

    static void testEqualPrimitive() {
        /*Integer i1 = 1;
        int i2 = 1;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));*/
        Integer i3 = 1;
        Integer i4 = 2;
        System.out.println(i3 != i4);
    }

    static void testBoolean(Boolean b1, boolean b2) {
//        return Boolean.TRUE.equals(b1) && b1 != b2;
        System.out.println(Boolean.valueOf(b2) == b1);
    }

    static boolean testAssert() {
        List<String> list = new ArrayList<>();
        assert list != null;
        return true;
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
