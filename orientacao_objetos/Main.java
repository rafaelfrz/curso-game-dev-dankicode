package orientacao_objetos;

public class Main extends TesteAbstract {
	public static void main(String[] args) {
//		System.out.println("Olá! Programa funcionando");
//		Player player = new Player();
//		Inimigo inimigo = new Inimigo();
//		player.iniciarJogador();
//		inimigo.iniciarInimigo();
//		
		new Main().instanceMain2();;
	}
	
	public void chamarMetodoAbstract() {
		 
	}
	
	public void instanceMain2() {
		new Main2().print1();
	}
	
	class Main2 {
		public void print1() {
			System.out.println("Chamando meu método");
		}
	}
	
}
