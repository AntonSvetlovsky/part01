/*
 * Вычислить значение выражения по формуле
 * ((𝑏 + √(𝑏^2 + 4*𝑎*𝑐)) / 2*𝑎) - 𝑎^3*𝑐 + 𝑏^(−2)
 * (все переменные принимают действительные значения)
 */

package by.epam.jonline_introduction.part01.linear_program;

import java.util.Scanner;

public class Practice112 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;
		double underSqrt;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите a:");
		a = console.nextDouble();
		System.out.println("Введите b:");
		b = console.nextDouble();
		System.out.println("Введите c:");
		c = console.nextDouble();

		underSqrt = b * b + 4 * a * c;
		if (underSqrt < 0) {
			System.out.println("Внимание! Под  квадратным корнем отрицательное число!");

		} else if (a == 0 & b < 0) {
			System.out.println("Внимание! Деление  0 на 0!");
		} else if (a == 0 | b == 0) {
			System.out.println("Внимание! Деление на 0!");
		} else {
			z = (b + Math.sqrt(underSqrt)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			System.out.println("z = " + z);
		}

	}
}
