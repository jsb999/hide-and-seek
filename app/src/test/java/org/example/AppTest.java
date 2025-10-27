package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class AppTest {
  @Test
  public void testLinearSearchOnSortedList() {
    FuzzyListGenerator list = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();
    ArrayList<Fuzzy> sortedFuzzies = list.sortedRainbowFuzzies();

    int index = finder.linearSearch(sortedFuzzies);

    assertNotEquals(-1, index);
    assertEquals("gold", sortedFuzzies.get(index).color);
  }
  
  @Test
  public void testLinearSearchOnRandomList() {
    FuzzyListGenerator list = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();
    ArrayList<Fuzzy> sortedFuzzies = list.randomizedRainbowFuzzies();

    int index = finder.linearSearch(sortedFuzzies);

    assertNotEquals(-1, index);
    assertEquals("gold", sortedFuzzies.get(index).color);
  }

  @Test
  public void testBinarySearchOnRandomList() {
    FuzzyListGenerator list = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();
    ArrayList<Fuzzy> random = list.randomizedRainbowFuzzies();

    int index = finder.binarySearch(random);

    assertEquals(-1, index);
  }

  @Test
  public void testBinarySearchOnSortedList() {
    FuzzyListGenerator list = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();
    ArrayList<Fuzzy> random = list.sortedRainbowFuzzies();

    int index = finder.binarySearch(random);

    assertNotEquals(-1, index);
    assertEquals("gold", sortedFuzzies.get(index).color);
  }
}
