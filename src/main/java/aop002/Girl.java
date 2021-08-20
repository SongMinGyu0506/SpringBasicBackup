package aop002;

import lombok.extern.log4j.Log4j;

@Log4j
public class Girl implements Person{
    @Override
    public void runSomething() {
      log.info("요리를 한다.");
    }
}
