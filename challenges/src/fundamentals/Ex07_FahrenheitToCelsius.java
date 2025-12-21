/**
 * Ex07_FahrenheitToCelsius
 *
 * Descrição (Javadoc):
 * Exercício para praticar o uso de variáveis e constantes em Java.
 * O objetivo é implementar a conversão de temperatura de Fahrenheit para Celsius.
 *
 * Regras e contexto:
 * - Use constantes se considerar apropriado (por exemplo, fatores da fórmula) e variáveis para valores de entrada/saída.
 * - Separe a lógica de conversão em um método público estático chamado `fahrenheitToCelsius(double fahrenheit)`.
 * - Todo o enunciado e contexto devem estar neste arquivo via Javadoc; não crie arquivos separados.
 *
 * Fórmula de conversão:
 *  C = (F - 32) * 5/9
 *
 * Entrada esperada:
 * - Um único número real (double) representando a temperatura em graus Fahrenheit.
 *
 * Saída esperada:
 * - Um número real (double) representando a temperatura convertida em Celsius.
 *
 * Exemplo:
 * Input:
 *  98.6
 * Output esperado (conceitual):
 *  fahrenheitToCelsius(98.6) -> 37.0
 */
package fundamentals;

import java.util.Scanner;

public class Ex07_FahrenheitToCelsius {

  private static final double RATIO = 5.0 / 9.0;
  private static final double OFFSET = 32.0;

  /**
   *
   * @param fahrenheit temperatura em graus Fahrenheit
   * @return temperatura equivalente em graus Celsius
   */
  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = (fahrenheit - OFFSET) * RATIO;
    return celsius;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a temperatura em Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();
    double celsius = fahrenheitToCelsius(fahrenheit);
    System.out.println(fahrenheit + "°F equivalem a " + celsius + "°C");
    scanner.close();
  }
}
