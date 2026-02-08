/**
 * Ex13_DaysOfWeek
 * <p>
 * Descrição (Javadoc):
 * Exercício para praticar estruturas condicionais (if-else) em Java.
 * O objetivo é implementar um programa que associa os dias da semana aos seus números correspondentes.
 * <p>
 * Regras e contexto:
 * - Crie um método que receba o nome de um dia da semana e retorne o número correspondente.
 * - domingo = 1, segunda = 2, terça = 3, quarta = 4, quinta = 5, sexta = 6, sábado = 7.
 * - O método deve considerar case-insensitivity (maiúscula/minúscula).
 * - Utilize a classe Scanner para capturar a entrada do usuário.
 * - Se o dia for reconhecido, exiba "O número correspondente ao dia [dia] é: [número]".
 * - Se o dia não for reconhecido, exiba "Dia não reconhecido.".
 * <p>
 * Entrada esperada:
 * - Uma string representando o nome de um dia da semana.
 * <p>
 * Saída esperada:
 * - Um número entre 1 e 7, ou mensagem de erro.
 * <p>
 * Exemplo:
 * Input:
 *  "domingo"
 * Output esperado (conceitual):
 *  "O número correspondente ao dia domingo é: 1"
 */
package fundamentals;

import java.util.Scanner;

public class Ex13_DaysOfWeek {
	private static int obterNumeroDoDia(String dia) {
		if (dia.equalsIgnoreCase("Domingo")) {
			return 1;
		} else if (dia.equalsIgnoreCase("Segunda")) {
			return 2;
		} else if (dia.equalsIgnoreCase("Terça")) {
			return 3;
		} else if (dia.equalsIgnoreCase("Quarta")) {
			return 4;
		} else if (dia.equalsIgnoreCase("Quinta")) {
			return 5;
		} else if (dia.equalsIgnoreCase("Sexta")) {
			return 6;
		} else if (dia.equalsIgnoreCase("Sábado")) {
			return 7;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome de um dia da semana: ");
		String dia = scanner.next();

		int numeroDoDia = obterNumeroDoDia(dia);
		if (numeroDoDia > 0 && numeroDoDia <= 7) {
			System.out.println("O número correspondente ao dia " + dia + " é: " + numeroDoDia);
		} else {
			System.out.println("Dia não reconhecido.");
		}

		scanner.close();
	}
}
