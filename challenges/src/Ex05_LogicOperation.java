import java.util.Scanner;

/**
 * Desafio Lógicos - Operadores Lógicos em Java
 *
 * Nesta atividade, você irá praticar operadores lógicos utilizando um cenário familiar:
 *
 * Cenário:
 * - Dois trabalhos podem ser realizados.
 * - Dependendo dos resultados, a família decide qual televisão comprar e se vai tomar sorvete.
 *
 * Regras:
 * 1. Se ambos os trabalhos forem confirmados, a família compra uma TV de 50 polegadas e toma sorvete.
 * 2. Se apenas um dos trabalhos for confirmado, a família compra uma TV de 32 polegadas e toma sorvete.
 * 3. Se nenhum trabalho for confirmado, a família não compra TV e não toma sorvete.
 *
 * Instruções:
 * - Crie uma classe chamada LogicOperation.
 * - Crie variáveis booleanas para representar o resultado dos trabalhos.
 * - Use operadores lógicos (E, OU, NEGAÇÃO) para modelar as decisões.
 * - Crie variáveis para indicar qual TV será comprada e se a família vai tomar sorvete.
 * - Exiba os resultados finais no console, informando qual TV foi comprada e se foi tomado sorvete.
 *
 */

public class Ex05_LogicOperation {
    public static void main(String[] args) {
        boolean firstJob = false;
        boolean secondJob = false;

        boolean bothJobs = firstJob && secondJob;   // AND
        boolean exactlyOne = firstJob ^ secondJob; // XOR
        boolean anyJob = firstJob || secondJob;    // OR
        boolean noJob = !anyJob;                   // NOT

        int tvSize = bothJobs ? 50 : exactlyOne ? 32 : 0;
        boolean iceCream = anyJob;

        String jobsPhrase;
        if (noJob) {
            jobsPhrase = "Nenhum trabalho deu certo";
        } else if (bothJobs) {
            jobsPhrase = "Ambos os trabalhos deram certo";
        } else if (firstJob) {
            jobsPhrase = "O trabalho 1 deu certo";
        } else {
            jobsPhrase = "O trabalho 2 deu certo";
        }

        String icePhrase = iceCream ? "a família tomou sorvete" : "a família não tomou sorvete";
        String tvPhrase = noJob ? "e não comprou TV" : "e comprou a TV de " + tvSize + " polegadas";

        System.out.println(jobsPhrase + ", " + icePhrase + " " + tvPhrase + ".");
    }
}
