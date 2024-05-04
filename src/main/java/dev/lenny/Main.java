package dev.lenny;

public class Main {
  public static void main(String[] args) {
    LexicographicComparison comparison = new LexicographicComparison();
    String first = "Hello";
    String second = "Hellow";
    int result = comparison.compareStrings(first, second);
    System.out.println("Результат сравнения: " + result);
  }
}
