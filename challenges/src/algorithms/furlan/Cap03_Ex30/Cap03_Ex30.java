/**
 * Cap03_Ex30 - Soma de Série (40 Termos)
 * <p>
 * Enunciado:
 * Elabore um fluxograma que represente o algoritmo para calcular a soma dos primeiros 40 termos
 * de uma sequência definida com valor de A fornecido via teclado.
 * $$\frac{7 * A}{3}, \frac{7 * A}{6}, \frac{7 * A}{12}, \frac{7 * A}{24}, \frac{7 * A}{48}, … $$
 * <p>
 * Análise:
 * Entrada: Um valor A (primeiro termo ou base da série)
 * Processamento: Calcular e somar os 40 primeiros termos da série
 * Saída: Soma dos 40 termos
 * <p>
 *
 */
package algorithms.furlan.Cap03_Ex30;

import java.util.Scanner;

public class Cap03_Ex30 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		double A = input.nextDouble();
		
		double result = 0.0;
		double den = 3.0;
		
		for (int i = 1; i <= 40; i++) {
			result += (7 * A) / den;
			den *= 2;
		}
		
		System.out.println("Soma dos 40 termos: " + result);
		input.close();
	}
}
