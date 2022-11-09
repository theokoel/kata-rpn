package fr.efrei;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class CalculatorTest {

  @Test
  void check_one() {
    assertEquals(1, Calculator.calculate("1"));
  }

  @Test
  void check_two() {
    assertEquals(2, Calculator.calculate("2"));
  }

  @Test
  void check_int() {
    assertEquals(42, Calculator.calculate("42"));
  }

  @Test
  void check_one_add_one() {
    assertEquals(2, Calculator.calculate("1 1 +"));
  }

  @Test
  void check_two_add_two() {
    assertEquals(4, Calculator.calculate("2 2 +"));
  }

  @Test
  void check_int_add_int() {
    assertEquals(73, Calculator.calculate("45 28 +"));
  }

  @Test
  void check_one_minor_one() {
    assertEquals(0, Calculator.calculate("1 1 -"));
  }



}
