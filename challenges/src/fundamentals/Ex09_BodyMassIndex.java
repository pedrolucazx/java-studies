/**
 * Ex09_BodyMassIndex
 *
 * Descrição (Javadoc):
 * Exercício para praticar o uso de variáveis e operadores aritméticos em Java.
 * O objetivo é calcular o IMC (Índice de Massa Corporal) a partir do peso e altura informados.
 *
 * Regras e contexto:
 * - Leia o peso (em kg) e a altura (em metros) do usuário.
 * - Separe a lógica de cálculo em um método público estático chamado `calculateBMI(double weight, double height)`.
 * - Todo o enunciado e contexto devem estar neste arquivo via Javadoc; não crie arquivos separados.
 *
 * Fórmula:
 *  IMC = peso / (altura * altura)
 *
 * Entrada esperada:
 * - Dois números reais (double): peso (kg) e altura (m).
 *
 * Saída esperada:
 * - Um número real (double) representando o IMC calculado.
 *
 * Exemplo:
 * Input:
 *  70.0 1.75
 * Output esperado (conceitual):
 *  calculateBMI(70.0, 1.75) -> 22.857142857142858
 *
 */

package fundamentals;

import java.util.Scanner;

public class Ex09_BodyMassIndex {

  /**
   *
   * @param weight peso em kg
   * @param height altura em metros
   * @return índice de massa corporal (IMC)
   */
  public static double calculateBMI(double weight, double height) {
    double bmi = weight / (height * height);
    return bmi;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o peso em kg: ");
    double weight = scanner.nextDouble();

    System.out.print("Digite a altura em metros: ");
    double height = scanner.nextDouble();

    double bmi = calculateBMI(weight, height);
    System.out.println(
      "O IMC para peso " + weight + " kg e altura " + height + " m é: " + bmi
    );
    scanner.close();
  }
}
