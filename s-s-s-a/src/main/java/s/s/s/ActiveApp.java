package s.s.s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActiveApp {
    public static void main(String[] args) {
        SpringApplication.run(ActiveApp.class,args);
    }
}
