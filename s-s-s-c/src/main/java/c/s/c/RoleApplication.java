package c.s.c;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDubbo
@DubboComponentScan("c.s.c.controller")
public class RoleApplication {
    public static void main(String[] args) {
        SpringApplication.run(RoleApplication.class,args);
        Thread s = new Thread();
        s.start();

    }
}
