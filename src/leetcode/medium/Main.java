package leetcode.medium;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) throws ParseException {

        String str_date = "2022-10-19";
        new SimpleDateFormat("yyyyMMdd");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate.now().isBefore(date);
//        System.out.println(LocalDate.now().isAfter(LocalDate.parse("2022-10-18", formatter)));
//        System.out.println(LocalDate.now().isAfter(LocalDate.parse("2022-10-19", formatter)));
//        System.out.println(LocalDate.now().isAfter(LocalDate.parse("2022-10-20", formatter)));
//        System.out.println(date);


//        System.out.println(LocalDate.parse("2022-10-18", formatter).isBefore(LocalDate.now()));
//        System.out.println(LocalDate.parse("2022-10-19", formatter).isBefore(LocalDate.now()));
//        System.out.println(LocalDate.parse("2022-10-20", formatter).isBefore(LocalDate.now()));

//        System.out.println(!LocalDate.now().toString().equals("2022-10-19"));
//        System.out.println(!"2022-10-19".equals(LocalDate.now().toString()));
//        System.out.println(!"2022-10-20".equals(LocalDate.now().toString()));
//        System.out.println(!"2022-10-21".equals(LocalDate.now().toString()));

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String currentDay = formatter.format(LocalDate.now());
        String currentDay1 = formatter1.format(LocalDate.now());
//        System.out.println(currentDay);
//        System.out.println(currentDay1);

//        31368
//        System.out.println(formatTime(31368));
//        System.out.println(formatTime(3761485));
//        System.out.println("time convert product vanriant" + formatTime(3612778));
//        System.out.println("total time index product: " + formatTime(3687817));
//        System.out.println(3687817 - (3612778 + 1897 + 2742 + 817 + 20319));
//        System.out.println("total time index product in elasticsearch: " + formatTime(49264));

//        System.out.println((double)(15 * 100) / 100);

        /*
        time get data product in intern DB: 817
        time get data categories in intern DB: 2742
        time get data customerGroup in intern DB: 1897
        time handle convert B2BProduct(Product variant & Stock): 3612778
        time index in elaticsearch: 49264
        =>> total time = 3687817
        *///
//        System.out.println("total time: " + formatTime(3687817));
//        System.out.println("time get data product in intern DB: " + formatTime(817));
//        System.out.println("time get data categories in intern DB: " + formatTime(2742));
//        System.out.println("time get data customerGroup in intern DB: " + formatTime(1897));
//        System.out.println("time handle convert B2BProduct(Product variant & Stock): " + formatTime(3612778));
//        System.out.println("time index in elaticsearch: " + formatTime(49264));
//        System.out.println("other: " + formatTime(20319));
//        System.out.println(3687817 - (3612778 + 1897 + 2742 + 817 + 49264));


//        System.out.println("time get data product in intern DB: " + (double)817/3687817 * 100);
//        System.out.println("time get data categories in intern DB: " + (double)2742/3687817 * 100);
//        System.out.println("time get data customerGroup in intern DB: " + (double)1897/3687817 * 100);
//        System.out.println("time handle convert B2BProduct(Product variant & Stock): " + (double)3612778/3687817 * 100);
//        System.out.println("time index in elaticsearch: " + (double)49264/3687817 * 100);

//        List<Object[]> variations = new ArrayList<>();
//        for (int i = 0; i < 3; ++i) {
//            Object[] arr = new Object[2];
//            arr[0] = "1";
//            arr[1] = null;
//            variations.add(arr);
//        }
//        for (Object[] arr : variations) {
//            if (arr[1] == null) continue;
//                switch (arr[1].toString()) {
//                    case "1":
//                        break;
//                    case "2":
//                        break;
//                    case "3":
//                        break;
//            }
//        }
//        System.out.println(variations.get(0)[1].toString());
//        String s = "LVL22_16_2_2";
//        System.out.println(s.substring(0, s.indexOf("_")));
//        System.out.println(formatTime(118171));
//        System.out.println(formatTime(252236));
//        System.out.println("ignore variant & price: " + formatTime(2255394));
//        System.out.println("[index-product]AttributeWithQuery.json: " + formatTime(44389));
//
//
//        System.out.println("[index-product]AttributeWithMap.json: " + formatTime(42759));

//        System.out.println("[index-product]10k fast" + formatTime(297001));
//
//        System.out.println("[index-product]10k normal" + formatTime(664461));

//        System.out.println("[index-product]24855 normal" + formatTime(2255133));
//        System.out.println("[index-product]24855 fast: " + formatTime(655047));
//        System.out.println(" " + formatTime(562348));
//        System.out.println(" " + formatTime(297561));



//        18648 fast
//        35115


//       List<String> productUuidAgilitys = internalProducts.stream().map(ProductModel::getProductUuidAgility).collect(Collectors.toList());

//        List<Key> list = new ArrayList<>(Arrays.asList(new Key("key", "item"), new Key("key2", "item3")));
//        List<Key> list = null;
//        list.stream().map(Key::getKey).collect(Collectors.toList()).forEach(s -> System.out.println(s));


//        System.out.println(" " + formatTime(607364));
//        System.out.println(" " + formatTime(284695));
//        System.out.println(" " + formatTime(280671));
//        String a = null;
//        System.out.println(a.IsNullOrEmpty));
//        System.out.println(" " + formatTime(16373));


        /*int size = 881;
        List<Integer> list = Arrays.asList(new Integer[881]);
        List<Integer> listRs = new ArrayList<>();
        System.out.println(list.size());
        for (int i = 0; i < 10; ++i) {
            int rs = size/10;
            if (i == 9) {
                rs = size / 10 != 0 ? (size / 10 + size % 10) : (size / 10);
            }
            listRs.add(rs);
        }
        System.out.println(listRs.stream().mapToInt(i -> i).sum());
        System.out.println(listRs.toString());*/

//        System.out.println(" " + formatTime(78408));
//        System.out.println(" " + formatTime(2066441));
//
//        String s = "thickness::10.0__width::6.0__length::14.0";
//        String[] array = s.split("__");
////        for (String s : array) {
////            System.out.println();
////
////        }
//        System.out.println();
//        System.out.println(array[0].replace("thickness::", ""));
//        System.out.println(array[1].replace("width::", ""));
//        System.out.println(array[2].replace("length::", ""));


//        System.out.println("Collections.synchronizedList: " + formatTime(74899));
//        System.out.println("Collections.synchronizedList: " + formatTime(70571));
//        System.out.println("Collections.synchronizedList: " + formatTime(139596));
//        System.out.println(new BigDecimal(70571).add(new BigDecimal(139596)) );
//
//        System.out.println(Long.MAX_VALUE/60);
//        System.out.println(153722867/60/60);

//        System.out.println(formatTime(158400));
//        System.out.println(101 << 1 | 5);

//        System.out.println(Arrays.asList('w', 'o', 'l', 'f')
//                .stream()
//                .reduce("",(c,s1) -> c + s1,
//                        (s2,s3) -> s2 + s3));
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Arrays.asList(1,2,3,4,5,6)
//                    .parallelStream()
//                    .reduce(0,(a,b) -> (a-b)));
//        }
//        long timeProduct = 4901;
//        long timeVariation = 41051;
//        long timeImage = 11721;
//        long total = timeProduct + timeVariation + timeImage;
//
//        long time3Variation = 3370;
//        long timeVariationOption = 33635;
//        long timeRelaBuild = 4046;
//        double percent3Variation = (time3Variation * 100.0 / timeVariation + 0.5);
//        double percentVariationOption = (timeVariationOption * 100.0 / timeVariation + 0.5);
//        double percentRelaBuild = (timeRelaBuild * 100.0 / timeVariation + 0.5);
//        System.out.println("percent3Variation: " + percent3Variation + "\n" +
//                "percentVariationOption: " + percentVariationOption + "\n" +
//                "percentRelaBuild: " + percentRelaBuild);
//
//
//        double percentProduct = (timeProduct * 100.0 / total + 0.5);
//        double percentVariation = (timeVariation * 100.0 / total + 0.5);
//        double percentImage = (timeImage * 100.0 / total + 0.5);
//        System.out.println("total time sync product " + formatTime(timeProduct) + " percent " + percentProduct);
//        System.out.println("total time sync variation " + formatTime(timeVariation) + " percent " + percentVariation);
//        System.out.println("total time sync Image " + formatTime(timeImage) + " percent " + percentImage);

//        System.out.println(formatTime(308044));
//        System.out.println(formatTime(304569));

//        System.out.println(formatTime(72166));
//        System.out.println(formatTime(42278));

        /*Objects a = null;
        System.out.println(a.toString());*/

        System.out.println(testParseDouble());
    }

    public static double testParseDouble() {
        String shippingFee1 = "";
//        String shippingFee2 = "49.99";
////        System.out.println(Double.parseDouble(shippingFee1));
//        System.out.println(Double.parseDouble(shippingFee2));
//        System.out.println(Double.valueOf(shippingFee2));
//        System.out.println(Double.valueOf(shippingFee1));


        return StringUtils.isNotEmpty(shippingFee1)
                ? Double.parseDouble(shippingFee1)
                : 0.0;
    }


    public static String formatTime(long totalTime) {
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss.SSS");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        return formatter.format(new Date(totalTime));
    }
}
