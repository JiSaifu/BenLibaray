package benjamin.lib.ex.spring.ioc.events;

import org.springframework.context.ApplicationListener;

public class MailSendListener implements ApplicationListener<MailSendEvent> {
    @Override
    public void onApplicationEvent(MailSendEvent event) {
        MailSendEvent mse = event;
        System.out.println("Mail Send To:" + mse.getTo());
    }
}
