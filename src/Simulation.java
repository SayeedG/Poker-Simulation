//Sayeed Gulmahamad
//Partner: Usman Jawaid

public class Simulation {
	private static final int NUMBER_OF_SIMULATIONS = 1000000;

	public static void main(String[] args) {
		System.out.format("Starting Monte Carlo poker simulation for %d games%n", NUMBER_OF_SIMULATIONS);

		// Run the simulation
		int fourOfKindCount = 0;
		int twoPairsCount = 0;
		for (int i = 0; i < NUMBER_OF_SIMULATIONS; ++i) {
			Hand hand = new Hand();
			if (hand.isFourOfKind()) {
				++fourOfKindCount;
			}
			if (hand.isTwoPairs()) {
				++twoPairsCount;
			}
		}

		System.out.println("--------------------------------------------------");
		System.out.println("The Monte Carlo poker simulation finished with the following results:");
		System.out.format("Number of 'four of a kind' hands: %d (%.2f%%)%n", fourOfKindCount, ((float)fourOfKindCount / NUMBER_OF_SIMULATIONS) * 100);
		System.out.format("Number of 'two pairs' hands: %d (%.2f%%)%n", twoPairsCount, ((float)twoPairsCount / NUMBER_OF_SIMULATIONS) * 100);
	}
}
