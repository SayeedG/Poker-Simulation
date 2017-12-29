//Sayeed Gulmahamad
//Partner: Usman Jawaid
public class Hand {
	public static final int NUMBER_OF_CARDS = 5;

	private boolean _IsFourOfKind = false;
	private boolean _IsTwoPairs = false;

	public boolean isFourOfKind() {
		return _IsFourOfKind;
	}
	public boolean isTwoPairs() {
		return _IsTwoPairs;
	}

	public Hand() {
		// Generate deck
		Deck deck = new Deck();

		int[] valueOccurrences = new int[CardValue.values().length];
		for (int i = 0; i < valueOccurrences.length; ++i) {
			valueOccurrences[i] = 0;
		}


		for (int i = 0; i < NUMBER_OF_CARDS; ++i) {
			Card card = deck.draw();
			++valueOccurrences[card.value()];
		}


		int pairsCount = 0;
		for (int i = 0; i < valueOccurrences.length; ++i) {

			if (valueOccurrences[i] == 4) {
				_IsFourOfKind = true;
				return;
			} else if (valueOccurrences[i] == 2) {
				++pairsCount;

				if (pairsCount == 2) {
					_IsTwoPairs = true;
					return;
				}
			}
		}
	}
}
