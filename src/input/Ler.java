package input;

import java.util.Scanner;

public class Ler {
	private static Scanner scanner = new Scanner(System.in);

	public static float lerFloat() {
		while (!scanner.hasNextFloat()) {
			System.err.print("Digite um float!");
			scanner.next();
		}

		return scanner.nextFloat();
	}

	public static String linha() {
		return scanner.next();
	}
}
