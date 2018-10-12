package com.stackroute;

//import com.stackroute.domain.Movie;
//import com.stackroute.repository.MovieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
////import org.springframework.context.ApplicationListenerApplicatio;
//import org.springframework.context.event.ContextRefreshedEvent;

@EnableConfigServer
@SpringBootApplication
public class configServiceApplication  {

    public static void main(String[] args)
    {
        SpringApplication.run(configServiceApplication.class, args);
    }

}