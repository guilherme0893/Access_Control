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

    byte option = 1;

    while (option != 2) {
      System.out.println("Entre com o número correspondente à idade desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");
      String pickedOption = scanner.next();
      short numberPickerOption = Short.parseShort(pickedOption);
    }
  }
}
