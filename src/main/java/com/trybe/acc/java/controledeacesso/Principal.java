package com.trybe.acc.java.controledeacesso;

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

    short option = 1;

    while (option != 2) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");

      String pickedOption = scanner.next();
      option = Short.parseShort(pickedOption);

      if (option == 1) {
        System.out.println("Entre com a sua idade:");
        String age = scanner.next();
        int ageNumber = Integer.parseInt(age);
        report.createAgeArray(ageNumber);
      } else if (option == 2) {
        report.createReport();
      } else {
        System.out.println("Entre com uma opção válida");
      }
    }
    scanner.close();
  }
}
