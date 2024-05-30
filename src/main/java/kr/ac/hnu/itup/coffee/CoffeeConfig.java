package kr.ac.hnu.itup.coffee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoffeeConfig {
    @Bean
    public Barista barista() {
        return new Barista();
    }
    // 반환되는 타입보다 상위 타입을 리턴한다고 선언하는 것: 리스코프의 치환법칙, 객체지향의 원리: 다향성
    @Bean
    public CoffeeMachine drip() {
        return new DripCoffeeMachine();
    }
    @Bean
    public CoffeeMachine espresso() {
        return new EspressoMachine();
    }
    @Bean
    public Cafe cafe() {
        Cafe cafe = new Cafe(drip());
        cafe.setBarista(barista());
        return cafe;
    }
    @Bean
    public CoffeeAdvice coffeeAdvice() {
        return new CoffeeAdvice();
    }
}
