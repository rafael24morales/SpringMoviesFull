package com.blockbuster.gestordepeliculas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class GestordepeliculasApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext cfx = SpringApplication.run(GestordepeliculasApplication.class, args);
        String[] arr = cfx.getBeanDefinitionNames();
        Arrays.sort(arr);
        for(String i : arr){
            System.out.println(i);
        }
    }

}
