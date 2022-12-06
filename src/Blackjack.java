
public class Blackjack {
	public int parseCard(String cardName) {
		switch (cardName.toLowerCase()) {
		case "ace": 
			return Card.ACE.value; 
		case "two": 
			return Card.TWO.value; 
		case "three":
			return Card.THREE.value; 
		case "four": 
			return Card.FOUR.value; 
		case "five": 
			return Card.FIVE.value; 
		case "six": 
			return Card.SIX.value; 
		case "seven": 
			return Card.SEVEN.value; 
		case "eight": 
			return Card.EIGHT.value; 
		case "nine": 
			return Card.NINE.value; 
		case "ten": 
			return Card.TEN.value; 
		case "jack": 
			return Card.JACK.value; 
		case "queen": 
			return Card.QUEEN.value; 
		case "king": 
			return Card.KING.value; 
		default: 
			return Card.OTHER.value; 
		}	
	}
	
	public boolean isBlackjack(String card1, String card2) {
		//get card values and add together 
		int sum = this.parseCard(card1) + this.parseCard(card2);
		
		//if sum of 2 cards is 21 then have blackjack
		if (sum == 21) {
			return true; 
		} else {
			return false; 
		}
	}
	
	public String largeHand(boolean isBlackjack, int dealerScore) {
		//assuming that if dealerScore can be divided by 11 and remainder is 0, dealer has ace card 
		//assuming that if dealerScore can be divided by 10 and remainder is 0, dealer contains card with the value of 10
		if (isBlackjack == true && (dealerScore % 11 == 0 || dealerScore % 10 == 0)) {
			return StrategyOptions.WIN.shortHandValue; 
		} else {
			return StrategyOptions.STAND.shortHandValue; 
		}
	}
	
	public String smallHand(int handScore, int dealerScore) {
		if (handScore >= 17) {
			return StrategyOptions.STAND.shortHandValue; 
		} else if (handScore <= 11) {
			return StrategyOptions.HIT.shortHandValue; 
		} else if (handScore >= 12 && handScore <= 16 && dealerScore >= 7) {
			return StrategyOptions.HIT.shortHandValue; 
		} else {
			return StrategyOptions.STAND.shortHandValue; 
		}
	}
}
