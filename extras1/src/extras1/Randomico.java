package extras1;

import java.util.Random;
import java.util.Scanner;

public class Randomico {
	public static void main(String[] args) {
		int asw, guess = -2, ntry = 0, maxtry = 10, state, oldstate = 9;
		String modo;
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		asw = rand.nextInt(100);
		System.out.println(
				"----------------------Bem vindo, esse algoritmo é um jogo de advinhação!----------------------\nO computador te dará dicas de quente ou frio dependendo de quão próximo você esá da resposta.\n--------------------------------Para encerrar o jogo digite -1--------------------------------\nEscolha um modo de jogo: Single-Player, Multi-Player");
		modo = input.nextLine();
		if (modo.equalsIgnoreCase("single-player") || modo.equalsIgnoreCase("s") || modo.equalsIgnoreCase("single")) {
			do {
				ntry = ntry + 1;
				System.out.println("Tente advinhar: ");
				guess = input.nextInt();
				if (ntry == maxtry) {
					break;
				} else {
					if (guess == -1) {
						System.out.println("Obrigado por jogar.");
						break;
					}
					if (guess > asw - 2 && guess < asw + 2 && guess != asw) {
						state = 1;
						if (oldstate < state) {
							System.out.println("Esfriou!");
							oldstate = state;
						} else if (oldstate >= state) {
							System.out.println("Pelando!");
							oldstate = state;
						}
					} else if (guess > asw - 5 && guess < asw + 5 && guess != asw) {
						state = 2;
						if (oldstate < state) {
							System.out.println("Esfriou!");
							oldstate = state;
						} else if (oldstate >= state) {
							System.out.println("Muito quente!");
							oldstate = state;
						}
					} else if (guess > asw - 10 && guess < asw + 10 && guess != asw) {
						state = 3;
						if (oldstate < state) {
							System.out.println("Esfriou!");
							oldstate = state;
						} else if (oldstate >= state) {
							System.out.println("Quente!");
							oldstate = state;
						}
					} else if (guess > asw - 20 && guess < asw + 20 && guess != asw) {
						state = 4;
						if (oldstate < state) {
							System.out.println("Esfriou!");
							oldstate = state;
						} else if (oldstate >= state) {
							System.out.println("Morno!");
							oldstate = state;
						}
					} else if (guess > asw - 30 && guess < asw + 30 && guess != asw) {
						state = 5;
						if (oldstate < state) {
							System.out.println("Esfriou!");
							oldstate = state;
						} else if (oldstate >= state) {
							System.out.println("Frio!");
							oldstate = state;
						}
					} else if (guess > asw - 40 && guess < asw + 40 && guess != asw) {
						state = 6;
						if (oldstate < state) {
							System.out.println("Esfriou!");
							oldstate = state;
						} else if (oldstate >= state) {
							System.out.println("Muito Frio!");
							oldstate = state;
						}
					} else if (guess > asw - 50 && guess < asw + 50 && guess != asw) {
						state = 7;
						if (oldstate < state) {
							System.out.println("Esfriou!");
							oldstate = state;
						} else if (oldstate >= state) {
							System.out.println("Congelando!");
							oldstate = state;
						}
					} else if (guess != asw) {
						state = 8;
						if (oldstate < state) {
							System.out.println("Esfriou!");
							oldstate = state;
						} else if (oldstate >= state) {
							System.out.println("Zero absoluto!");
							oldstate = state;
						}
					}
				}
			} while (asw != guess);
			if (asw == guess) {
				System.out.println("Parabéns! Você acertou em " + ntry + " tentativas!");
			} else {
				System.out.println("Que pena! Você teve " + ntry + " tentativas!");
			}
		} else if (modo.equalsIgnoreCase("multi-player") || modo.equalsIgnoreCase("m")
				|| modo.equalsIgnoreCase("multi")) {
			int p1 = 0, p2 = 0, ntry1 = 0, ntry2 = 0;
			boolean bp1 = true, bp2 = true;
			do {
				if (bp1) {
					System.out.println("Player 1 tente advinhar: ");
					p1 = input.nextInt();
					ntry1 = ntry1 + 1;
					if (p1 == -1) {
						bp1 = !bp1;
					}
				}
				if (bp2) {
					System.out.println("Player 2 tente advinhar: ");
					p2 = input.nextInt();
					ntry2 = ntry2 + 1;
					if (p2 == -1) {
						bp2 = !bp2;
					}
				}
				if (ntry1 == maxtry || ntry2 == maxtry) {
					break;
				}
			} while (asw != guess);
			if (asw == guess) {
				System.out.println("Parabéns! Player 1 acertou em " + ntry1 + " tentativas!");
			} else {
				System.out.println("Que pena! Player 1 teve " + ntry1 + " tentativas!");
			}
			System.out.println("Player 2:");
			do {
				ntry2 = ntry2 + 1;
				System.out.println("Tente advinhar: ");
				guess = input.nextInt();
				if (ntry2 == maxtry) {
					break;
				} else {
					if (guess == -1) {
						System.out.println("Obrigado por jogar.");
						break;
					} else if (guess > asw - 2 && guess < asw + 2 && guess != asw) {
						System.out.println("Pelando!");
					} else if (guess > asw - 5 && guess < asw + 5 && guess != asw) {
						System.out.println("Muito Quente!");
					} else if (guess > asw - 10 && guess < asw + 10 && guess != asw) {
						System.out.println("Quente!");
					} else if (guess > asw - 20 && guess < asw + 20 && guess != asw) {
						System.out.println("Morno!");
					} else if (guess > asw - 30 && guess < asw + 30 && guess != asw) {
						System.out.println("Frio!");
					} else if (guess > asw - 40 && guess < asw + 40 && guess != asw) {
						System.out.println("Muito Frio!");
					} else if (guess > asw - 50 && guess < asw + 50 && guess != asw) {
						System.out.println("Congelando!");
					} else if (guess != asw) {
						System.out.println("Zero absoluto!");
					}
				}
			} while (asw != guess);
			if (asw == guess) {
				System.out.println("Parabéns! Player 2 acertou em " + ntry2 + " tentativas!");
			} else {
				System.out.println("Que pena! Player 2 teve " + ntry2 + " tentativas!");
			}
		} else {
			System.out.println("Opção Invalida! Reinicie a aplicação.");
		}
		input.close();
	}
}
