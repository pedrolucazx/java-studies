/**
 * Cap03_Ex18 - Cálculo de Desconto IRRF
 * <p>
 * Enunciado:
 * O desconto do IRRF (Imposto de Renda Retido na Fonte), também denominado "Mordida do Leão",
 * é calculado sobre o salário líquido após a dedução da contribuição ao INSS, conforme a seguinte tabela:
 * <p>
 * Tabela IRRF:
 * - Até R$ 1.903,98: Isento
 * - De R$ 1.903,99 a R$ 2.826,65: 7,5% - Parcela a deduzir: R$ 142,80
 * - De R$ 2.826,66 a R$ 3.751,05: 15% - Parcela a deduzir: R$ 354,80
 * - De R$ 3.751,06 a R$ 4.664,68: 22,5% - Parcela a deduzir: R$ 636,13
 * - Acima de R$ 4.664,68: 27,5% - Parcela a deduzir: R$ 869,36
 * <p>
 * Fórmulas:
 * - Base de cálculo do IRRF = Salário bruto - Contribuição INSS
 * - Desconto IRRF = (Base de cálculo × Alíquota) - Parcela a deduzir
 * - Salário líquido = Salário bruto - Contribuição INSS - Desconto IRRF
 * <p>
 * Análise:
 * Entrada: Salário bruto
 * Processamento: Calcular INSS (reutilizando Cap03_Ex17), depois IRRF sobre a base de cálculo
 * Saída: Contribuição INSS, Desconto IRRF e Salário líquido final
 * <p>
 * Conceitos aplicados:
 * - Entrada de dados com Scanner (nextLine)
 * - Conversão de String para double (Double.parseDouble)
 * - Manipulação de String (replace para trocar vírgula por ponto)
 * - Estruturas condicionais (if-else)
 * - Cálculo de alíquotas progressivas
 * - Reutilização de código entre classes (importação do Cap03_Ex17)
 * - Modularização e separação de responsabilidades
 */
package algorithms.furlan.Cap03_Ex18;

import algorithms.furlan.Cap03_Ex17.Cap03_Ex17;
import java.util.Scanner;

public class Cap03_Ex18 {
	
	private static final char DECIMAL_PATTERN = ',';
	private static final double IRRF_FAIXA_1_LIMITE = 1903.98;
	private static final double IRRF_FAIXA_2_LIMITE = 2826.65;
	private static final double IRRF_FAIXA_3_LIMITE = 3751.05;
	private static final double IRRF_FAIXA_4_LIMITE = 4664.68;
	private static final double IRRF_ALIQUOTA_FAIXA_2 = 0.075;
	private static final double IRRF_ALIQUOTA_FAIXA_3 = 0.15;
	private static final double IRRF_ALIQUOTA_FAIXA_4 = 0.225;
	private static final double IRRF_ALIQUOTA_FAIXA_5 = 0.275;
	private static final double IRRF_DEDUCAO_FAIXA_2 = 142.80;
	private static final double IRRF_DEDUCAO_FAIXA_3 = 354.80;
	private static final double IRRF_DEDUCAO_FAIXA_4 = 636.13;
	private static final double IRRF_DEDUCAO_FAIXA_5 = 869.36;
	
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
	 * @param baseCalculation base de cálculo (salário bruto - INSS)
	 * @return valor do desconto do IRRF
	 */
	private static double calculateIRRF(double baseCalculation) {
		if (baseCalculation <= IRRF_FAIXA_1_LIMITE) {
			return 0.0;
		} else if (baseCalculation <= IRRF_FAIXA_2_LIMITE) {
			return (baseCalculation * IRRF_ALIQUOTA_FAIXA_2) - IRRF_DEDUCAO_FAIXA_2;
		} else if (baseCalculation <= IRRF_FAIXA_3_LIMITE) {
			return (baseCalculation * IRRF_ALIQUOTA_FAIXA_3) - IRRF_DEDUCAO_FAIXA_3;
		} else if (baseCalculation <= IRRF_FAIXA_4_LIMITE) {
			return (baseCalculation * IRRF_ALIQUOTA_FAIXA_4) - IRRF_DEDUCAO_FAIXA_4;
		} else {
			return (baseCalculation * IRRF_ALIQUOTA_FAIXA_5) - IRRF_DEDUCAO_FAIXA_5;
		}
	}
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o salário bruto: R$ ");
		String salaryInput = scanner.nextLine();
		double grossSalary = convertSalary(salaryInput);
		
		double inssContribution = Cap03_Ex17.calculateContribution(grossSalary);
		double irrfBaseCalculation = grossSalary - inssContribution;
		double irrfDiscount = calculateIRRF(irrfBaseCalculation);
		double netSalary = grossSalary - inssContribution - irrfDiscount;
		
		System.out.println("\n=== DEMONSTRATIVO DE PAGAMENTO ===");
		System.out.printf("Salário bruto:        R$ %10.2f%n", grossSalary);
		System.out.printf("(-) Contribuição INSS: R$ %10.2f%n", inssContribution);
		System.out.printf("(=) Base cálculo IRRF: R$ %10.2f%n", irrfBaseCalculation);
		System.out.printf("(-) Desconto IRRF:     R$ %10.2f%n", irrfDiscount);
		System.out.printf("(=) Salário líquido:   R$ %10.2f%n", netSalary);
		System.out.println("==================================");
		
		scanner.close();
	}
}
