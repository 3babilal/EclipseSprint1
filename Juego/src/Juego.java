import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Primer jugador escoge piedra, papel o tijeras :");
		String answerPlayer = sc.nextLine();
		System.out.println("Segundo jugador escoge pierda, papel o tijeras :");
		String answerPlayer2 = sc.nextLine();
		
		
		switch (answerPlayer) {
		case "piedra": {
			if(answerPlayer2.equalsIgnoreCase(answerPlayer)) {
				System.out.println("Empate!");
			}else if (answerPlayer2.equalsIgnoreCase("papel")) {
				System.out.println("Has perdut!");
			}else {
				System.out.println("Has guanyat!");
			}break;
		}
			
		case "papel": {
			if(answerPlayer2.equalsIgnoreCase(answerPlayer)) {
				System.out.println("Empate!");
			}else if (answerPlayer2.equalsIgnoreCase("tijeras")) {
				System.out.println("Has perdut!");
			}else {
				System.out.println("Has guanyat!");
			}break;

		}
		case "tijeras": {
			if(answerPlayer2.equalsIgnoreCase(answerPlayer)) {
				System.out.println("Empate!");
			}else if (answerPlayer2.equalsIgnoreCase("piedra")) {
				System.out.println("Has perdut!");
			}else {
				System.out.println("Has guanyat!");
			}break;

		}

		}
	}

}
