package expert002;

import lombok.extern.log4j.Log4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Log4j
public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("expert002/expert002.xml");
        Car car = context.getBean("car",Car.class);
        Tire tire = context.getBean("tire",Tire.class);
        car.setTire(tire);
        log.error(car.getTireBrand());
    }

}
