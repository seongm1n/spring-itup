package kr.ac.hnu.itup.coffee;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Slf4j
public class CoffeeAdvice {

    @Before("execution(* kr..*.brew(..))")
    public void grind() {
        log.info("원두를 쌈뽕하게 갈아줍니다.");
    }
}
