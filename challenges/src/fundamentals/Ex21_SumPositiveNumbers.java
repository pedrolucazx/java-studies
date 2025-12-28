/**
 * Ex21_SumPositiveNumbers
 * <p>
 * Descrição (Javadoc):
 * Criar um programa que continue recebendo números e somando-os enquanto forem positivos.
 * O programa deve parar quando um número negativo for inserido.
 * <p>
 * Regras e contexto:
 * - O programa deve usar a estrutura `do-while`.
 * - A cada número positivo inserido, o programa deve adicionar o valor a uma variável de soma.
 * - Após cada inserção, a soma atual deve ser impressa no console.
 * - O loop deve ser interrompido quando o usuário digitar um número negativo.
 * <p>
 * Entrada esperada:
 * - Uma sequência de números (inteiros ou double).
 * <p>
 * Saída esperada:
 * - A soma acumulada após cada número positivo inserido.
 * - O programa encerra ao receber um número negativo.
 * <p>
 * Exemplo de interação:
 * Input do usuário: 10
 * Output do programa: "Soma atual: 10"
 * <p>
 * Input do usuário: 20
 * Output do programa: "Soma atual: 30"
 * <p>
 * Input do usuário: 5
 * Output do programa: "Soma atual: 35"
 * <p>
 * Input do usuário: -2
 * (Programa encerra)
 *
 */
package fundamentals;

import java.util.Scanner;

public class Ex21_SumPositiveNumbers {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double number;
		double sum = 0;
		
		do {
			System.out.print("Digite um número (negativo para sair): ");
			number = scanner.nextDouble();
			
			if (number > 0) {
				sum += number;
				System.out.println("Soma atual: " + sum);
			}
			
		} while (number > 0);
		
		System.out.println("Programa encerrado.");
		scanner.close();
	}
}
