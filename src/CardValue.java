//Sayeed Gulmahamad
//Partner: Usman Jawaid
public enum CardValue {
	Two(0),
	Three(1),
	Four(2),
	Five(3),
	Six(4),
	Seven(5),
	Eight(6),
	Nine(7),
	Ten(8),
	Jack(9),
	Queen(10),
	King(11),
	Ace(12);

	private final int _Value;

	public int value() {
		return _Value;
	}

	CardValue(int value) {
		_Value = value;
	}
}
