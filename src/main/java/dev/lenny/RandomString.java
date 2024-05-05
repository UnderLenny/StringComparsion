package dev.lenny;

import java.util.Random;

public class RandomString {
  // Метод для генерации случайной строки
  public static String randomString(int n, boolean lettersOnly, boolean numbersOnly) {
    String characters = "";
    if (!lettersOnly && !numbersOnly)
      characters = "abcdefghijklmnopqrstuvwxyz0123456789";
    else if (lettersOnly)
      characters = "abcdefghijklmnopqrstuvwxyz";
    else if (numbersOnly)
      characters = "0123456789";

    Random rand = new Random();
    StringBuilder sb = new StringBuilder(n);

    for (int i = 0; i < n; i++) {
      sb.append(characters.charAt(rand.nextInt(characters.length())));
    }
    return sb.toString();
  }
}