package main;

import Algorithm.Reader;

/**
 * Created by nztyler on 30/03/17.
 */
public class Main {

    public static final String GOLF = "gold.dat";
    public static final String GTEST = "golf-test.dat";
    public static final String GTRAINING = "golf-training.dat";

    public static void main(String[] args) {
        Reader reader = new Reader(GTEST);
    }

}
