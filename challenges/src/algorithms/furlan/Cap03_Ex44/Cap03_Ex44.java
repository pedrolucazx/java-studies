/**
 * Cap03_Ex44 - N-ésimo Termo de Fibonacci
 * <p>
 * Enunciado:
 * Elabore um fluxograma que, a partir de um valor `n` lido (`n >= 0`), calcule o n-ésimo termo
 * da série de Fibonacci. A série de Fibonacci é: 0, 1, 1, 2, 3, 5, 8, 13, ...
 * <p>
 * Análise:
 * Entrada: Um número inteiro n (posição na série)
 * Processamento: Gerar termos de Fibonacci até a posição n
 * Saída: O valor do n-ésimo termo de Fibonacci
 * <p>
 * 💡 Ver detalhes no arquivo flowchart.md
 *
 */
package algorithms.furlan.Cap03_Ex44;

import java.util.Scanner;

public class Cap03_Ex44 {
	public static int fib(int number) {
		if (number <= 1) return number;
		return fib(number - 1) + fib(number - 2);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro n para calcular o n-és imo termo de Fibonacci:");
		int number = scanner.nextInt();
		if (number < 0) {
			System.out.println("Por favor, digite um número inteiro não negativo.");
		} else {
			int result = fib(number);
			System.out.printf("O %d-és imo termo de Fibonacci é: %d%n", number, result);
		}
		
		scanner.close();
	}
}
