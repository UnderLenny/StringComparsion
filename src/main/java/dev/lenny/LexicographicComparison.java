package dev.lenny;

public class LexicographicComparison {
  // Алгоритм лексикографического сравнения
  public int compareStrings(String str1, String str2) {
    int minLen = Math.min(str1.length(), str2.length());
    for (int i = 0; i < minLen; i++) {
      if (str1.charAt(i) != str2.charAt(i)) {
        return str1.charAt(i) - str2.charAt(i);
      }
    }

    if (str1.length() != str2.length()) {
      return str1.length() - str2.length();
    }
    return 0;
  }
}