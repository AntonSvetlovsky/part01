/*
 * Найдите  значение функции: z = ((a – 3 ) * b / 2) + c
 */
package by.epam.jonline_introduction.part01.linear_program;

import java.util.Scanner;

public class Practice111 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите a:");
		a = console.nextDouble();
		System.out.println("Введите b:");
		b = console.nextDouble();
		System.out.println("Введите c:");
		c = console.nextDouble();
		z = ((a - 3) * b / 2) + c;
		System.out.println("z = " + z);
	}
}
