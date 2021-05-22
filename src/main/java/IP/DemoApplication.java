package IP;

import IP.entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import IP.repository.*;
import IP.root.ManagerFactorySingleton;
import IP.service.*;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws Exception {


        ManagerFactorySingleton.setName("heroku_ab221cef7d5f484");


        SpringApplication.run(DemoApplication.class, args);
    }

}
