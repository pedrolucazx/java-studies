/**
 * Ex19_PrimeNumberSwitch
 * <p>
 * Descrição (Javadoc):
 * Refatorar o exercício de verificação de número primo (Ex18) utilizando a estrutura de controle `switch`.
 * Este é um exercício de desafio que visa explorar os limites e a aplicabilidade das estruturas de controle.
 * <p>
 * Regras e contexto:
 * - O programa deve receber um número inteiro como entrada.
 * - A lógica de verificação de número primo deve ser adaptada para funcionar dentro de uma estrutura `switch`.
 * - Isso pode exigir uma abordagem criativa, pois `switch` não é a ferramenta mais natural para este problema.
 * Uma possibilidade é usar o `switch` no número de divisores encontrados.
 * - O resultado da verificação deve ser impresso no console.
 * <p>
 * Entrada esperada:
 * - Um número inteiro.
 * <p>
 * Saída esperada:
 * - Uma mensagem indicando se o número é primo.
 * <p>
 * Exemplo 1:
 * Input:
 * 13
 * Output esperado (conceitual):
 * "O número 13 é primo."
 * <p>
 * Exemplo 2:
 * Input:
 * 12
 * Output esperado (conceitual):
 * "O número 12 não é primo."
 *
 */

package fundamentals;

import java.util.Scanner;

public class Ex19_PrimeNumberSwitch {
	static int countDivisors(int number) {
		int divisorCount = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) divisorCount++;
		}
		return divisorCount;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int inputNumber = scanner.nextInt();
		
		int divisorCount = countDivisors(inputNumber);
		switch (divisorCount) {
			case 2:
				System.out.println("O número " + inputNumber + " é primo.");
				break;
			default:
				System.out.println("O número " + inputNumber + " não é primo.");
		}
	}
}
