package programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		Random rand = new Random();
		System.out.println("Seja bem vindo ao jogo! Insira seu nome");
		nome = in.nextLine();
		System.out.println("Seja muito bem vindo " + nome);
		System.out.println("Qual dire��o voc� deseja seguir? (w, a, s, d)");
		String comando = in.nextLine();
		if(comando.equals("w")) {
			System.out.println("Voc� est� indo para a frente");
			System.out.println("Um inimigo surgiu, o que voc� deseja fazer? \n a = atacar \n c = correr");
			comando = in.nextLine();
			if (comando.equals("a")) {
				if(rand.nextInt(100) < 75) {
					System.out.println("O inimigo foi derrotado");
				} else {
					System.out.println("O inimigo continua de p�");
				}
			}
		}
	}
}