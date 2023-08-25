import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;

		System.out.println("Insira o valor para A: ");
		a = scan.nextInt();

		System.out.println("Insira o valor para B: ");
		b = scan.nextInt();

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 1:");
		if (a > 10) {
			System.out.println("A > 10");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Numero nao valido");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 2:");

		if (a < 10) {
			System.out.println("A < 10");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		}
		if (a > 10 && a + b != 20)
			System.out.println("Numero nao valido");

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 3:");
		if (a == 10) {
			System.out.println("A == 10");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		}
		if (b == 10) {
			System.out.println("B == 10");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 4:");
		if (a > 10 || a + b == 20) {
			System.out.println("Numero valido");
		} else if (a == b) {
			System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
		} else {
			System.out.println("Numero nao valido");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 5:");
		if (a > 10 || a + b == 20) {
			System.out.println("Numero valido");
		} else {
			System.out.println("Numero nao valido");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 6:");
		if (a > 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("A <= 10");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("A + B != 20");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 7:");
		if (a > 10) {
			if (a + b == 20) {
				System.out.println("Numeros validos");
			}
		} else {
			System.out.println("Numero nao valido");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 8:");
		if (a < 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("Numero nao valido");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Numero nao valido");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 9:");
		if (a > 10 && a + b == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Numero nao valido");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 10:");
		if (a > 10) {
			System.out.println("Numero menor que 10");
		}
		if (a + b != 20) {
			System.out.println("Numero diferente de 20");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 11:");
		if (a < 10) {
			if (a + b == 20) {
				System.out.println("A + B == 20");
			}
			if (a < 10 && a + b != 20) {
				System.out.println("Numero nao valido");
			}

		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 12:");
		if (a > 10) {
			System.out.println("A > 10");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		}
		if (a < 10 && a + b != 20)
			System.out.println("Numeros nao validos");

		System.out.println("Sejam bem-vindos disciplina de Tecnicas de Programacao.");

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 13:");

		if (a > 10) {
			System.out.println("A > 10");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		}
		if (a < 10 && a + b != 20) {
			System.out.println("Numeros nao validos");
		}
		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 14:");
		if (a > 10) {
			System.out.println("A > 10");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Numero invalido");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 15:");
		if (a < 10) {
			System.out.println("A < 10");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		}
		if (a > 10 && a + b == 20) {
			System.out.println("Numeros nao validos");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 16:");
		if (a == 10) {
			System.out.println("A == 10");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		}
		if (b == 10) {
			System.out.println("B == 10");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 17:");
		if (a > 10 || (a + b) == 20) {
			System.out.println("Numero valido");
		} else if (a == b) {
			System.out.println("A e igual B");
		} else if (a != 10 && b != 10 && a < 10) {
			System.out.println("A e menor que 10");
		} else {
			System.out.println("Numero nao valido");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 18:");
		if (a > 10 || a + b == 20) {
			System.out.println("Numero valido");
		} else {
			System.out.println("Numero invalido");
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 19:");
		if (a > 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("A <= 10");
		}
		if (a + b == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("A + B != 20");
		}
		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Questao 20:");
		if (a > 10 || a + b == 20) {
			System.out.println("Numero valido");
		} else {
			System.out.println("Numero invalido");
		}

		System.out.println("Sejam bem-vindos disciplina de Tecnicas de Programacao.");

	}

}
