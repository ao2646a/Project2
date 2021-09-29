public class ChessMatch extends ChessPlayer {
	public static void main(String[] args) {
		// Create instance of player1
		ChessPlayer player1a = new ChessPlayer("Amanda", 4, 1200);
		// Create instance of player2
		ChessPlayer player2b = new ChessPlayer("Ari", 3, 1000);
		

		System.out.println("Player 1's Elo Rating before match is: " + player1a.getEloRating());
		System.out.println("Player 2's Elo Rating before match is: " + player2b.getEloRating());

		// Have them play eachother
		player1a.play();
		player1a.elo(player1a.getEloRating(), player2b.getEloRating());

		
	}
}