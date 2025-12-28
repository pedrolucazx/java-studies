/**
 * Ex18_PrimeNumber
 * <p>
 * Descrição (Javadoc):
 * Criar um programa que receba um número e verifique se ele é um número primo.
 * <p>
 * Regras e contexto:
 * - O programa deve receber um número inteiro como entrada.
 * - Um número primo é um número natural maior que 1 que tem apenas dois divisores distintos: 1 e ele mesmo.
 * - O programa deve usar uma estrutura de repetição (como 'for' ou 'while') para verificar os divisores do número.
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
 * 7
 * Output esperado (conceitual):
 * "O número 7 é primo."
 * <p>
 * Exemplo 2:
 * Input:
 * 10
 * Output esperado (conceitual):
 * "O número 10 não é primo."
 *
 */

package fundamentals;

import java.util.Scanner;

public class Ex18_PrimeNumber {
	static boolean isPrime(int number) {
		if (number <= 1) return false;
		int divisorCount = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) divisorCount++;
		}
		return divisorCount == 2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int number = input.nextInt();
		
		boolean isPrime = isPrime(number);
		if (isPrime) {
			System.out.println("O número " + number + " é primo.");
		} else {
			System.out.println("O número " + number + " não é primo.");
		}
	}
}
