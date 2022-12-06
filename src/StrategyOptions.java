
public enum StrategyOptions {
	STAND("S"), 
	HIT("H"), 
	SPLIT("P"), 
	WIN("W"); 
	
	public final String shortHandValue; 
	
	private StrategyOptions(String shortHandValue) {
		this.shortHandValue = shortHandValue; 
	}
}
