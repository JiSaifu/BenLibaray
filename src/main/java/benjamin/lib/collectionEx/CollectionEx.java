package benjamin.lib.collectionEx;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Collection Test
 */
final class CollectionEx {

    public static void main(String[] args) {

        testIterator();

        testFormater();

        System.exit(0);
    }

    private static void testIterator() {
        ArrayList<String> animal = new ArrayList<>();

        animal.add("dog");
        animal.add("fish");
        animal.add("cow");

        System.out.println(animal);

        Iterator<String> aIterator = animal.iterator();
        aIterator.next();
        aIterator.remove();

        System.out.println(animal);
    }

    private static void testFormater() {
        double testDbl = 1234567.1284567;
        System.out.println(String.format("%.2f", testDbl));
    }
}
