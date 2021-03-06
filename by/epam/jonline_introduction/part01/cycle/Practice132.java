/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = x, x > 2
 * y = -x, x <= 2
 */

package by.epam.jonline_introduction.part01.cycle;

import java.util.Scanner;

public class Practice132 {
	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double x;
		double y;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите отрезок вычисления(a,b)");
		a = console.nextDouble();
		b = console.nextDouble();
		System.out.println("Введите шаг");
		h = console.nextDouble();

		for (double i = a; i <= b; i += h) {
			x = i;
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			System.out.println("x= " + x + " " + "y= " + y);
		}
	}
}
