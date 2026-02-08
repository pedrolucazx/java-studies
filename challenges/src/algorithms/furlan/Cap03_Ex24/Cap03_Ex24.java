/**
 * Cap03_Ex24 - Verificação de Número Primo
 * <p>
 * Enunciado:
 * Elabore um fluxograma que leia um valor n inteiro e verifique se este é ou não primo.
 * Um número primo é divisível apenas por um e por ele mesmo.
 * <p>
 * Análise:
 * Entrada: Um número inteiro n
 * Processamento: Verificar divisibilidade de n por números de 2 até sqrt(n)
 * Saída: Confirmação se é primo ou não
 *
 */
package algorithms.furlan.Cap03_Ex24;

import java.util.Scanner;

public class Cap03_Ex24 {
  static boolean isPrime(int number){
    int divisorCount = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) divisorCount++;
    }
    return divisorCount == 2;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int number = scanner.nextInt();
    
    boolean isPrime = isPrime(number);
    if (isPrime) {
      System.out.println("O número " + number + " é primo.");
    } else {
      System.out.println("O número " + number + " não é primo.");
    }
    
    scanner.close();
  }
}
