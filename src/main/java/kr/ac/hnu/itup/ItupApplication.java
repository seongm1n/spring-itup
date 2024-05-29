package kr.ac.hnu.itup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
@SpringBootApplication
//@ImportResource("classpath:root-context.xml")
public class ItupApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ItupApplication.class, args);
        Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
        log.info("restaurant : " +  restaurant);
        Chef chef = restaurant.getChef();
        Ingredient ingredient = new Ingredient();

        Food food = chef.cook(ingredient);
        log.info("food : {}",  food);
    }
}