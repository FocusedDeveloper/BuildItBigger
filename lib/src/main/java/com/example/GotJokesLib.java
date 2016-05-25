package com.example;

import java.util.Random;

public class GotJokesLib {

    public GotJokesLib(){
        rand = new Random();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //GotJokes joke = new GotJokes();

        //System.out.println(joke.tellJoke());
    }

    /**
     * Returns a random joke
     * @return
     **/
    public String tellJoke(){
        int pick;
        String joke;
        pick = this.rand.nextInt(4)+1;
        switch (pick) {
            case 1: joke = "Yo Mamma!";
                break;
            case 2: joke = "Your Grandpa smells like old feet!";
                break;
            case 3: joke = "You throw like a girl!";
                break;
            case 4: joke = "Your head is HUGE!";
                break;
            default: joke = "I got nothing.";
                break;
        }
        return joke;
    }


    private Random rand;
}
