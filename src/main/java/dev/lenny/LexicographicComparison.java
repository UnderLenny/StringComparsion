package dev.lenny;

public class LexicographicComparison {
  public static int compareStrings(String firstString, String secondString) {
    int lengthComparison = Integer.compare(firstString.length(), secondString.length());
    if (lengthComparison != 0) {
      return lengthComparison;
    }

    // Алгоритм лексикографического сравнения
    for (int i = 0; i < firstString.length(); i++) {
      char charFirst = firstString.charAt(i);
      char charSecond = secondString.charAt(i);

      if (charFirst != charSecond) {
        return charFirst - charSecond;

      }
    }

    return 0;
  }
}

//    int result = firstString.compareTo(secondString);
//    return result;