package algorithms.furlan.Cap01_Ex07;

public class Cap01_Ex07 {
	
	public static void main(String[] args) {
		boolean galinhaMargemA = true;
		boolean cachorroMargemA = true;
		boolean raposaMargemA = true;
		boolean barcoMargemA = true;
		
		int passo = 0;
		
		System.out.println("═══════════════════════════════════════");
		System.out.println("    PROBLEMA DA TRAVESSIA DO RIO");
		System.out.println("═══════════════════════════════════════");
		
		// Estado inicial
		passo++;
		System.out.println("\nEstado Inicial");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		
		// Passo 1: Levar a raposa para margem B
		passo++;
		raposaMargemA = false;
		barcoMargemA = false;
		System.out.println("\n" + (passo - 1) + ". Leva RAPOSA para margem B");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		if (
						!validarEstado(
										galinhaMargemA,
										cachorroMargemA,
										raposaMargemA,
										barcoMargemA
						)
		) {
			System.out.println("ERRO: Estado inválido!");
			return;
		}
		
		// Passo 2: Voltar sozinho
		passo++;
		barcoMargemA = true;
		System.out.println("\n" + (passo - 1) + ". Volta SOZINHO para margem A");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		
		// Passo 3: Levar o cachorro
		passo++;
		cachorroMargemA = false;
		barcoMargemA = false;
		System.out.println("\n" + (passo - 1) + ". Leva CACHORRO para margem B");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		if (
						!validarEstado(
										galinhaMargemA,
										cachorroMargemA,
										raposaMargemA,
										barcoMargemA
						)
		) {
			System.out.println("ERRO: Estado inválido!");
			return;
		}
		
		// Passo 4: Voltar com a raposa
		passo++;
		raposaMargemA = true;
		barcoMargemA = true;
		System.out.println("\n" + (passo - 1) + ". Volta com RAPOSA para margem A");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		if (
						!validarEstado(
										galinhaMargemA,
										cachorroMargemA,
										raposaMargemA,
										barcoMargemA
						)
		) {
			System.out.println("ERRO: Estado inválido!");
			return;
		}
		
		// Passo 5: Levar a galinha
		passo++;
		galinhaMargemA = false;
		barcoMargemA = false;
		System.out.println("\n" + (passo - 1) + ". Leva GALINHA para margem B");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		if (
						!validarEstado(
										galinhaMargemA,
										cachorroMargemA,
										raposaMargemA,
										barcoMargemA
						)
		) {
			System.out.println("ERRO: Estado inválido!");
			return;
		}
		
		// Passo 6: Voltar sozinho
		passo++;
		barcoMargemA = true;
		System.out.println("\n" + (passo - 1) + ". Volta SOZINHO para margem A");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		
		// Passo 7: Buscar a raposa
		passo++;
		raposaMargemA = false;
		barcoMargemA = false;
		System.out.println("\n" + (passo - 1) + ". Leva RAPOSA para margem B");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		if (
						!validarEstado(
										galinhaMargemA,
										cachorroMargemA,
										raposaMargemA,
										barcoMargemA
						)
		) {
			System.out.println("ERRO: Estado inválido!");
			return;
		}
		
		// Verificar estado final
		if (!galinhaMargemA && !cachorroMargemA && !raposaMargemA) {
			System.out.println("\n✓ SUCESSO! Todos os animais atravessaram!");
		} else {
			System.out.println("\n✗ FALHA! Nem todos os animais atravessaram.");
		}
	}
	
	// Método auxiliar para validar o estado
	static boolean validarEstado(
					boolean galinhaA,
					boolean cachorroA,
					boolean raposaA,
					boolean barcoA
	) {
		// Raposa e cachorro não podem ficar juntos sem o barco
		if (raposaA == cachorroA && raposaA != barcoA) {
			return false;
		}
		// Raposa e galinha não podem ficar juntas sem o barco
		return raposaA != galinhaA || raposaA == barcoA;
	}
	
	// Método auxiliar para mostrar o estado atual
	static void mostrarEstado(
					boolean galinhaA,
					boolean cachorroA,
					boolean raposaA,
					boolean barcoA
	) {
		System.out.print("Margem A: ");
		if (galinhaA) System.out.print("Galinha ");
		if (cachorroA) System.out.print("Cachorro ");
		if (raposaA) System.out.print("Raposa ");
		if (barcoA) System.out.print("[Barco]");
		
		System.out.print("\nMargem B: ");
		if (!galinhaA) System.out.print("Galinha ");
		if (!cachorroA) System.out.print("Cachorro ");
		if (!raposaA) System.out.print("Raposa ");
		if (!barcoA) System.out.print("[Barco]");
		System.out.println();
	}
}
