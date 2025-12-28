/**
 * Ex17_FinalGrade
 * <p>
 * Descrição (Javadoc):
 * Criar um programa que receba duas notas parciais e calcule a média final.
 * Com base na média, o programa deve informar o status do aluno: "Aprovado", "Recuperação" ou "Reprovado".
 * <p>
 * Regras e contexto:
 * - O programa deve receber duas notas (double) como entrada.
 * - A média deve ser calculada como a média aritmética simples das duas notas.
 * - As regras de status são:
 * - Média >= 7.0: "Aprovado"
 * - 4.0 <= Média < 7.0: "Recuperação"
 * - Média < 4.0: "Reprovado"
 * - O status final deve ser impresso no console.
 * <p>
 * Entrada esperada:
 * - Dois números do tipo double, representando as notas parciais.
 * <p>
 * Saída esperada:
 * - Uma string contendo o status do aluno.
 * <p>
 * Exemplo 1:
 * Input:
 * 7.5, 8.5
 * Output esperado (conceitual):
 * "Aprovado"
 * <p>
 * Exemplo 2:
 * Input:
 * 5.0, 6.0
 * Output esperado (conceitual):
 * "Recuperação"
 * <p>
 * Exemplo 3:
 * Input:
 * 2.0, 4.0
 * Output esperado (conceitual):
 * "Reprovado"
 */

package fundamentals;

import java.util.Scanner;

public class Ex17_FinalGrade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double gradeSum = 0.0;
		int gradesCount = 2;
		
		for (int i = 1; i <= gradesCount; i++) {
			System.out.print("Digite a " + i + "º nota: ");
			double grade;
			grade = input.nextDouble();
			gradeSum += grade;
		}
		
		double average = gradeSum / gradesCount;
		if (average >= 7.0) {
			System.out.println("Aprovado");
		} else if (average >= 4.0) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		input.close();
	}
}
