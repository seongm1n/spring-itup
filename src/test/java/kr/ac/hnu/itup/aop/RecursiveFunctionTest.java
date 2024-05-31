package kr.ac.hnu.itup.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class RecursiveFunctionTest {

    @Test
    void factorial() {
        RecursiveFunction recursiveFunction = new RecursiveFunction();
        long factorial = recursiveFunction.factorial(5);
        System.out.println(factorial);
        log.info("factorial: {}", factorial);
    }
}