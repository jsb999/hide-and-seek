package org.example;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    FuzzyListGenerator list = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();

    ArrayList<Fuzzy> sortedFuzzies = list.sortedRainbowFuzzies();
    ArrayList<Fuzzy> randomFuzzies = list.randomizedRainbowFuzzies();

    int testOne = finder.linearSearch(sortedFuzzies);
    int testTwo = finder.binarySearch(sortedFuzzies);
    int testThree = finder.linearSearch(randomFuzzies);
    int testFour = finder.binarySearch(randomFuzzies);

    System.out.println("Linear Search (Sorted): " + testOne);
    System.out.println("Binary Search (Sorted): " + testTwo);
    System.out.println("Linear Search (Random): " + testThree);
    System.out.println("Binary Search (Random)(This one should break): " + testFour);
  }
}
