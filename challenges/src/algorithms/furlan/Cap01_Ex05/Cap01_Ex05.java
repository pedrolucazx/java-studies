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
