/**
 * Ex16_LeapYear
 * <p>
 * Descrição (Javadoc):
 * Criar um programa que informa se o ano atual é um ano bissexto.
 * <p>
 * Regras e contexto:
 * - O programa deve obter o ano atual (pode ser hardcoded ou obtido do sistema).
 * - A verificação de ano bissexto segue a seguinte regra:
 * - Um ano é bissexto se for divisível por 4, exceto anos terminados em 00, que só são bissextos se forem divisíveis por 400.
 * <p>
 * Entrada esperada:
 * - 2000, 2004, 1900, 2021, etc. (ano atual)
 * <p>
 * Saída esperada:
 * - Uma mensagem indicando se o ano é bissexto.
 * <p>
 * Exemplo (para o ano de 2024):
 * Input:
 * (nenhum)
 * Output esperado (conceitual):
 * "O ano 2024 é um ano bissexto."
 * <p>
 * Exemplo (para o ano de 2025):
 * Input:
 * (nenhum)
 * Output esperado (conceitual):
 * "O ano 2025 não é um ano bissexto."
 *
 */

package fundamentals;

import java.util.Scanner;

public class Ex16_LeapYear {
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0) && (year % 400 == 0);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o ano atual: ");
		int year = input.nextInt();
		if (isLeapYear(year)) {
			System.out.println("O ano " + year + " é um ano bissexto.");
		} else {
			System.out.println("O ano " + year + " não é um ano bissexto.");
		}
		input.close();
	}
}
