package model;
import java.io.Serializable;


public class BestPlayers implements Serializable{
	
	private char symbol;
	private static final long serialVersionUID = 1L;
	private long score;
	private String name;
	private String otherPlayers;
	private BestPlayers next;
	private BestPlayers previous;
	private int row;
	private int col;
	private int snakes;
	private int ladders;
	private int players;

		
	public BestPlayers(String name, int row, int col, int snakes, int ladders, int players, long score, char symbol, String otherPlayers) {
		this.name = name;
		this.row = row;
		this.col = col;
		this.snakes = snakes;
		this.ladders = ladders;
		this.players = players;
		this.score = score;
		this.symbol = symbol;
		this.otherPlayers = otherPlayers;
	}
		
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public long getScore() {
		return score;
	}
	
	
	public void setScore(long score) {
		this.score = score;
	}
	
	
	public char getSymbol() {
		return symbol;
	}
	
	
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	
	public BestPlayers getNext() {
		return next;
	}
	
	
	public void setNext(BestPlayers next) {
		this.next = next;
	}
	
	
	public BestPlayers getPrevious() {
		return previous;
	}
	
	
	public void setPrevious(BestPlayers previous) {
		this.previous = previous;
	}
	
	
	public int getRow() {
		return row;
	}
	
	
	public int getCol() {
		return col;
	}
	
	
	public int getSnakes() {
		return snakes;
	}
	
	
	public int getLadders() {
		return ladders;
	}

	
	public int getPlayers() {
		return players;
	}

	
	public String getOtherPlayers() {
		return otherPlayers;
	}
	
	
	public String toString() {
		String message = "";
		
		message = "Nick: "+name+" | Ficha: "+symbol+" | Puntaje: "+score+"\n";
		
		return message;
	}
}
