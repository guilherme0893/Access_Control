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

  DecimalFormat decimalFormat = new DecimalFormat("#0.00"); // https://receitasdecodigo.com.br/java/numberformat-ou-decimalformat-formatar-numeros-reais-em-java

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

  /**
   * createReport.
   */
  public void createReport() {
    double underAgePercent = 0;
    double youngAdultPercent = 0;
    double adultPercent = 0;

    // check if there is elements in array --- sizes equivale ao length do JS
    if (ages.size() != 0) {
      underAgePercent = (totalUnderAge * 100) / (double) ages.size();
      youngAdultPercent = (totalYoungAdults * 100) / (double) ages.size();
      adultPercent = (totalAdults * 100) / (double) ages.size();
    }
    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + totalUnderAge);
    System.out.println("adultas: " + totalYoungAdults);
    System.out.println("a partir de 50: " + totalAdults);

    System.out.println("----- Percentual -----");
    System.out.println("menores: " + formatNumber(underAgePercent) + "%");
    System.out.println("adultas: " + formatNumber(youngAdultPercent) + "%");
    System.out.println("a partir de 50: " + formatNumber(adultPercent) + "%");

    // System.out.println("TOTAL: " + totalAdults + totalYoungAdults + totalUnderAge);

  }
}
