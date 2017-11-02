package benjamin.lib.ex.spring.ioc;

import benjamin.lib.ex.AbstractEx;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import static java.lang.Thread.sleep;


public class I18nEx extends AbstractEx {

    @Override
    public void doEx() {
        //Locale locale = new Locale("zh", "CN");
        Locale locale = new Locale("ja", "JP");
        NumberFormat currFmt = NumberFormat.getCurrencyInstance(locale);
        DateFormat dtFmt = DateFormat.getDateInstance(DateFormat.LONG, locale);

        String pattern1 = "At {1, time, short} On {1, date, long}, {0} paid {2, number, currency}";
        MessageFormat msgFmt = new MessageFormat(pattern1, Locale.US);

        double amt = 123.456;
        System.out.println(currFmt.format(amt));
        System.out.println(dtFmt.format(new Date()));
        System.out.println(msgFmt.format(new Object[]{"Yu", new Date(), 123.456}));

        ResourceBundle resEnUs = ResourceBundle.getBundle("resource", new Locale("en", "US"));
        System.out.println(resEnUs.getString("resource1"));
        System.out.println(resEnUs.getString("resource2"));

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[]{
                        "beans_c4.xml"
                }
        );
        // messageResource带有MessageFormat的功能
        MessageSource sms = (MessageSource) ctx.getBean("myResource1");
        System.out.println(sms.getMessage("common.resource", new Object[]{"Yu", new Date(), 123.456}, new Locale("zh", "CN")));

        MessageSource rms = (MessageSource) ctx.getBean("myReloadableResource1");
        System.out.println(sms.getMessage("resource1", null, new Locale("ja", "JP")));
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println(rms.getMessage("resource1", null, new Locale("ja", "JP")));
        System.out.println("ctx:" + ctx.getMessage("resource1", null, new Locale("ja", "JP")));
    }
}
