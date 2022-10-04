package exemplo_oo;

public class Game {
	private Player player;
	private Inimigo inimigo;
	
	public Game() {
		player = new Player();
		if(player instanceof Tipo1) {
			
		} else if (player instanceof Player) {
			
		}
//		if (player == null) {
//			System.out.println("O player nao foi iniciado");
//			player = new Player();
//		}
//		if(player instanceof Player) {
//			System.out.println("Player iniciado com sucesso e faz referencia a classe player");
//		}
		inimigo = new Inimigo();
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Inimigo getInimigo() {
		return inimigo;
	}
	
	public static void main (String[] args) {
		Game game = new Game();
		Player player = game.getPlayer();	
		player.atacarInimigo(game.getInimigo());
		System.out.println(game.getInimigo().life);
	}
}
