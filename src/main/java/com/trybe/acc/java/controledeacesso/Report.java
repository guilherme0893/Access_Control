package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Main CLass.
 */

public class Report {

  /**
   * Método principal.
   */

  ArrayList<Integer> ages = new ArrayList<>();

  int totalUnderAge = 0;
  int totalYoungAdults = 0;
  int totalAdults = 0;

  DecimalFormat decimalFormat = new DecimalFormat("#0.00");

  /**
   * Método FormatNumber.
   */
  public String formatNumber(double age) {
    return decimalFormat.format(age);
  }

  /**
   * Método CreateAgeArray.
   */
  public void createAgeArray(int age) {
    if (age < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
      totalUnderAge += 1;
      ages.add(age);
    } else if (age >= 18 && age <= 49) {
      System.out.println("Pessoa adulta, catraca liberada!");
      totalYoungAdults += 1;
      ages.add(age);
    } else {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
      totalAdults += 1;
      ages.add(age);
    }
  }

  public void createReport() {
    // TBI
  }
}
