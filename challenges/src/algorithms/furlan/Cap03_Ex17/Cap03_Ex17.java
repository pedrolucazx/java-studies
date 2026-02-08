/**
 * Cap03_Ex17 - Cálculo de Contribuição INSS
 * <p>
 * Enunciado:
 * A contribuição para o INSS é calculada de forma progressiva com base no salário bruto.
 * Faixas: até 1.659,38 (8%), de 1.659,39 a 2.765,66 (9%), de 2.765,67 a 5.531,31 (11%),
 * acima disso (608,44 fixo).
 * Elabore um algoritmo que, para uma entrada do salário bruto, calcule a contribuição ao INSS
 * e o salário líquido restante.
 * <p>
 * Análise:
 * Entrada: Salário bruto
 * Processamento: Aplicar alíquota progressiva conforme a faixa
 * Saída: Contribuição INSS e Salário líquido
 * <p>
 */
package algorithms.furlan.Cap03_Ex17;

import java.util.Locale;
import java.util.Scanner;

public class Cap03_Ex17 {
	
	private static final char DECIMAL_PATTERN = ',';
	private static final double FAIXA_1_LIMITE = 1659.38;
	private static final double FAIXA_2_LIMITE = 2765.66;
	private static final double FAIXA_3_LIMITE = 5531.31;
	private static final double ALIQUOTA_FAIXA_1 = 0.08;
	private static final double ALIQUOTA_FAIXA_2 = 0.09;
	private static final double ALIQUOTA_FAIXA_3 = 0.11;
	private static final double CONTRIBUICAO_MAXIMA = 608.44;
	
	/**
	 * Converte uma String de salário para double, aceitando tanto vírgula quanto ponto
	 * como separador decimal.
	 *
	 * @param salaryText salário em formato String (ex: "2500,00" ou "2500.00")
	 * @return valor do salário como double
	 */
	private static double convertSalary(String salaryText) {
		return Double.parseDouble(salaryText.replace(DECIMAL_PATTERN, '.'));
	}
	
	/**
	 * Calcula a contribuição ao INSS com base no salário bruto,
	 * aplicando alíquotas progressivas conforme as faixas salariais:
	 * - Até R$ 1.659,38: 8%
	 * - De R$ 1.659,39 até R$ 2.765,66: 9%
	 * - De R$ 2.765,67 até R$ 5.531,31: 11%
	 * - Acima de R$ 5.531,31: R$ 608,44 (fixo)
	 *
	 * @param salary salário bruto do funcionário
	 * @return valor da contribuição ao INSS
	 */
	public static double calculateContribution(double salary) {
		if (salary <= FAIXA_1_LIMITE) {
			return salary * ALIQUOTA_FAIXA_1;
		} else if (salary <= FAIXA_2_LIMITE) {
			return salary * ALIQUOTA_FAIXA_2;
		} else if (salary <= FAIXA_3_LIMITE) {
			return salary * ALIQUOTA_FAIXA_3;
		} else {
			return CONTRIBUICAO_MAXIMA;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o salário bruto: R$ ");
		String salaryInput = scanner.nextLine();
		double salary = convertSalary(salaryInput);
		double contribution = calculateContribution(salary);
		double netSalary = salary - contribution;

		System.out.printf(Locale.US, "Contribuição ao INSS: R$ %.2f%n", contribution);
		System.out.printf(Locale.US, "Salário líquido: R$ %.2f%n", netSalary);
		scanner.close();
	}
}
