package kh.edu.istad.ioc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@Repository
//@Service
// Annotation-based configuration
@Component // MyBean myBean = new MyBean();
public class MyBean {
    public void getName(String name) {
        IO.println("MyBean: " + name);
    }
}
