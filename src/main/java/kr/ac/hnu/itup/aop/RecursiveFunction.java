package kr.ac.hnu.itup.aop;

import org.springframework.stereotype.Component;

@Component
public class RecursiveFunction implements Calculator{
    @Override
    public long factorial(int n) {
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
        return n * factorial(n - 1);
    }
}