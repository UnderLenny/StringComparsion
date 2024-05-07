package tests;

import dev.lenny.LexicographicComparison;
import dev.lenny.RandomString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Тест для лексикографического сравнения
public class CompareToTester {
  @Test
  public void testCompareTo() {
    RandomString generator = new RandomString();
    LexicographicComparison comparator = new LexicographicComparison();
    boolean allTestsPassed = true;

    for (int i = 1; i <= 1000; i++) {
      String str1 = generator.generateRandomString(10, true, false);
      String str2 = generator.generateRandomString(10, true, false);

      int expected = comparator.compareStrings(str1, str2);
      int result = str1.compareTo(str2);
      System.out.println("Test " + (i+1) + ":");
      System.out.println("  String 1: " + str1);
      System.out.println("  String 2: " + str2);
      System.out.println("  Result: " + result);
      System.out.println("  Expected: " + expected);
      if (expected != result) {
        allTestsPassed = false;

        System.err.println("---------test " + i + " is invalid");
        break;
      } else {
        System.out.println("---------test " + i + " is successful");
      }
    }

    assertTrue(allTestsPassed);
  }
}


