package benjamin.lib.genericsEx;

import java.util.Collection;

public class NumberPrinter<A extends Number> {

    public void numberPrintln(A number) {
        System.out.println(number);
    }

    public void numberCollectionPrintln(Collection<A> numberCollection) {
        for (A number : numberCollection) {
            this.numberPrintln(number);
        }
    }
}
