package lsh.lsheureka;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
//@EnableEurekaServer
@EnableAutoConfiguration
@Configuration
@EnableAdminServer
public class LshEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LshEurekaApplication.class, args);
    }

}
