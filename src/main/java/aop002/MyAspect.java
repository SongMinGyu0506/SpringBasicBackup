package aop002;

import lombok.extern.log4j.Log4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Log4j
public class MyAspect {
    public void before(JoinPoint joinPoint) {
      log.info("얼굴 인식 확인: 문을 개방하라");
    }

    public void lockDoor(JoinPoint joinPoint) {
        log.info("주인님 나갔다: 어이 문 잠가!!!");
    }
}
