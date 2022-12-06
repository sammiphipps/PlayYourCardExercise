
public enum Card {
	ACE("ace", 11), 
	TWO("two", 2), 
	THREE("three", 3), 
	FOUR ("four", 4), 
	FIVE("five", 5), 
	SIX("six", 6), 
	SEVEN("seven", 7), 
	EIGHT("eight", 8), 
	NINE("nine", 9), 
	TEN("ten", 10), 
	JACK("jack", 10), 
	QUEEN("queen", 10), 
	KING("king", 10), 
	OTHER("other", 0); 
	
	public final String name; 
	public final int value; 
	
	private Card(String name, int value) {
		this.name = name; 
		this.value = value; 
	}
}
