package kr.ac.hnu.itup.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class CalculatorApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CalculatorApplication.class, args);
        Calculator calculator = context.getBean("forLoop", Calculator.class);
        long factorial = calculator.factorial(10);
        log.info("Factorial: {}", factorial);

        calculator = context.getBean("recursiveFunction", Calculator.class);
        factorial = calculator.factorial(10);
        log.info("Factorial: {}", factorial);
    }
}
