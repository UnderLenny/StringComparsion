package dev.lenny;

public class LexicographicComparison {
  public static int compareStrings(String firstString, String secondString) {
    int minLength = Math.min(firstString.length(), secondString.length());

    // Алгоритм лексикографического сравнения
    for (int i = 0; i < minLength; i++) {
      if (firstString.charAt(i) != secondString.charAt(i)) {
        return firstString.charAt(i) - secondString.charAt(i);
      }
    }
    if(firstString.length() > secondString.length()) {
      return 1;
    }
    else if(firstString.length() < secondString.length()) {
      return -1;
    }
      return 0;
    }
}
