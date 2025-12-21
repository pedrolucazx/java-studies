/**
 * Ex12_Bhaskara
 *
 * Descrição (Javadoc):
 * Exercício para praticar operadores aritméticos, métodos e uso de Math em Java.
 * O objetivo é resolver uma equação do segundo grau (ax² + bx + c = 0) usando a fórmula de Bhaskara.
 *
 * Regras e contexto:
 * - Resolva a equação do segundo grau: ax² + bx + c = 0
 * - Use como exemplo: a = 1, b = 12, c = -13
 * - Separe a lógica de cálculo em métodos públicos estáticos: `delta(double a, double b, double c)` e `bhaskaraRoots(double a, double b, double c)`.
 * - Todo o enunciado e contexto devem estar neste arquivo via Javadoc; não crie arquivos separados.
 *
 * Fórmulas:
 *  Delta: Δ = b² - 4ac
 *  Raízes: x1 = (-b + sqrt(Δ)) / (2a), x2 = (-b - sqrt(Δ)) / (2a)
 *
 * Entrada esperada:
 * - Três números reais (double): a, b, c.
 *
 * Saída esperada:
 * - O valor de delta e as duas raízes (x1, x2).
 *
 * Exemplo:
 * Input:
 *  1.0 12.0 -13.0
 * Output esperado (conceitual):
 *  delta(1.0, 12.0, -13.0) -> 196.0
 *  bhaskaraRoots(1.0, 12.0, -13.0) -> x1 = 1.0, x2 = -13.0
 *
 */

package fundamentals;

import java.util.Scanner;

public class Ex12_Bhaskara {

  private static double b;

  /**
   *
   * @param a coeficiente a
   * @param b coeficiente b
   * @param c coeficiente c
   * @return valor de delta
   */
  public static double delta(double a, double b, double c) {
    return Math.pow(b, 2) - 4 * a * c;
  }

  /**
   *
   * @param a coeficiente a
   * @param b coeficiente b
   * @param c coeficiente c
   * @param delta valor de delta
   * @return raízes x1 e x2
   */
  public static String bhaskaraRoots(double a, double b, double c, double delta) {
    double sqrtD = delta < 0 ? 0 : Math.sqrt(delta);
    double x1 = (-b + sqrtD) / (2 * a);
    double x2 = (-b - sqrtD) / (2 * a);
    String result = delta < 0
      ? "Não existem raízes reais."
      : String.format("Raízes: x1 = %.4f, x2 = %.2f", x1, x2);
    return result;
  }

  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Digite o valor de a: ");
    double a = scanner.nextDouble();
    System.out.print("Digite o valor de b: ");
    double b = scanner.nextDouble();
    System.out.print("Digite o valor de c: ");
    double c = scanner.nextDouble();

    double d = delta(a, b, c);
    System.out.println("Delta: " + d);
    System.out.println(bhaskaraRoots(a, b, c, d));
    scanner.close();
  }
}
