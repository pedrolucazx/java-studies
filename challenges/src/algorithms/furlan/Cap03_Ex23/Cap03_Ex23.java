/**
 * Cap03_Ex23 - Número Triangular
 * <p>
 * Enunciado:
 * Um número inteiro é considerado **triangular** se este for o produto de três números inteiros consecutivos, como,
 * por exemplo, 120 = 4 × 5 × 6. Elabore um fluxograma e um algoritmo que, após ler um número n inteiro, verifiquem
 * se ele é ou não triangular.
 * <p>
 * Análise:
 * Entrada: Um número inteiro n
 * Processamento: Testar se n é produto de 3 números consecutivos iterando k de 1 até encontrar
 * Saída: Confirmação se é triangular ou não
 *
 */
package algorithms.furlan.Cap03_Ex23;

import java.util.Scanner;

public class Cap03_Ex23 {
	
	private static boolean isTriangularNumber(int number) {
		if (number <= 0) return false;
		
		int i = 0;
		int value = 0;
		
		while (value < number) {
			value = i * (i + 1) * (i + 2);
			if (value == number) return true;
			i++;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int number = scanner.nextInt();
    
    if (isTriangularNumber(number)) {
			System.out.println(number + " é um número triangular ✅");
		} else {
			System.out.println(number + " não é um número triangular ❌");
		}
		
		scanner.close();
	}
}
