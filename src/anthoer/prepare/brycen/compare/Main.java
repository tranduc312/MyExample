package anthoer.prepare.brycen.compare;

import anthoer.prepare.brycen.packagescope.PublicPackageSample;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Dimension
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("B", 10));
        ducks.add(new Duck("A", 9));
        ducks.add(new Duck("C", 11));
        System.out.println("before sort: " + ducks);
//        Collections.sort(ducks);
        System.out.println("after sort: " + ducks);

        Comparator<Duck> duckComparator = Comparator.comparingInt(Duck::getAge);
//        Collections.sort(ducks, duckComparator);
        Collections.sort(ducks, (a, b) -> b.getAge() - a.getAge());
        System.out.println("sort comparator: " + ducks);


        PublicPackageSample publicPackageSample = new PublicPackageSample();
        Integer integer; // int
        Short aShort;// short
        Long aLong;// long
        Double aDouble;// double
        Float aFloat;// float
        Character character;// char
        Boolean aBoolean;// boolean
        Byte aByte;// byte
        BigInteger bigInteger;

    }
}
