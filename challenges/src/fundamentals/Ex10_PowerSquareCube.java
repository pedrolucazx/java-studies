/**
 * Ex10_PowerSquareCube
 *
 * Descrição (Javadoc):
 * Exercício para praticar operadores aritméticos e métodos em Java.
 * O objetivo é calcular o valor ao quadrado e ao cubo de um número informado pelo usuário.
 *
 * Regras e contexto:
 * - Leia um valor numérico do usuário.
 * - Separe a lógica em dois métodos públicos estáticos: `square(double value)` e `cube(double value)`.
 * - Todo o enunciado e contexto devem estar neste arquivo via Javadoc; não crie arquivos separados.
 *
 * Entrada esperada:
 * - Um número real (double).
 *
 * Saída esperada:
 * - Dois números reais (double): o valor ao quadrado e ao cubo.
 *
 * Exemplo:
 * Input:
 *  3.0
 * Output esperado (conceitual):
 *  square(3.0) -> 9.0
 *  cube(3.0) -> 27.0
 *
 */

package fundamentals;

import java.util.Scanner;

public class Ex10_PowerSquareCube {

  /**
   *
   * @param value número real
   * @return valor ao quadrado
   */
  public static double square(double value) {
    return Math.pow(value, 2);
  }

  /**
   *
   * @param value número real
   * @return valor ao cubo
   */
  public static double cube(double value) {
    return Math.pow(value, 3);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número: ");
    double number = scanner.nextDouble();

    double squared = square(number);
    double cubed = cube(number);

    System.out.println("O quadrado de " + number + " é: " + squared);
    System.out.println("O cubo de " + number + " é: " + cubed);
    scanner.close();
  }
}
