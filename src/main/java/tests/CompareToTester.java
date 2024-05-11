package tests;

import dev.lenny.LexicographicComparison;
import dev.lenny.RandomString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс для тестирования метода сравнения строк.
 */
public class CompareToTester {

  /**
   * Тест для метода сравнения строк.
   */
  @Test
  public void testCompareTo() {
    RandomString generator = new RandomString();
    LexicographicComparison comparator = new LexicographicComparison();
    boolean allTestsPassed = true;

    for (int i = 1; i <= 1000; i++) {
      // Генерация двух случайных строк
      String str1 = generator.randomString (20, false, true);
      String str2 = generator.randomString (20, true, true);

      // Сравнение с использованием пользовательского метода(актуальный результат)
      int actualResult = comparator.compareStrings(str1, str2);
      // Сравнение с использованием метода compareTo() из класса String(ожидаемый результат)
      int exceptedResult = str1.compareTo(str2);

      if (actualResult != exceptedResult) {
        allTestsPassed = false;
        System.err.println("--------- Test " + i + " is invalid");
        break;
      } else {
        System.out.println("--------- Test " + i + " is successful");
      }

      System.out.println("Test " + i + ":");
      System.out.println("  String 1: " + str1);
      System.out.println("  String 2: " + str2);
      System.out.println("  Result: " + actualResult);
      System.out.println("  Expected: " + exceptedResult);
    }

    assertTrue(allTestsPassed);
  }
}
