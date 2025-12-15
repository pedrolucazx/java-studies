// java
import java.util.Scanner;

/**
 * Ex03_SalaryAverage
 *
 * Descrição:
 * Exercício para praticar entrada de dados via terminal, conversão de String para número
 * e cálculo de média aritmética.
 * O objetivo é calcular a média dos últimos três salários de um funcionário.
 *
 * Regras e contexto:
 * - O usuário deve informar três salários via terminal (usando Scanner).
 * - Os salários serão inseridos como String, permitindo flexibilidade no formato
 *   (o usuário pode digitar com vírgula "1500,50" ou ponto "1500.50").
 * - Você deve converter as Strings para valores numéricos (double) antes de calcular.
 * - Trate a entrada para aceitar tanto vírgula quanto ponto como separador decimal.
 * - Calcule a média aritmética simples: (salario1 + salario2 + salario3) / 3
 *
 * Conceitos aplicados:
 * - Entrada de dados com Scanner (nextLine)
 * - Conversão de String para double (Double.parseDouble)
 * - Manipulação de String (replace para trocar vírgula por ponto)
 * - Operações aritméticas e cálculo de média
 *
 * Entrada esperada:
 * - Três valores em formato String representando salários.
 * - Exemplo de entradas válidas: "2500.00", "2500,00", "3000", "2750.50"
 *
 * Saída esperada:
 * - A média dos três salários (double), formatada com duas casas decimais.
 *
 * Exemplo:
 * Input:
 *  Salário 1: 2500,00
 *  Salário 2: 3000.00
 *  Salário 3: 2750,50
 * Output esperado:
 *  Média salarial: 2750.17
 *
 */
public class Ex03_SalaryAverage {
    private static final int SALARY_COUNT = 3;
    private static final char DECIMAL_PATTERN = ',';

    /**
     * Converte uma String de salário para double.
     * Deve tratar tanto vírgula quanto ponto como separador decimal.
     *
     * @param salaryText salário em formato String (ex: "2500,00" ou "2500.00")
     * @return valor do salário como double
     */
    public static double convertSalary(String salaryText) {
        // TODO: Implementar conversão
        return Double.parseDouble(salaryText.replace(DECIMAL_PATTERN, '.'));
    }

    /**
     * Calcula a média aritmética de três valores.
     *
     * @param value1 primeiro valor
     * @param value2 segundo valor
     * @param value3 terceiro valor
     * @return média aritmética dos três valores
     */
    public static double calculateAverage(double value1, double value2, double value3) {
        // TODO: Implementar cálculo da média
        return (value1 + value2 + value3) / SALARY_COUNT;
    }

    public static void main(String[] args) {
        // TODO: Criar instância do Scanner para ler do teclado (System.in)
        Scanner scanner = new Scanner(System.in);

        // TODO: Solicitar e ler o primeiro salário (como String)
        System.out.print("Informe o primeiro salário: ");
        double firstSalary = convertSalary(scanner.nextLine());

        // TODO: Solicitar e ler o segundo salário (como String)
        System.out.print("Informe o segundo salário: ");
        double secondSalary = convertSalary(scanner.nextLine());

        // TODO: Solicitar e ler o terceiro salário (como String)
        System.out.print("Informe o terceiro salário: ");
        double thirdSalary = convertSalary(scanner.nextLine());

        // TODO: Converter os três salários de String para double
        double average = calculateAverage(firstSalary, secondSalary, thirdSalary);

        // TODO: Exibir o resultado formatado com 2 casas decimais
        System.out.printf("Média salarial: %.2f%n", average);

        // TODO: Fechar o Scanner
        scanner.close();
    }
}
