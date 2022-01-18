/*
 * Найдите  значение функции: z = ((a – 3 ) * b / 2) + c
 */
package by.epam.jonline_introduction.part01;

import java.util.Scanner;

public class Practice111 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите a:");
		double a = console.nextDouble();
		System.out.println("Введите b:");
		double b = console.nextDouble();
		System.out.println("Введите c:");
		double c = console.nextDouble();
		double z = ((a - 3) * b / 2) + c;
		System.out.println("z = " + z);
	}
}
