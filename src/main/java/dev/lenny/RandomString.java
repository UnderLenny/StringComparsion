package dev.lenny;

import java.util.Random;

/**
 * Класс для генерации случайных строк.
 */
public class RandomString {
  private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  private static final String NUMBERS = "0123456789";
  private static final Random random = new Random();

  /**
   * Генерирует случайную строку заданной длины с использованием указанных опций.
   *
   * @param n Длина генерируемой строки.
   * @param includeLetters Включить ли буквы в генерируемую строку?
   * @param includeNumbers Включить ли цифры в генерируемую строку?
   * @return Сгенерированная случайная строка.
   */
  public String generateRandomString(int n, boolean includeLetters, boolean includeNumbers) {
    StringBuilder sb = new StringBuilder(n);
    String characters;

    if (!includeLetters && !includeNumbers) {
      throw new IllegalArgumentException("includeLetters и includeNumbers не могут быть одновременно ложными.");
    }

    if (includeLetters && !includeNumbers) {
      characters = LETTERS;
    } else if (!includeLetters && includeNumbers) {
      characters = NUMBERS;
    } else {
      characters = LETTERS + NUMBERS;
    }

    // Генерация случайной строки
    for (int i = 0; i < n; i++) {
      sb.append(characters.charAt(random.nextInt(characters.length())));
    }

    return sb.toString();
  }
}
