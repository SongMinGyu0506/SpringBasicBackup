package aop002;

import lombok.extern.log4j.Log4j;

@Log4j
public class Boy implements Person{
    @Override
    public void runSomething() {
        log.info("컴퓨터로 게임을 한다.");
    }
}
