/*
 * Cap03_Ex11
 * <p>
 TODO: Enunciado:
 TODO: Elabore um fluxograma que permita a entrada de n (lido pelo teclado) valores reais e 
 TODO: apresente como resultado o maior entre esses valores.
 * <p>
 * Análise do Problema:
 * <p>
 * Entrada:
 * - Número de valores que serão lidos (int n).
 * - n valores reais (double).
 * <p>
 * Processamento:
 * - Ler a quantidade n de números.
 * - Inicializar uma variável para armazenar o maior valor.
 * - Iterar n vezes, lendo cada número e comparando com o maior valor atual.
 * - Atualizar o maior valor sempre que encontrar um número maior.
 * <p>
 * Saída:
 * - Exibir o maior número encontrado.
 * <p>
 * Exemplo:
 * Input:
 * 5
 * 1
 * 99
 * 43
 * 25
 * 87
 * Output esperado:
 * "O maior número inserido foi: 99.0"
 *
 */

package algorithms.furlan.Cap03_Ex11;

import java.util.Scanner;

public class Cap03_Ex11 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos números serão inseridos? ");
		int n = scanner.nextInt();
		double largest = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite o " + i + "º número: ");
			double input = scanner.nextDouble();
			if (input > largest) largest = input;
		}
		
		System.out.println("O maior número inserido foi: " + largest);
		scanner.close();
	}
}
