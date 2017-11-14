package benjamin.lib.test.unitils;

import benjamin.lib.ex.unitils.User;
import org.junit.Test;
import org.unitils.reflectionassert.ReflectionAssert;
import org.unitils.reflectionassert.ReflectionComparatorMode;

import java.util.Date;

@SuppressWarnings("unused")
public class AssertReflectionEqualsTest {
    @Test
    public void testReflection() {
        User user1 = new User("User1", "passwd1", new String[]{
                "test", "coding"
        }, new Date());
        User user2 = new User("User1", "passwd1", new String[]{
                "coding", "test"
        }, new Date(System.currentTimeMillis() + 100));

        ReflectionAssert.assertReflectionEquals(user1, user2,
                ReflectionComparatorMode.LENIENT_ORDER, ReflectionComparatorMode.LENIENT_DATES);
    }
}
