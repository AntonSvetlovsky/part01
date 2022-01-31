/*
 * Вычислить значение функции:
 * x^2 - 3*x + 9, x <= 3
 * 1/(x^3 + 6), x > 3
 */

package by.epam.jonline_introduction.part01.conditional_statement;

import java.util.Scanner;

public class Practice125 {
	public static void main(String[] args) {
		double x;
		double f;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите x");
		x = console.nextDouble();

		if (x <= 3) {
			f = Math.pow(x, 2) - 3 * x + 9;
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println(f);
	}
}
