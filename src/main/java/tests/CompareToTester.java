package tests;

import dev.lenny.LexicographicComparison;
import dev.lenny.RandomString;
import org.junit.jupiter.api.Test;

// Тест для лексикографического сравнения
public class CompareToTester {
  @Test
  public void testCompareTo() {
    LexicographicComparison comparison = new LexicographicComparison();
    for (int i = 0; i < 1000; i++) {
      String str1 = RandomString.randomString(10, true, true);
      String str2 = RandomString.randomString(10, true, true);
      int result = comparison.compareStrings(str1, str2);
      int expected = str1.compareTo(str2);
      if (result == expected) {
        System.out.println("---------test " + (i+1) + " is successful");
      } else {
        System.err.println("---------test " + (i+1) + " is invalid");
      }

//      System.out.println("Test " + (i+1) + ":");
//      System.out.println("  String 1: " + str1);
//      System.out.println("  String 2: " + str2);
//      System.out.println("  Result: " + result);
//      System.out.println("  Expected: " + expected);
    }
  }
}
