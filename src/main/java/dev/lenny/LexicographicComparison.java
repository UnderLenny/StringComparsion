package dev.lenny;

/**
 * Класс для выполнения лексикографического сравнения строк.
 */
public class LexicographicComparison {

  /**
   * Метод для сравнения двух строк посимвольно в лексикографическом порядке.
   *
   * @param firstString  Первая строка для сравнения.
   * @param secondString Вторая строка для сравнения.
   * @return Результат сравнения:
   *         - отрицательное число, если первая строка меньше второй,
   *         - положительное число, если первая строка больше второй,
   *         - ноль, если строки равны.
   */
  public int compareStrings(String firstString, String secondString) {

    // Определение минимальной длины строки
    int minLength = Math.min(firstString.length(), secondString.length());

    // Посимвольное сравнение строк
    for (int i = 0; i < minLength; i++) {
      if (firstString.charAt(i) != secondString.charAt(i)) {
        return firstString.charAt(i) - secondString.charAt(i);
      }
    }

    /*  Если строки одинаковой длины, но различаются
    в лексикографическом порядке, возвращается разница в длине строк */
    if (firstString.length() != secondString.length()) {
      return firstString.length() - secondString.length();
    }

    // Если строки полностью совпадают
    return 0;
  }
}
