package fr.efrei;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class CalculatorTest {

  @Test
  void check_one() {
    assertEquals(1, Calculator.calculate(1));
  }

  @Test
  void check_two() {
    assertEquals(2, Calculator.calculate(2));
  }

  @Test
  void check_int() {
    assertEquals(42, Calculator.calculate(42));
  }

}
