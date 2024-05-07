package dev.lenny;

import java.util.Random;

public class RandomString {
  // Метод для генерации случайной строки
  private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  private static final String NUMBERS = "0123456789";
  private static final Random random = new Random();

  public String generateRandomString(int n, boolean f, boolean k) {
    StringBuilder sb = new StringBuilder(n);
    String characters = "";

    if (f && !k) {
      characters = LETTERS;
    } else if (!f && k) {
      characters = NUMBERS;
    } else {
      characters = LETTERS + NUMBERS;
    }

    for (int i = 0; i < n; i++) {
      sb.append(characters.charAt(random.nextInt(characters.length())));
    }

    return sb.toString();
  }
}