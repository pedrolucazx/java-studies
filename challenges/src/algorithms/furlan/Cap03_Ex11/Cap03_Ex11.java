/**
 * Cap03_Ex11 - Maior de N Valores
 * <p>
 * Enunciado:
 * Elabore um fluxograma que permita a entrada de n (lido pelo teclado) valores reais
 * e apresente como resultado o maior entre esses valores.
 * <p>
 * Análise:
 * Entrada: Número de valores (n) e n valores reais
 * Processamento: Comparar cada valor com o maior armazenado
 * Saída: O maior valor encontrado
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
			if (input > largest)
				largest = input;
		}
		
		System.out.println("O maior número inserido foi: " + largest);
		scanner.close();
	}
}
