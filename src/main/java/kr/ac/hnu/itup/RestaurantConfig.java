package kr.ac.hnu.itup;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestaurantConfig {
    @Bean
    public Restaurant restaurant() {
        Restaurant restaurant = new Restaurant();
        restaurant.setName("미소 분식");
        restaurant.setAddress("대전광역시 동구");
        restaurant.setPhone("042-222-3333");
        restaurant.setChef(chef());
        return restaurant;
    }
    @Bean
    public Chef chef() {
        Chef chef = new Chef();
        chef.setName("백종원");
        chef.setAge(57);
        return chef;
    }
}
