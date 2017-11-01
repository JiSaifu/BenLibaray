package benjamin.lib.ex.collection;

import benjamin.lib.ex.AbstractEx;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Collection Test
 */
public final class CollectionEx extends AbstractEx {

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

    @Override
    public void doEx() {
        testIterator();
        testFormater();
    }
}
