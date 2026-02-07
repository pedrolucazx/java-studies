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

		passo++;
		System.out.println("\nEstado Inicial");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);

		passo++;
		raposaMargemA = false;
		barcoMargemA = false;
		System.out.println("\n" + (passo - 1) + ". Leva RAPOSA para margem B");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		if (!validarEstado(
				galinhaMargemA,
				cachorroMargemA,
				raposaMargemA,
				barcoMargemA)) {
			System.out.println("ERRO: Estado inválido!");
			return;
		}

		passo++;
		barcoMargemA = true;
		System.out.println("\n" + (passo - 1) + ". Volta SOZINHO para margem A");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);

		passo++;
		cachorroMargemA = false;
		barcoMargemA = false;
		System.out.println("\n" + (passo - 1) + ". Leva CACHORRO para margem B");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		if (!validarEstado(
				galinhaMargemA,
				cachorroMargemA,
				raposaMargemA,
				barcoMargemA)) {
			System.out.println("ERRO: Estado inválido!");
			return;
		}

		passo++;
		raposaMargemA = true;
		barcoMargemA = true;
		System.out.println("\n" + (passo - 1) + ". Volta com RAPOSA para margem A");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		if (!validarEstado(
				galinhaMargemA,
				cachorroMargemA,
				raposaMargemA,
				barcoMargemA)) {
			System.out.println("ERRO: Estado inválido!");
			return;
		}

		passo++;
		galinhaMargemA = false;
		barcoMargemA = false;
		System.out.println("\n" + (passo - 1) + ". Leva GALINHA para margem B");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		if (!validarEstado(
				galinhaMargemA,
				cachorroMargemA,
				raposaMargemA,
				barcoMargemA)) {
			System.out.println("ERRO: Estado inválido!");
			return;
		}

		passo++;
		barcoMargemA = true;
		System.out.println("\n" + (passo - 1) + ". Volta SOZINHO para margem A");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);

		passo++;
		raposaMargemA = false;
		barcoMargemA = false;
		System.out.println("\n" + (passo - 1) + ". Leva RAPOSA para margem B");
		System.out.println("────────────────────────────────────");
		mostrarEstado(galinhaMargemA, cachorroMargemA, raposaMargemA, barcoMargemA);
		if (!validarEstado(
				galinhaMargemA,
				cachorroMargemA,
				raposaMargemA,
				barcoMargemA)) {
			System.out.println("ERRO: Estado inválido!");
			return;
		}

		if (!galinhaMargemA && !cachorroMargemA && !raposaMargemA) {
			System.out.println("\n✓ SUCESSO! Todos os animais atravessaram!");
		} else {
			System.out.println("\n✗ FALHA! Nem todos os animais atravessaram.");
		}
	}

	static boolean validarEstado(
			boolean galinhaA,
			boolean cachorroA,
			boolean raposaA,
			boolean barcoA) {
		if (raposaA == cachorroA && raposaA != barcoA) {
			return false;
		}
		return raposaA != galinhaA || raposaA == barcoA;
	}

	static void mostrarEstado(
			boolean galinhaA,
			boolean cachorroA,
			boolean raposaA,
			boolean barcoA) {
		System.out.print("Margem A: ");
		if (galinhaA)
			System.out.print("Galinha ");
		if (cachorroA)
			System.out.print("Cachorro ");
		if (raposaA)
			System.out.print("Raposa ");
		if (barcoA)
			System.out.print("[Barco]");

		System.out.print("\nMargem B: ");
		if (!galinhaA)
			System.out.print("Galinha ");
		if (!cachorroA)
			System.out.print("Cachorro ");
		if (!raposaA)
			System.out.print("Raposa ");
		if (!barcoA)
			System.out.print("[Barco]");
		System.out.println();
	}
}
