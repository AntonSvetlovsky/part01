/*
 * Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным.
 */

package by.epam.jonline_introduction.part01.conditional_statement;

import java.util.Scanner;

public class Practice121 {
	public static void main(String[] args) {
		int a;
		int b;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите 2 угла в градусах");
		a = console.nextInt();
		b = console.nextInt();
		if (a + b < 180) {
			System.out.println("Треугольник существует");
			if ((a + b == 90) || (a == 90) || (b == 90)) {
				System.out.println("Треугольник является прямоугольным");
			} else {
				System.out.println("Треугольник не является прямоугольным");
			}
		} else {
			System.out.println("Треугольник не существует");
		}
	}
}
