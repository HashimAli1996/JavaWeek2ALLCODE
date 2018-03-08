
public class GameRunner {
	
	public static void main(String[] args) {
		//run game
		
		GameEnvironment environment = new GameEnvironment();
		
		Player hashim = new Player();
		
		Computer ai = new Computer();
		
		environment.startGame(hashim, ai);
		
	}
	
	
}
