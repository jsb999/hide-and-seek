package org.example;

import java.util.ArrayList;

public class FuzzyFinder {
  //linear search
  public int linearSearch(ArrayList<Fuzzy> tempList) {
      for (int i = 0; i < tempList.size(); i++) {
          if (tempList.get(i).color.equals("gold")) {
              return i; // return the index of the gold fuzzy
          }
      }
      return -1; //the gold fuzzy was not found so return -1 OR out of bounds of an array to indecate not in the array
  }


  //binary search
  public int binarySearch(ArrayList<Fuzzy> tempList) {
      int lowBound = 0;
      int highBound = tempList.size() - 1;

      while (lowBound <= highBound) {
          int middleInt = (lowBound + highBound) / 2;
          Fuzzy tempFuzzy = tempList.get(middleInt);
          int tempTestCompareTo = tempFuzzy.color.compareTo("gold"); // checking if the middle fuzzy is gold with compareTo

          if (tempTestCompareTo == 0) {
              return middleInt; //return the index of the gold fuzzy which is now the middleInt
          } else if (tempTestCompareTo < 0) {
              // tempFuzzy.color comes before "gold" alphabetically, using the aplhabet as numbers in this case
                lowBound = middleInt + 1;
          } else {
              //tempFuzzy.color comes before "gold" alphabetically, using the aplhabet as numbers in this case
                highBound = middleInt - 1;
          }
      }
      return -1; // Not found so return -1 OR out of bounds of an array to indecate not in the array
  }
}
