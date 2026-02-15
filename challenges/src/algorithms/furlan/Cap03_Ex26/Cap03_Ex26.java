/**
 * Cap03_Ex26 - Verificação de Triângulo Válido
 * <p>
 * Enunciado:
 * Elabore um fluxograma que receba três valores digitados A, B e C, informando se
 * estes podem ser os lados de um triângulo.
 * <p>
 * Análise:
 * Entrada: Três valores numéricos A, B e C
 * Processamento: Verificar a desigualdade triangular (soma de dois lados > terceiro lado)
 * Saída: Confirmação formam-se um triângulo válido
 * <p>
 * 💡 Ver detalhes no arquivo flowchart.md
 *
 */
package algorithms.furlan.Cap03_Ex26;

import java.util.Scanner;

public class Cap03_Ex26 {
	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static void main(String[] args) {
		double sideA = 0, sideB = 0, sideC = 0;
		
		for (int i = 1; i <= 3; i++) {
			double side = readSide(i);
			
			switch (i) {
				case 1:
					sideA = side;
					break;
				case 2:
					sideB = side;
					break;
				case 3:
					sideC = side;
					break;
			}
		}
		
		if (isValidTriangle(sideA, sideB, sideC)) {
			System.out.println("Os valores formam um triângulo válido.");
		} else {
			System.out.println("Os valores não formam um triângulo válido.");
		}
		SCANNER.close();
	}
	
	private static double readSide(int number) {
		while (true) {
			System.out.print("Digite o valor do lado " + number + ": ");
			
			double value;
			if (SCANNER.hasNextDouble() && (value = SCANNER.nextDouble()) > 0) {
				return value;
			}
			SCANNER.nextLine();
			System.out.println("Entrada ou valor inválido. Digite um número positivo.");
		}
	}
	
	private static boolean isValidTriangle(double a, double b, double c) {
		return a + b > c && a + c > b && b + c > a;
	}
}