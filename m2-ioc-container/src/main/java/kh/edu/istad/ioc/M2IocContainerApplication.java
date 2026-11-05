package kh.edu.istad.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class M2IocContainerApplication implements CommandLineRunner {

    // 1. Declare dependency
    private final MyBean myBean; // Required dependency
    private MyBean myBean2; // Optional dependency

    // 2. Constructor injection
    public M2IocContainerApplication(MyBean myBean) {
        this.myBean = myBean;
    }

    // 3. Setter injection
    @Autowired
    public void setMyBean2(MyBean myBean2) {
        this.myBean2 = myBean2;
    }

    @Override
    public void run(String... args) throws Exception {
        myBean.getName("John");
        myBean2.getName("Kanha");
    }

    public static void main(String[] args) {
        SpringApplication.run(M2IocContainerApplication.class, args);
    }


}
