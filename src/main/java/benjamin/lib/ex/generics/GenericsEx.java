package benjamin.lib.ex.generics;

import benjamin.lib.ex.AbstractEx;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class GenericsEx extends AbstractEx {
    public static <T extends Object> void out(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }

    public static <T extends Number> void outNum(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }

    @Override
    public void doEx() {

    }

    public static void main(String[] args) {
        out("Hello", 100, 11.11, true);
        outNum(1, 2.2, 3);

        List<Number> x = new ArrayList<>();
        x.add(100);
        x.add(123.111);
        List<? extends Object> test = x;
        for(Object y : x) {
            System.out.println(y);
        }

        NumberPrinter<Integer> np = new NumberPrinter<>();
        np.numberPrintln(100);
    }
}
