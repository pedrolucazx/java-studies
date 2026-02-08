/**
 * Cap03_Ex19 - Aprovação de Aluno
 * <p>
 * Enunciado:
 * Elabore um fluxograma e um algoritmo que leia as quatro notas de prova (P1, P2, P3 e P4)
 * e quatro notas de trabalho (T1, T2, T3 e T4) e exiba 'Aprovado' ou 'Não aprovado'.
 * <p>
 * Regras de Cálculo:
 * - Média das Provas (MP) = (P1 + P2 + P3 + P4) / 4
 * - Média dos Trabalhos (MT) = (T1 + T2 + T3 + T4) / 4
 * - Média Final (MF) = 0,8 × MP + 0,2 × MT
 * <p>
 * Critério de Aprovação:
 * - Se MF >= 6.0 → Aprovado ✅
 * - Se MF < 6.0 → Não aprovado ❌
 * <p>
 * Análise:
 * Entrada: 4 notas de prova (P1, P2, P3, P4) e 4 notas de trabalho (T1, T2, T3, T4)
 * Processamento: Calcular MP, MT e MF, comparar com 6.0
 * Saída: Status de aprovação ("Aprovado" ou "Não aprovado")
 * <p>
 * 💡 Ver detalhes no arquivo flowchart.md
 *
 */
package algorithms.furlan.Cap03_Ex19;

import java.util.Scanner;

public class Cap03_Ex19 {
	private static final char DECIMAL_PATTERN = ',';
	private static final int NUMBER_OF_GRADES = 4;
	private static final double TESTS_WEIGHT = 0.8;
	private static final double WORKS_WEIGHT = 0.2;
	private static final double MINIMUM_PASSING_GRADE = 6.0;
	
	/**
	 * Converte uma String de nota para double, aceitando tanto vírgula quanto ponto
	 * como separador decimal.
	 *
	 * @param gradeText nota em formato String (ex: "7,50" ou "7.50")
	 * @return valor da nota como double
	 */
	private static double convertGrade(String gradeText) {
		return Double.parseDouble(gradeText.replace(DECIMAL_PATTERN, '.'));
	}
	
	/**
	 * Calcula a média final ponderada entre provas e trabalhos.
	 *
	 * @param testsAverage média das provas
	 * @param worksAverage média dos trabalhos
	 * @return a média final ponderada
	 */
	private static double calculateFinalAverage(double testsAverage, double worksAverage) {
		return (testsAverage * TESTS_WEIGHT) + (worksAverage * WORKS_WEIGHT);
	}
	
	/**
	 * Determina o status de aprovação baseado na média final.
	 *
	 * @param finalAverage a média final do aluno
	 * @return "Aprovado" se finalAverage >= MINIMUM_PASSING_GRADE, "Não aprovado" caso contrário
	 */
	private static String determineApprovalStatus(double finalAverage) {
		return finalAverage >= MINIMUM_PASSING_GRADE ? "Aprovado ✅" : "Não aprovado ❌";
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double testSum = 0;
		for (int i = 1; i <= NUMBER_OF_GRADES; i++) {
			System.out.print("Digite a nota da prova P" + i + ": ");
			testSum += convertGrade(scanner.nextLine());
		}
		
		double workSum = 0;
		for (int i = 1; i <= NUMBER_OF_GRADES; i++) {
			System.out.print("Digite a nota do trabalho T" + i + ": ");
			workSum += convertGrade(scanner.nextLine());
		}
		
		double testsAverage = testSum / NUMBER_OF_GRADES;
		double worksAverage = workSum / NUMBER_OF_GRADES;
		double finalAverage = calculateFinalAverage(testsAverage, worksAverage);
		
		String status = determineApprovalStatus(finalAverage);
		
		System.out.println("\n=== RESULTADO FINAL ===");
		System.out.printf("Média de Provas:   %.2f%n", testsAverage);
		System.out.printf("Média de Trabalhos: %.2f%n", worksAverage);
		System.out.printf("Média Final:       %.2f%n", finalAverage);
		System.out.println("Status: " + status);
		System.out.println("=======================");
		
		scanner.close();
	}
}
