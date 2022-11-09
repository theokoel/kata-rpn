package fr.efrei;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class CalculatorTest {

  @Test
  void check_int() {
    assertEquals("1", Calculator.calculate("1"));
  }

}
