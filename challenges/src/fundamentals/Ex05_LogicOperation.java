/**
 * Ex05_LogicOperation
 *
 * Descrição (Javadoc):
 * Exercício para praticar operadores lógicos em Java.
 * O objetivo é modelar uma situação familiar onde dois trabalhos podem ser realizados,
 * e a família decide qual televisão comprar e se vai tomar sorvete.
 *
 * Cenário:
 * - Dois trabalhos podem ser realizados.
 * - Dependendo dos resultados, a família decide qual televisão comprar e se vai tomar sorvete.
 *
 * Regras e contexto:
 * - Se ambos os trabalhos forem confirmados, a família compra uma TV de 50 polegadas e toma sorvete.
 * - Se apenas um dos trabalhos for confirmado, a família compra uma TV de 32 polegadas e toma sorvete.
 * - Se nenhum trabalho for confirmado, a família não compra TV e não toma sorvete.
 * - Use operadores lógicos (E, OU, XOR, NEGAÇÃO) para modelar as decisões.
 * - Exiba os resultados finais no console, informando qual TV foi comprada e se foi tomado sorvete.
 *
 * Entrada esperada:
 * - Valores booleanos representando o resultado dos trabalhos (definidos no código).
 *
 * Saída esperada:
 * - Uma mensagem descrevendo qual TV foi comprada e se a família tomou sorvete.
 *
 * Exemplo (dado hardcoded):
 * Input:
 *  firstJob = false, secondJob = true
 * Output esperado (conceitual):
 *  "O trabalho 2 deu certo, a família tomou sorvete e comprou a TV de 32 polegadas."
 *
 */
package fundamentals;

public class Ex05_LogicOperation {

  public static void main(String[] args) {
    boolean firstJob = false;
    boolean secondJob = true;

    boolean bothJobs = firstJob && secondJob; // AND
    boolean exactlyOne = firstJob ^ secondJob; // XOR
    boolean anyJob = firstJob || secondJob; // OR
    boolean noJob = !anyJob; // NOT

    int tvSize = bothJobs ? 50 : (exactlyOne ? 32 : 0);
    boolean iceCream = anyJob;

    String bothJobsMsg = bothJobs ? "Ambos os trabalhos deram certo" : "";
    String noJobMsg = noJob ? "Nenhum trabalho deu certo" : "";
    String onlyFirstJobMsg = (!bothJobs && !noJob && firstJob)
      ? "O trabalho 1 deu certo"
      : "";
    String onlySecondJobMsg = (!bothJobs && !noJob && secondJob)
      ? "O trabalho 2 deu certo"
      : "";

    String jobsPhrase =
      noJobMsg + bothJobsMsg + onlyFirstJobMsg + onlySecondJobMsg;

    String icePhrase = iceCream
      ? "a família tomou sorvete"
      : "a família não tomou sorvete";
    String tvPhrase = noJob
      ? "e não comprou TV"
      : "e comprou a TV de " + tvSize + " polegadas";

    System.out.println(jobsPhrase + ", " + icePhrase + " " + tvPhrase + ".");
  }
}
