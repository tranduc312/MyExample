package efective.commonmethod.equals;

public class Main {

    public static void main(String[] args) {
        /*Phone phone = new Phone("Duc");
        String s = "Duc";
        List<Phone> phones = new ArrayList<>();
        phones.add(phone);
        System.out.println(phones.contains(s));
        System.out.println(phones.contains(new Phone("Duc")));*/
        testEqualsFloat();
        testEqualsDouble();
    }

    static void testEqualsFloat() {
        float f1 = 1.3f;
        float f2 = 1.3f;
        System.out.println("(f1 == f2) " + (f1 == f2));
        System.out.println("(Float.compare(f1, f2) " + Float.compare(f1, f2));
        System.out.println("(Float.compare(f1, f2) " + Float.compare(f1, f2));
    }

    static void testEqualsDouble() {
        double d1 = 1.2;
        double d2 = 1.2;
        System.out.println("d1 == d2" + (d1 == d2));
        System.out.println("Double.compare(d1, d2)" + Double.compare(d1, d2));
    }
}
