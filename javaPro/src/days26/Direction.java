package days26;

public enum Direction {

	EAST(100, "→"), SOUTH(200, "↓"), WEST(300, "←"), NORTH(400,"↑");

	// 필드
	private final int value;
	private final String symbol;

	// 생성자
	Direction(int value, String symbol) { 
		this.value = value;
		this.symbol = symbol;
	}

	public int getValue() {
		return this.value;
	}
	public String getSymbol() {
		return this.symbol;
	}

	public String toString() {
		return this.name() + ": " + this.symbol;
	}
	
} 
