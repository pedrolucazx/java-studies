/*
 * Desafio: Calculadora Simples
 *
 * Instruções:
 *
 * 1. Leia dois números do usuário (pode ser pelo terminal ou usando JOptionPane).
 * 2. Peça ao usuário para informar qual operação deseja realizar:
 *    - O usuário deve digitar um dos símbolos: + (adição), - (subtração), * (multiplicação), / (divisão)
 * 3. Realize a operação escolhida entre os dois números.
 * 4. Exiba o resultado da operação.
 *
 * Regras:
 * - Utilize apenas os conceitos ensinados neste capítulo.
 * - Não utilize estruturas avançadas ou recursos não abordados até aqui.
 * - O programa deve executar apenas uma operação por vez (não é uma calculadora em loop).
 *
 * Exemplo de fluxo:
 *   Usuário digita: 5
 *   Usuário digita: 3
 *   Usuário digita: +
 *   Saída: 8
 *
 */

package fundamentals;
import java.util.Scanner;

public class Ex06_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /, %): ");
        String operacao = scanner.next(); 

        double resultado = operacao.equals("+") ? numero1 + numero2 : 0;
        resultado = operacao.equals("-") ? numero1 - numero2 : resultado;
        resultado = operacao.equals("*") ? numero1 * numero2 : resultado;
        resultado = operacao.equals("/") ? numero1 / numero2 : resultado;
        resultado = operacao.equals("%") ? numero1 % numero2 : resultado;


        String msg = (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/") || operacao.equals("%"))
            ? ("Resultado: " + resultado)
            : "Operação inválida!";

        System.out.println(msg);
        scanner.close();
    }
}
