package benjamin.lib.ex.lombok;

import benjamin.lib.ex.AbstractEx;
import lombok.*;

@RequiredArgsConstructor
public class LombokEx extends AbstractEx {

    private final String reqArg;

    private String arg1;

    @Getter(AccessLevel.PRIVATE)
    private int arg2;

    @Override
    public void doEx() {
        testNotNull(null);
    }

    private void testNotNull(@NonNull String param) {
        System.out.println("first line.");
        arg1 = param;
    }
}
