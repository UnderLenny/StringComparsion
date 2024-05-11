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
   * @param f Флаг, указывающий, что в строке должны содержаться только буквы.
   * @param k Флаг, указывающий, что в строке должны содержаться только цифры.
   * @return Сгенерированная случайная строка.
   */
  public String randomString(int n, boolean f, boolean k) {
    StringBuilder sb = new StringBuilder(n);
    String characters;

    if (!f && !k) {
      throw new IllegalArgumentException("Оба флага не могут быть одновременно ложными.");
    }

    if (f) {
      characters = LETTERS;
    } else if (k) {
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
