package s.s.s.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActiveController {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("gets")
    public String getS(){
        jmsMessagingTemplate.convertAndSend("asd","asdasd");
        return "ok";
    }

    @JmsListener(destination = "asd")
    public void d(String s){
        redisTemplate.opsForValue().set("s",s);
    }


}
