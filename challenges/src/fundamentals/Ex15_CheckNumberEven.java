/**
 * Ex15_CheckNumberEven
 * <p>
 * Descrição (Javadoc):
 * Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par.
 * <p>
 * Regras e contexto:
 * - O programa deve receber um número inteiro como entrada.
 * - Deve ser utilizada uma estrutura condicional para verificar se o número está no intervalo de 0 a 10.
 * - Deve ser verificado se o número é par utilizando o operador módulo (%).
 * - O resultado da verificação deve ser impresso no console.
 * <p>
 * Entrada esperada:
 * - Um número inteiro.
 * <p>
 * Saída esperada:
 * - Uma mensagem indicando se o número atende aos critérios. Por exemplo:
 * "O número 8 atende aos critérios." ou "O número 7 não atende aos critérios."
 * <p>
 * Exemplo:
 * Input:
 * 8
 * Output esperado (conceitual):
 * "O número 8 atende aos critérios."
 * <p>
 * Input:
 * 7
 * Output esperado (conceitual):
 * "O número 7 não atende aos critérios."
 *
 */
package fundamentals;

import java.util.Scanner;

public class Ex15_CheckNumberEven {
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int number = input.nextInt();
		
		if (number >= 0 && number <= 10 && isEven(number)) {
			System.out.println("O número " + number + " atende aos critérios.");
		} else {
			System.out.println("O número " + number + " não atende aos critérios.");
		}
		input.close();
	}
}
