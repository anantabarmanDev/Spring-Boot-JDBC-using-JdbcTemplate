package com.ananta.springJDBC;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.ananta.springJDBC.model.Alien;
import com.ananta.springJDBC.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);


        Alien alien1 = context.getBean(Alien.class);
        alien1.setId(101);
        alien1.setName("Superman");
        alien1.setTech("Kryptonian");


        AlienRepo repo = context.getBean(AlienRepo.class);
        repo.save(alien1);

        System.out.println(repo.findAll());
    }

}
