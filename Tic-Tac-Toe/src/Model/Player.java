package Model;

public class Player {
String playerName;
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
PlayingPiece piece;
public Player(String playerName,PlayingPiece piece) {
	this.piece=piece;
	this.playerName=playerName;
}
}
