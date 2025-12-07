/**
 * Ex02_CelsiusToFahrenheit
 *
 * Descrição (Javadoc):
 * Exercício para praticar o uso de variáveis e constantes em Java.
 * O objetivo é implementar a conversão de temperatura de Celsius para Fahrenheit.
 *
 * Regras e contexto:
 * - Use constantes se considerar apropriado (por exemplo, fatores da fórmula) e variáveis para valores de entrada/saída.
 * - Separe a lógica de conversão em um método público estático chamado `celsiusToFahrenheit(double celsius)`.
 * - Todo o enunciado e contexto devem estar neste arquivo via Javadoc; não crie arquivos separados.
 *
 * Fórmula de conversão:
 *  F = C * 9/5 + 32
 *
 * Entrada esperada:
 * - Um único número real (double) representando a temperatura em graus Celsius.
 *
 * Saída esperada:
 * - Um número real (double) representando a temperatura convertida em Fahrenheit.
 *
 * Exemplo:
 * Input:
 *  0.0
 * Output esperado (conceitual):
 *  celsiusToFahrenheit(0.0) -> 32.0
 *
 */
public class Ex02_CelsiusToFahrenheit {
    // Constantes para deixar a fórmula explícita e evitar "números mágicos"
    private static final double RATIO = 9.0 / 5.0;
    private static final double OFFSET = 32.0;

    /**
     * Converte Celsius para Fahrenheit.
     *
     * @param celsius temperatura em graus Celsius
     * @return temperatura equivalente em graus Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * RATIO + OFFSET;
        return fahrenheit;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(0.0));
    }
}
