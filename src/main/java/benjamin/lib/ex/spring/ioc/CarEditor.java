package benjamin.lib.ex.spring.ioc;

import java.beans.PropertyEditorSupport;

public class CarEditor extends PropertyEditorSupport{

    @Override
    public void setAsText(String text) {
        if (text == null || text.indexOf(",") == -1) {
            throw new IllegalArgumentException("设置的字符串格式不正确");
        }
        String[] infos = text.split(",");
        Car car = new Car();
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.parseInt(infos[1]));

        this.setValue(car);
    }
}
