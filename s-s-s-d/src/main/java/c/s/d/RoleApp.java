package c.s.d;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@DubboComponentScan(basePackages = "c.s.d.service.impl")
@MapperScan("c.s.d.dao")
public class RoleApp {
    public static void main(String[] args) {
        SpringApplication.run(RoleApp.class,args);
    }
}
