/**
 * Ex06_SimpleCalculator
 *
 * Descrição (Javadoc):
 * Exercício para praticar operadores aritméticos e entrada de dados via Scanner.
 * O objetivo é implementar uma calculadora simples que realiza uma operação entre dois números.
 *
 * Regras e contexto:
 * - Leia dois números do usuário via terminal (usando Scanner).
 * - Peça ao usuário para informar qual operação deseja realizar (+, -, *, /, %).
 * - Realize a operação escolhida entre os dois números.
 * - Exiba o resultado da operação no console.
 * - O programa deve executar apenas uma operação por vez (não é uma calculadora em loop).
 *
 * Entrada esperada:
 * - Dois números reais (double).
 * - Um símbolo de operação: + (adição), - (subtração), * (multiplicação), / (divisão), % (resto).
 *
 * Saída esperada:
 * - O resultado da operação ou uma mensagem de operação inválida.
 *
 * Exemplo de fluxo:
 * Input:
 *  5
 *  3
 *  +
 * Output esperado (conceitual):
 *  "Resultado: 8.0"
 *
 */

package fundamentals;

import java.util.Scanner;

public class Ex06_SimpleCalculator {

  private static String getMsg(
      String operacao,
      double numero1,
      double numero2) {
    double resultado = operacao.equals("+") ? numero1 + numero2 : 0;
    resultado = operacao.equals("-") ? numero1 - numero2 : resultado;
    resultado = operacao.equals("*") ? numero1 * numero2 : resultado;
    resultado = operacao.equals("/") ? numero1 / numero2 : resultado;
    resultado = operacao.equals("%") ? numero1 % numero2 : resultado;

    String msg = (operacao.equals("+") ||
        operacao.equals("-") ||
        operacao.equals("*") ||
        operacao.equals("/") ||
        operacao.equals("%"))
            ? ("Resultado: " + resultado)
            : "Operação inválida!";
    return msg;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    double numero1 = scanner.nextDouble();

    System.out.print("Digite o segundo número: ");
    double numero2 = scanner.nextDouble();

    System.out.print("Digite a operação (+, -, *, /, %): ");
    String operacao = scanner.next();

    String msg = getMsg(operacao, numero1, numero2);

    System.out.println(msg);
    scanner.close();
  }
}
