package expert004;

import lombok.extern.log4j.Log4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Log4j
public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("expert004/expert004.xml");
        Car car = context.getBean("car", Car.class);

        log.info(car.getTireBrand());
    }

}
