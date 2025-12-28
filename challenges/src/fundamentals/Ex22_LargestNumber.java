/**
 * Ex22_LargestNumber
 * <p>
 * Descrição (Javadoc):
 * Crie um programa que recebe 10 valores (inteiros ou double) e ao final
 * imprime o maior número entre eles.
 * <p>
 * Regras e contexto:
 * - O programa deve usar uma estrutura de repetição (ex: `for` ou `while`) para ler 10 valores.
 * - Uma variável deve ser usada para armazenar o maior número encontrado até o momento.
 * - A cada número lido, o programa deve compará-lo com o maior valor atual e atualizá-lo se necessário.
 * - Ao final do loop, o programa deve imprimir o maior valor encontrado.
 * <p>
 * Entrada esperada:
 * - 10 números (inteiros ou double).
 * <p>
 * Saída esperada:
 * - O maior número dentre os 10 inseridos.
 * <p>
 * Exemplo de interação:
 * Input do usuário:
 * 5
 * 1
 * 99
 * 43
 * 25
 * 87
 * 33
 * 12
 * -5
 * 68
 * Output esperado (conceitual):
 * "O maior número inserido foi: 99"
 *
 */
package fundamentals;

import java.util.Scanner;

public class Ex22_LargestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o 1º número: ");
		double largest = scanner.nextDouble();
		
		for (int i = 2; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			double input = scanner.nextDouble();
			if (input > largest) largest = input;
		}
		
		System.out.println("O maior número inserido foi: " + largest);
		scanner.close();
	}
}
