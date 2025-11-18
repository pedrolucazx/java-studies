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
 * Dicas / Objetivo pedagógico:
 * - Explique em comentários como usar variáveis temporárias para a conversão caso ache necessário.
 * - Não altere o nome do método principal de conversão: `celsiusToFahrenheit`.
 *
 * Nota: este arquivo fornece o enunciado e um esqueleto de implementação. O método `celsiusToFahrenheit` está propositadamente
 * sem implementação para que o aluno o implemente como exercício.
 */
public class Ex02_CelsiusToFahrenheit {

    /**
     * Converte Celsius para Fahrenheit.
     *
     * @param celsius temperatura em graus Celsius
     * @return temperatura equivalente em graus Fahrenheit
     * @throws UnsupportedOperationException quando não implementado (esqueleto)
     */
    public static double celsiusToFahrenheit(double celsius) {
        // TODO: implemente a conversão usando a fórmula F = C * 9/5 + 32
        throw new UnsupportedOperationException("Implementar celsiusToFahrenheit(double celsius)");
    }

    public static void main(String[] args) {
        System.out.println("Ex02_CelsiusToFahrenheit: implemente celsiusToFahrenheit(double celsius) conforme o Javadoc.");
        System.out.println("Entrada esperada: um double representando graus Celsius. Exemplo: 0.0");
    }
}
