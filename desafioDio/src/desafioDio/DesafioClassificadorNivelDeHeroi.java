package desafioDio;

import java.util.Scanner;

public class DesafioClassificadorNivelDeHeroi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do herói: ");
		String nome = sc.nextLine();
		System.out.print("Informe a quantidade de XP do herói: ");
		double xp = sc.nextDouble();
		
		
		String nivel = null;
		if (xp < 1000) {
			nivel = ("Ferro");
		} else if (xp >= 1001 && xp <= 2000) {
			nivel = ("Bronze");
		} else if (xp >= 2001 && xp <= 6000) {
			nivel = ("Prata");
		} else if (xp >= 6001 && xp <= 7000) {
			nivel = ("Ouro");
		} else if (xp >= 7001 && xp <= 8000) {
			nivel = ("Platina");
		} else if (xp >= 8001 && xp <= 9000) {
			nivel = ("Ascedente");
		} else if (xp >= 9001 && xp <= 10000) {
			nivel = ("Imortal");
		} else if (xp >= 10001) {
			nivel = ("Radiante");
		}
		
		System.out.println("O herói " + nome + ", está no nível: " + nivel);
		
		sc.close();
	}
}
