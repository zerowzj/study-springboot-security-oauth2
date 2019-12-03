package study.springboot.security.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import study.springboot.security.oauth2.support.SpringBootCfg;

public class Startup {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootCfg.class, args);
        context.start();
    }
}