package kh.edu.istad.ioc;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyTest {

    private final Coffee coffee;
    private final Coffee coffee2;

    public MyTest(Coffee coffee, @Qualifier("iceLatte") Coffee coffee2) {
        this.coffee = coffee;
        this.coffee2 = coffee2;
    }

    @PostConstruct
    public void test() {
        IO.println("Coffee: " + coffee);
        IO.println("Coffee2: " + coffee2);
    }

}
