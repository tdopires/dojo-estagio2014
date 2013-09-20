package br.com.dextra.blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BlackJack blackJack = new BlackJack();

		exibirBoasVindas();
		exibirMenu(blackJack);
	}

	private static void exibirMenu(BlackJack blackJack) {
		while (true) {
			char opcao = leOpcaoJogada();

			switch (opcao) {
			case 'c':
				blackJack.sacarCarta();
				break;
			case 'p':
				blackJack.pararDeSacarCartas();
				return;
			case 'e':
				return;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

	private static void exibirBoasVindas() {

		System.out.println("  _________   _________   _________   __________  ");
		System.out.println(" /         \\ /         \\ /         \\ /          \\");
		System.out.println(" |A        | |A        | |A        | |A         |");
		System.out.println(" |    ,    | |   _ _   | |    _    | |          |");
		System.out.println(" |   / \\   | |  / ^ \\  | |   (_)   | |    /\\    |");
		System.out.println(" |  (_ _)  | |  \\   /  | |  (_)_)  | |   <  >   |");
		System.out.println(" |   /_\\   | |   \\ /   | |   /_\\   | |    \\/    |");
		System.out.println(" |         | |    `    | |         | |          |");
		System.out.println(" |        A| |        A| |        A| |         A|");
		System.out.println(" \\_________/ \\_________/ \\_________/ \\__________/");
		System.out.println("=================================================");
		System.out.println("        BLACK JACK - DEXTRA - ESTÁGIO 2014       ");
		System.out.println("=================================================");
		System.out.println();
		System.out.println("Opções (c) sacar carta; (p) parar;");
		System.out.println();
	}

	private static char leOpcaoJogada() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String linha = br.readLine();
			return linha.length() > 0 ? linha.charAt(0) : '\0';
		} catch (IOException e) {
			e.printStackTrace();
			return 1;
		}
	}
}
