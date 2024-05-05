package dev.lenny;

public class LexicographicComparison {
  // Алгоритм лексикографического сравнения
  public int compareStrings(String firstString, String secondString) {
    int lengthComparison = Integer.compare(firstString.length(), secondString.length());
    if (lengthComparison != 0) {
      return lengthComparison;
    }

    int minLength = Math.min(firstString.length(), secondString.length());

    for (int i = 0; i < minLength; i++) {
      char charFirst = firstString.charAt(i);
      char charSecond = secondString.charAt(i);

      if (charFirst != charSecond) {
        return charFirst - charSecond;
      }
    }

    return 0;
  }
}
