/**
 * Ex01_AreaCircle
 *
 * Descrição (Javadoc):
 * Exercício para praticar o uso de variáveis e constantes em Java.
 * O objetivo é calcular a área de uma circunferência a partir do raio informado.
 *
 * Regras e contexto:
 * - Use uma constante para PI (por exemplo: private static final double PI = Math.PI;).
 * - Use uma variável para armazenar o raio recebido como entrada.
 * - Separe a lógica de cálculo em um método público estático chamado `computeArea(double radius)`.
 *
 * Entrada esperada:
 * - Um único número real (double) representando o raio da circunferência.
 *
 * Saída esperada:
 * - O resultado esperado é a área (double). A apresentação (quantas casas decimais) fica a critério do exercício do aluno.
 *
 * Exemplo:
 * Input:
 *  2.0
 * Output esperado (conceitual):
 *  computeArea(2.0) -> 12.566370614359172  // (PI * 2.0 * 2.0)
 *
 */
package fundamentals;

public class Ex01_AreaCircle {

    // constante PI — exemplo de uso de constantes em Java
    static final double PI = Math.PI;

    /**
     * Calcula a área da circunferência a partir do raio.
     *
     * @param radius raio da circunferência (double)
     * @return área calculada (double)
     */
    public static double computeArea(double radius) {
        // TODO: implemente usando a fórmula A = PI * r * r
        return PI * radius * radius;
    }


    public static void main(String[] args) {
        double area = computeArea(2.0);
        System.out.println(area);
    }
}
