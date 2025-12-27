/**
 * Desafio Dia da Semana
 * <p>
 * Implemente uma classe que associa os dias da semana aos seus números correspondentes.
 * <p>
 * Instruções:
 * 1. Crie um método que receba o nome de um dia da semana (por exemplo, "domingo") e retorne o número correspondente:
 * - domingo: 1
 * - segunda-feira: 2
 * - terça-feira: 3
 * - quarta-feira: 4
 * - quinta-feira: 5
 * - sexta-feira: 6
 * - sábado: 7
 * 2. O método deve considerar os acentos corretamente nos nomes dos dias.
 * 3. Utilize a classe Scanner para capturar a entrada do usuário.
 * 4. Exiba o número correspondente ao dia digitado.
 * 5. Caso o usuário digite um nome inválido, informe que o dia não foi reconhecido.
 * <p>
 * Exemplo de uso:
 * Entrada: "domingo"
 * Saída: 1
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
