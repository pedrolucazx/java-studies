/**
 * Ex20_GuessingGame
 * <p>
 * Descrição (Javadoc):
 * Jogo da adivinhação: o programa deve gerar um número aleatório entre 0 e 100
 * e o jogador tem 10 tentativas para adivinhar qual é esse número.
 * <p>
 * Regras e contexto:
 * - Um número aleatório entre 0 e 100 deve ser armazenado numa variável.
 * - O jogador pode inserir um palpite a cada rodada.
 * - O programa deve informar se o palpite é maior ou menor que o número secreto.
 * - O jogador tem no máximo 10 tentativas.
 * - A cada tentativa, o programa deve informar quantas tentativas restam.
 * - Se o jogador acertar, o jogo termina com uma mensagem de vitória.
 * - Se as 10 tentativas acabarem, o jogo termina com uma mensagem de derrota.
 * <p>
 * Entrada esperada:
 * - Números inteiros (palpites do jogador).
 * <p>
 * Saída esperada:
 * - Mensagens de feedback ("maior", "menor"), tentativas restantes, e o resultado final do jogo.
 * <p>
 * Exemplo de interação:
 * (Número secreto é 42)
 * <p>
 * Input do usuário: 50
 * Output do programa: "O número secreto é menor. Você tem 9 tentativas."
 * <p>
 * Input do usuário: 30
 * Output do programa: "O número secreto é maior. Você tem 8 tentativas."
 * <p>
 * Input do usuário: 42
 * Output do programa: "Parabéns, você acertou!"
 *
 */

package fundamentals;

import java.util.Random;
import java.util.Scanner;

public class Ex20_GuessingGame {
	private static final int MAX_ATTEMPTS = 10;
	private static final int MIN_NUMBER = 0;
	private static final int MAX_NUMBER = 100;
	
	public static void main(String[] args) {
		Random randomNumber = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int attempts = 0;
		boolean hasWon = false;
		int secretNumber = randomNumber.nextInt(MAX_NUMBER + 1);
		
		
		System.out.println("Bem-vindo ao Jogo da Adivinhação!");
		System.out.println("Tente adivinhar o número secreto entre " + MIN_NUMBER + " e " + MAX_NUMBER + ".");
		
		while (attempts < MAX_ATTEMPTS) {
			System.out.print("Digite seu palpite: ");
			int playerGuess = scanner.nextInt();
			attempts++;
			int remainingAttempts = MAX_ATTEMPTS - attempts;
			
			if (playerGuess == secretNumber) {
				hasWon = true;
				break;
			}
			
			if (playerGuess < secretNumber) {
				System.out.println("O número secreto é maior. Tentativas restantes: " + remainingAttempts);
			} else {
				System.out.println("O número secreto é menor. Tentativas restantes: " + remainingAttempts);
			}
		}
		
		if (hasWon) {
			System.out.println("Parabéns, você acertou!");
		} else {
			System.out.println("Suas tentativas acabaram. O número secreto era: " + secretNumber);
		}
		scanner.close();
	}
}
