/**
 * Cap01_Ex05 - Caramujo
 * <p>
 * Enunciado:
 * Um caramujo está na parede de um poço a cinco metros de sua borda. Tentando sair do poço,
 * ele sobe três metros durante o dia, porém desce escorregando dois metros durante a noite.
 * Quantos dias levará para o caramujo conseguir sair do poço?
 * <p>
 * Análise:
 * Entrada: Distância para sair (5m), ascensão diária (3m), descenso noturno (2m)
 * Processamento: Simular dia após dia, acumulando distância até atingir a saída
 * Saída: Número total de dias necessários
 *
 */

package algorithms.furlan.Cap01_Ex05;

public class Cap01_Ex05 {

	public static void main(String[] args) {
		int distanceToEdge = 5;
		int dailyAscent = 3;
		int nightlyDescent = 2;
		int daysNeeded = 0;

		for (int currentHeight = 0; currentHeight < distanceToEdge; daysNeeded++) {
			currentHeight += dailyAscent;
			if (currentHeight < distanceToEdge) {
				currentHeight -= nightlyDescent;
			}
		}
		System.out.println(" Saiu em " + daysNeeded + " dias.");
	}
}
