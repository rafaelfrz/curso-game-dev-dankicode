package exemplo_oo;

public class Player {
	private int life = 100;
	
	public void atacarInimigo(Inimigo inimigo) {
		inimigo.life--;
	}
}
