/*
* Ex14 - Média das Notas da Turma

Desafio: Crie uma classe chamada 'AverageGrade'. O objetivo é calcular a média das notas de uma turma, onde o número de alunos não é fixo.
Instruções:
1. O programa deve permitir que o usuário insira notas para os alunos. O número de alunos é indefinido.
2. Cada nota deve ser um valor válido entre 0 e 10 (inclusive).
3. Utilize uma variável para armazenar a soma das notas válidas inseridas.
4. Mantenha uma contagem da quantidade de notas válidas inseridas.
5. O usuário pode encerrar a entrada de notas digitando '-1'.
6. Caso o usuário digite uma nota fora do intervalo permitido, ignore e exiba uma mensagem solicitando uma nota válida.
7. Ao finalizar, calcule e exiba a média das notas válidas inseridas.
*/
package fundamentals;

import java.util.Scanner;

public class Ex14_AverageGrade {
	private static final double MIN_GRADE = 0.0;
	private static final double MAX_GRADE = 10.0;
	private static final double EXIT_VALUE = -1.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int validGradesCount = 0;
		double totalGrades = 0.0;
		double grade = 0.0;
		
		do {
			System.out.print("Digite a nota do aluno (ou -1 para encerrar): ");
			
			if (!scanner.hasNextDouble()) {
				System.out.println("Entrada inválida. Por favor, insira um número.");
				scanner.next();
				continue;
			}
			
			grade = scanner.nextDouble();
			
			if (grade != EXIT_VALUE && (grade < MIN_GRADE || grade > MAX_GRADE)) {
				System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10.");
			} else if (grade != EXIT_VALUE) {
				totalGrades += grade;
				validGradesCount++;
			}
			
		} while (grade != EXIT_VALUE);
		
		if (validGradesCount > 0) {
			System.out.printf("A média das notas da turma é: %.2f%n", totalGrades / validGradesCount);
		} else {
			System.out.println("Nenhuma nota válida foi inserida.");
		}
		scanner.close();
	}
}
