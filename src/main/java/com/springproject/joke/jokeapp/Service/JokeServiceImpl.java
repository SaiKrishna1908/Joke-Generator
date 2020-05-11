package com.springproject.joke.jokeapp.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements  JokeService{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
