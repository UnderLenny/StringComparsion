package dev.lenny;

public class Main {
  public static void main(String[] args) {
    LexicographicComparison comparison = new LexicographicComparison();
    String first = "dasdasd";
    String second = "gfhgfh";
    int comparisonResult = LexicographicComparison.compareStrings(first, second);

//    int result = comparison.compareStrings(first, second);
    System.out.println("Результат сравнения: " + comparisonResult);

  }
}
