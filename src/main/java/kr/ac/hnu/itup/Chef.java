package kr.ac.hnu.itup;

import lombok.Data;

@Data
public class Chef {
    private String name;
    private int age;

    public Ingredient prepare(){
        System.out.println("재료를 손질합니다.");
        return new Ingredient();
    }

    public Food cook(){
        System.out.println("요리를 합니다.");
        return new Food();
    }
}