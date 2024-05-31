package kr.ac.hnu.itup.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class CalculatorAdvice {
    @Around("execution(* kr..*.factorial(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        Object proceed = joinPoint.proceed();//우리가 원하는 factorial()을 호출해주는 것
        long end = System.nanoTime();
        log.info("걸린시간 : {} ns", end - start);
        return proceed;
    }
}
