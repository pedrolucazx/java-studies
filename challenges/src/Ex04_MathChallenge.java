// Desafio: Expressão Matemática
//
// Resolva a seguinte expressão matemática:
//
//           [6 * (3 + 2)]^2           (1 - 5) * (2 - 7)
//    (   -------------------   -   -------------------   )^3
//         3 * 2                        2
//   -----------------------------------------------
//                      10^3
//
// Instruções:
// 1. Resolva as operações dentro dos parênteses.
// 2. Calcule as potências indicadas.
// 3. Efetue as divisões e subtrações conforme a ordem das operações.
// 4. Por fim, eleve o resultado ao cubo e divida por 10³.
//
// Escreva o resultado final da expressão.
//
// Não resolva aqui, apenas siga as instruções e escreva o resultado final no console.

public class Ex04_MathChallenge {
    public static void main(String[] args) {
        // Cálculo das partes principais
        double mainNumerator = Math.pow(6 * (3 + 2), 2) / (3 * 2);
        double secondaryNumerator = Math.pow(((1 - 5) * (2 - 7)) / 2.0, 2);
        double finalResult = Math.pow(mainNumerator - secondaryNumerator, 3) / Math.pow(10, 3);

        System.out.println("Numerador principal: [6 * (3 + 2)]^2 / (3 * 2) = " + mainNumerator);
        System.out.println("Numerador secundário: ((1 - 5) * (2 - 7) / 2)^2 = " + secondaryNumerator);
        System.out.println("Resultado final: ((NumeradorPrincipal - NumeradorSecundario)^3) / 10^3 = " + finalResult);

        // Cálculo em expressão única
        double singleExpressionResult = Math.pow(
            (Math.pow(6 * (3 + 2), 2) / (3 * 2) - Math.pow(((1 - 5) * (2 - 7)) / 2.0, 2)),
            3
        ) / Math.pow(10, 3);
        System.out.println("Resultado usando expressão única: " + singleExpressionResult);
    }
}
