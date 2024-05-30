package kr.ac.hnu.itup.coffee;

import java.util.Arrays;
import java.util.List;

public class Cafe {
    private CoffeeMachine machine;
    private Barista barista;
    private List<Bean> beans = Arrays.asList(
            new Bean(),
            new Bean(),
            new Bean(),
            new Bean(),
            new Bean()
    );

    public Cafe(CoffeeMachine machine) {
        this.machine = machine;
    }

    // property : setter 메소드
    // property : field
    public void setBarista(Barista barista) {
        this.barista = barista;
    }

    public Coffee getOrder(int money, String menu) {
        Coffee coffee = machine.brew(beans.get(0));
        return coffee;
    }
}
