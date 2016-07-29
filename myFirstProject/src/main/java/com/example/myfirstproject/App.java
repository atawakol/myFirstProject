package com.example.myfirstproject;

import java.util.Comparator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.myfirstproject.domain.GreetingRepository;
import com.example.myfirstproject.domain.Greeting;;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
	
	private static final Logger log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Comparator<String> test = (s1,s2) -> s1.compareTo(s2);
        		
        SpringApplication.run(App.class, args);
    }
    
    @Bean
	public CommandLineRunner demo(GreetingRepository repository) {
		return (args) -> {
			// save a couple of  Greetings
			repository.save(new Greeting("Jack", "Bauer"));
			repository.save(new  Greeting("Chloe", "O'Brian"));
			repository.save(new  Greeting("Kim", "Bauer"));
			repository.save(new  Greeting("David", "Palmer"));
			repository.save(new  Greeting("Michelle", "Dessler"));

			// fetch all  Greetings
			log.info(" Greetings found with findAll():");
			log.info("-------------------------------");
			for ( Greeting  Greeting : repository.findAll()) {
				log.info( Greeting.toString());
			}
            log.info("");

			// fetch an individual  Greeting by ID
			 Greeting  Greeting = repository.findOne(1L);
			log.info(" Greeting found with findOne(1L):");
			log.info("--------------------------------");
			log.info( Greeting.toString());
            log.info("");

			// fetch  Greetings by last name
			log.info(" Greeting found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
//			for ( Greeting bauer : repository.findByLastName("Bauer")) {
//				log.info(bauer.toString());
//			}
            log.info("");
		};
	}
    
}
