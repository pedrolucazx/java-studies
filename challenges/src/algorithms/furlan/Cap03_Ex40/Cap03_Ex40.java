/**
 * Cap03_Ex40 - Cálculo de Fatorial
 * <p>
 * Enunciado:
 * Elabore um fluxograma que, dado um valor n inteiro, calculará seu fatorial.
 * Fatorial: n! = n * (n-1) * (n-2) * ... * 1
 * <p>
 * Análise:
 * Entrada: Um número inteiro n
 * Processamento: Multiplicar n por todos os números menores até 1
 * Saída: O valor do fatorial de n
 * <p>
 * 💡 Ver detalhes no arquivo flowchart.md
 *
 */
package algorithms.furlan.Cap03_Ex40;

import java.util.Scanner;

public class Cap03_Ex40 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor de N: ");
		int n = scanner.nextInt();
		int fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		
		System.out.println("O fatorial de " + n + " é: " + fatorial);
		scanner.close();
	}
}
