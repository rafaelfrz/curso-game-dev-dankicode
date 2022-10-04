package inicio_logica_games;

public class Game implements Runnable{
	private boolean isRunning = true;
	private Thread thread;
	
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
	
	public synchronized void start () {
		thread = new Thread(this);
		thread.start();
	}
	
	public void tick() {
		//Atualizar o jogo
	}
	
	public void render() {
		//Renderizar o jogo
	}

	@Override
	public void run'() {
		while(isRunning) {
			tick();
			render();
//			try {
//				Thread.sleep(1000/60);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}
