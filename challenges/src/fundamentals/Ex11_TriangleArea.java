/**
 * Ex11_TriangleArea
 *
 * Descrição (Javadoc):
 * Exercício para praticar operadores aritméticos e métodos em Java.
 * O objetivo é calcular a área de um triângulo a partir da base e altura informadas.
 *
 * Regras e contexto:
 * - Leia o valor da base e da altura de um triângulo do usuário.
 * - Separe a lógica de cálculo em um método público estático chamado `triangleArea(double base, double height)`.
 * - Todo o enunciado e contexto devem estar neste arquivo via Javadoc; não crie arquivos separados.
 *
 * Fórmula:
 *  Área = (base * altura) / 2
 *
 * Entrada esperada:
 * - Dois números reais (double): base e altura.
 *
 * Saída esperada:
 * - Um número real (double) representando a área calculada.
 *
 * Exemplo:
 * Input:
 *  10.0 5.0
 * Output esperado (conceitual):
 *  triangleArea(10.0, 5.0) -> 25.0
 *
 */

package fundamentals;

import java.util.Scanner;

public class Ex11_TriangleArea {

  /**
   *
   * @param base base do triângulo
   * @param height altura do triângulo
   * @return área do triângulo
   */
  public static double triangleArea(double base, double height) {
    double area = (base * height) / 2;
    return area;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor da base do triângulo: ");
    double base = scanner.nextDouble();

    System.out.print("Digite o valor da altura do triângulo: ");
    double height = scanner.nextDouble();

    System.out.println("A área do triângulo é: " + triangleArea(base, height));
    scanner.close();
  }
}
