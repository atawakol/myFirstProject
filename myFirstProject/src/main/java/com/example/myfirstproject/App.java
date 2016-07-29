package com.example.myfirstproject;

import java.util.Comparator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Comparator<String> test = (s1,s2) -> s1.compareTo(s2);
        		
        SpringApplication.run(App.class, args);
    }
}
