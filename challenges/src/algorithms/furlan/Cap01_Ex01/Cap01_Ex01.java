/**
 * Cap01_Ex01 - Moeda Falsa
 * <p>
 * Enunciado:
 * Descreva como descobrir a moeda falsa em um grupo de cinco moedas,
 * fazendo uso de uma balança analítica (sabe-se que a moeda falsa é mais leve que as outras),
 * com o menor número de pesagens possível.
 * <p>
 * Análise:
 * Entrada: 5 moedas (1 falsa mais leve)
 * Processamento: Dividir em grupos e comparar na balança
 * Saída: Identificação da moeda falsa + número de pesagens
 *
 */

package algorithms.furlan.Cap01_Ex01;

public class Cap01_Ex01 {
	
	public static void main(String[] args) {
		double coin1 = 10;
		double coin2 = 10;
		double coin3 = 10;
		double coin4 = 10;
		double coin5 = 9;
		
		int weighing = 0;
		int fakeCoin = -1;
		
		System.out.println("=== Descobrindo a Moeda Falsa ===\n");
		
		System.out.println("📍 PESAGEM 1");
		System.out.println(
						"Lado Esquerdo: Moeda 1 (" + coin1 + "g) + Moeda 2 (" + coin2 + "g)"
		);
		System.out.println(
						"Lado Direito:  Moeda 3 (" + coin3 + "g) + Moeda 4 (" + coin4 + "g)\n"
		);
		
		double group1 = coin1 + coin2;
		double group2 = coin3 + coin4;
		weighing++;
		
		if (group1 == group2) {
			fakeCoin = 5;
			System.out.println("✓ Resultado: Balança EQUILIBRADA");
			System.out.println("→ Moeda falsa é a moeda #5\n");
		} else if (group1 < group2) {
			System.out.println("✓ Resultado: Lado ESQUERDO mais leve");
			System.out.println("→ Moeda falsa está entre moedas 1 e 2\n");
			System.out.println("📍 PESAGEM 2");
			System.out.println("Lado Esquerdo: Moeda 1 (" + coin1 + "g)");
			System.out.println("Lado Direito:  Moeda 2 (" + coin2 + "g)\n");
			
			weighing++;
			if (coin1 < coin2) {
				fakeCoin = 1;
				System.out.println("✓ Resultado: Moeda 1 mais leve");
			} else {
				fakeCoin = 2;
				System.out.println("✓ Resultado: Moeda 2 mais leve");
			}
			System.out.println("→ Moeda falsa é a moeda #" + fakeCoin + "\n");
		} else {
			System.out.println("✓ Resultado: Lado DIREITO mais leve");
			System.out.println("→ Moeda falsa está entre moedas 3 e 4\n");
			System.out.println("📍 PESAGEM 2");
			System.out.println("Lado Esquerdo: Moeda 3 (" + coin3 + "g)");
			System.out.println("Lado Direito:  Moeda 4 (" + coin4 + "g)\n");
			
			weighing++;
			if (coin3 < coin4) {
				fakeCoin = 3;
				System.out.println("✓ Resultado: Moeda 3 mais leve");
			} else {
				fakeCoin = 4;
				System.out.println("✓ Resultado: Moeda 4 mais leve");
			}
			System.out.println("→ Moeda falsa é a moeda #" + fakeCoin + "\n");
		}
		
		System.out.println("════════════════════════════════");
		System.out.println("🎯 RESULTADO FINAL");
		System.out.println("════════════════════════════════");
		System.out.println("Moeda falsa: #" + fakeCoin);
		System.out.println("Total de pesagens: " + weighing);
		System.out.println("════════════════════════════════");
	}
}
