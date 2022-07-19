package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main CLass.
 */

public class Principal {

  /**
   * Método principal.
   */

  public static void main(String[] args) {
    // ESCREVA SEU CÓDIGO AQUI
    Scanner scanner = new Scanner(System.in);
    Report report = new Report();

    byte option = 1;

    while (option != 2) {
      System.out.println("Entre com o número correspondente à idade desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");
      String pickedOption = scanner.next();
      short numberPickedOption = Short.parseShort(pickedOption);

      if (numberPickedOption == 1) {
        System.out.println("Entre com a sua idade:");
        int age = Integer.parseInt(scanner.next());
        report.CreateAgeArray(age);
      } else if (numberPickedOption == 2) {
        report.CreateReport();
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    }
    scanner.close();
  }
}
