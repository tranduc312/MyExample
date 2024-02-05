package leetcode.test;

import leetcode.test.dto.A;
import leetcode.test.dto.B;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
//        String s = null + "A";
//        System.out.println(s);
//        testTrim();
//        testParse();
//        testStringJoin();
//        testRemoveIf();
//        String base64 = StringUtils.EMPTY;
//        Base64.getDecoder().decode(base64);
//        testSet();
//        testConcat();
//        testAssertions();
//        testContains();
//        testReplaceWitPattern();
//        testReplaceCharacter();
//        testLimitInteger();
//        testSubList();
//        testVarargs();
//        testVarargs(false);
//        testVarargs(false, false);
//        testStreamWithInitCollection();
//        testSplitMd5();
//        System.out.println(testCastClass());
//        testGetSkuGenBundle("bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1");
//        getOriginalSKU("CA-SE-Bundle__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1");
//        List<String> list = Arrays.asList("bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundlemutilrange2811v1-1703501272896__null::1__null::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__CQU0219NY91::1__CSP0033BK11::1__GQU0131NY71::1",
//                "bundle_product_20231113_v2___114__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___99__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___99__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___99__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___102__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___99__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___89__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CSP0033BK11::1__CQU0219NY91::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CSP0033BK11::1__CQU0219NY91::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___84__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___84__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___84__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___53__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___87__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___86__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___88__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___86__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___86__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___84__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___80__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__CQU0219NY91::1__CSP0033BK11::1__GQU0131NY71::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "BUNDLE-DIGI__100021-black-5-1-month::1__350100-orange/green-xs-1-month::1__250067-brown/grey-28-1-month::1",
//                "17-11-2023-lhm-bundle__FR4845::1__createproductvariantv10::1__BK150451::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "BUNDLE-DIGI__100021-black-5-1-month::1__350100-orange/green-xs-1-month::1__250067-brown/grey-28-1-month::1",
//                "BUNDLE-DIGI__100021-black-5-1-month::1__350100-orange/green-xs-1-month::1__250067-brown/grey-28-1-month::1",
//                "Test09_53_18-17-11__testproductvariant2310v1000_S::1__testproductvariant2310v1000_L::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CSP0033BK11::1__CQU0219NY91::1",
//                "BUNDLE-DIGI__ABC::1__ABC1::1__ABC1::1",
//                "bundle_product_20231113_v2___99__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "BUNDLE-DIGI__100021::1__350100::1__250067::1",
//                "bundle_product_20231113_v2___87__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___86__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___99__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___88__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "17-11-2023-lhm-bundle__FR4845::1__createproductvariantv10::1__BK150451::1",
//                "bundle_product_20231113_v2___99__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___84__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___84__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1",
//                "bundle_product_20231113_v2___53__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1");
//        list.forEach(Main::getOriginalSKU);
//        System.out.println("bundle_product_20231113_v2".split("__")[0]);
//        System.out.println("bundle_product_20231113_v2__GQU0131NY71::1__CQU0219NY91::1__CSP0033BK11::1".split("__")[0]);
//        System.out.println("bundle_product_20231113_v2___GQU0131NY71::1CQU0219NY91::1__CSP0033BK11::1".split("__")[0]);
//        System.out.println("a".toCharArray());
        double d1 = 0;
        Double d2 = null;
        System.out.println(d1 - d2);
    }

    public static void getOriginalSKU(String sku) {
        String rs = StringUtils.EMPTY;
        // Define the pattern for extracting the original SKU
        Pattern pattern = Pattern.compile("([^_]+)__(?:[^:]+::\\d+__)*");

        Matcher matcher = pattern.matcher(sku);

        // Check if the pattern is found
        if (matcher.find()) {
            rs = matcher.group(1);
            System.out.println(rs);
        } else {
            // Handle the case where the pattern is not found
//            throw new IllegalArgumentException("messages");
            System.err.println("error: " + sku);
        }
    }

    public static void testGetSkuGenBundle(String sku) {
        Map<String, Integer> skuInfo = new HashMap<>();

        // Define the pattern for parsing
        Pattern pattern = Pattern.compile("([^:]+)::(\\d+)");

        // Split the SKU into parts using "__"
        String[] skuParts = sku.split("__");

        // Process each part
        for (int i = 1; i < skuParts.length; i++) { // Start from index 1 to skip the initial string
            Matcher matcher = pattern.matcher(skuParts[i]);
            if (matcher.find()) {
                String skuCode = matcher.group(1);
                int quantity = Integer.parseInt(matcher.group(2));
                skuInfo.put(skuCode, quantity);
            }
        }
        for (Map.Entry<String, Integer> entry : skuInfo.entrySet()) {
            System.out.println("SKU: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
    private static A testCastClass() {
        /*Integer i1 = 5;
        Integer i2 = null;
        Number n1 = i1;
        Number n2 = i2;
        System.out.println(n1);
        System.out.println(n2);*/

        /*A a = new A();
        a.setId(1);*/
        B b = new B();
        b.setId(1);
        b.setName("1");
        A a = (A) b;
        System.out.println(a);
        return a;

    }

    private static void testSplitMd5() {
        System.out.println("sku".split("_")[0]);
    }

    private static Stream<String> testStreamWithInitCollection() {
        List<String> rs = new ArrayList<>();
        return rs.stream();

    }

    private static void testVarargs(boolean... is) {
        System.out.println(is.length > 1);
    }

    private static void testSubList() {
//        List<Integer> categories = Arrays.asList(1,2,3,4);
        List<Integer> categories = null;
        List<Integer> list = categories.subList(0, 0);
        System.out.println(list);
    }

    private static void testLimitInteger() {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(++max);
    }

    private static void testReplaceCharacter() {
        List<String> lists = Arrays.asList("Men's Overshirts");
        List<String> res = lists.stream().map(l -> l.replaceAll("[^a-zA-Z0-9-_]", "")).collect(Collectors.toList());
        System.out.println("Men's Overshirts".replaceAll("[^a-zA-Z0-9-_]", ""));
    }

    static void testReplaceWitPattern() {
        String input = "Men's Overshirts";
        // Define the regular expression pattern to match alphanumeric characters and hyphens/underscores
        String pattern = "^[a-zA-Z0-9-_]*$";

        // Use the regular expression to replace non-matching characters with an empty string
        Pattern regexPattern = Pattern.compile(pattern);
        Matcher matcher = regexPattern.matcher(input);

        StringBuilder output = new StringBuilder();
        while (matcher.find()) {
            output.append(matcher.group());
        }

        System.out.println(output.toString());
    }

    private static void testContains() {
        boolean is = "d9ea87b9-1507-420e-8635-f0c3ea4205f8".contains("d9ea87b9-1507-420e-8635-f0c3ea4205f8");
        System.out.println(is);

    }

    private static void testAssertions() {
        String a = null;
        assert a != null : "not null";
        System.out.println();
    }

    private static void testConcat() {
        String a = "a";
        String b = null;
        String c = "c";
        System.out.println(a + b + c);
        System.out.println(b + a + c);
        System.out.println(a.concat(b).concat(c));

    }

    private static void testSet() {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(1);
        System.out.println("");
    }

    private static void testRemoveIf() {

        List<Integer> list = null;
        list.removeIf(l -> l == 2);
    }

    public static void accessStatic() {
        Now.testEmptyListForEach();
        testStringJoin();
    }

    private static void testStringJoin() {
        String a = "a";
        String b = "b";
        String c = null;
        String d = "d";
        String rs = StringUtils.join(a, b, c, d);
        System.out.println(rs);
        accessStatic();
    }

    private static void testParse() {
        BooleanUtils.toBoolean("a");
//        Integer.parseInt("1");
        Boolean.valueOf("true");
    }

    private static void testTrim() {
        String s = null;
        System.out.println(s.trim());

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
