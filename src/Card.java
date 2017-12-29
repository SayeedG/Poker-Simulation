//Sayeed Gulmahamad
//Partner: Usman Jawaid
public class Card {
	public static final int NUMBER_OF_SUITS = 4;

	private final CardValue _CardValue;

	public int value() {
		return _CardValue.value();
	}

	public Card(CardValue cardValue) {
		_CardValue = cardValue;
	}
}
