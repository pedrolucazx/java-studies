/**
 * Cap03_Ex25 - Verificação de Número Palíndromo
 * <p>
 * Enunciado:
 * Um número palíndromo é aquele que se lido da esquerda para a direita e da direita para
 * a esquerda possui o mesmo valor (ex: 34543). Elabore um fluxograma que leia um número n,
 * inteiro, e verifique se ele é um palíndromo.
 * <p>
 * Análise:
 * Entrada: Um número inteiro n
 * Processamento: Inverter os dígitos e comparar com o original
 * Saída: Confirmação se é palíndromo ou não
 * <p>
 * 💡 Ver detalhes no arquivo flowchart.md
 *
 */
package algorithms.furlan.Cap03_Ex25;

import java.util.Scanner;

public class Cap03_Ex25 {
  static boolean isPalindrome(int number) {
    if (number < 0) return false;
    
    int reversed = 0;
    int original = number;
    while (number > 0) {
      reversed = reversed * 10 + number % 10;
      number /= 10;
    }
    return reversed == original;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int number = scanner.nextInt();

    boolean isPalindrome = isPalindrome(number);
    if (isPalindrome) {
      System.out.println("O número " + number + " é palíndromo.");
    } else {
      System.out.println("O número " + number + " não é palíndromo.");
    }

    scanner.close();
  }
}
