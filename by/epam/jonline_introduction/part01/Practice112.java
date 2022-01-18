/*
 * Вычислить значение выражения по формуле
 * ((𝑏 + √(𝑏^2 + 4*𝑎*𝑐)) / 2*𝑎) - 𝑎^3*𝑐 + 𝑏^(−2)
 * (все переменные принимают действительные значения)
 */

package by.epam.jonline_introduction.part01;

import java.util.Scanner;

public class Practice112 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите a:");
		double a = console.nextDouble();
		System.out.println("Введите b:");
		double b = console.nextDouble();
		System.out.println("Введите c:");
		double c = console.nextDouble();
		double z = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println("z = " + z);
	}

}
