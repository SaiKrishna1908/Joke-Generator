package com.springproject.joke.jokeapp.config;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfig {


    @Bean
    ChuckNorrisQuotes getChuckConfig(){
        return new ChuckNorrisQuotes();
    }
}
