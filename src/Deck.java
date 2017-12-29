//Sayeed Gulmahamad
//Partner: Usman Jawaid
import java.util.Random;


public class Deck {
	private Card[] _Cards;
	private int _DrawIndex = 0;

	private static final Random _Random = new Random();

	public Deck() {
		initiate();
		shuffle();
	}

	// Initiate deck with every card value from every suit
	private void initiate() {
		_Cards = new Card[Card.NUMBER_OF_SUITS * CardValue.values().length];

		int index = 0;
		for (int i = 0; i < Card.NUMBER_OF_SUITS; ++i) {
			for (CardValue cardValue : CardValue.values()) {
				_Cards[index++] = new Card(cardValue);
			}
		}
	}


	private void shuffle() {
		// Start with two cards
		for (int i = 1; i < _Cards.length; ++i) {
			int index = _Random.nextInt(i + 1);

			if (i != index) {
				Card card = _Cards[i];
				_Cards[i] = _Cards[index];
				_Cards[index] = card;
			}
		}
	}

	// Draw card until all cards are drawn
	public Card draw() {
		Card card = null;
		if (_DrawIndex < _Cards.length)
		{
			card = _Cards[_DrawIndex++];
		}
		return card;
	}
}
