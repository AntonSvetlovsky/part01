/*
 * Найти max{min(a, b), min(c, d)}.
 */

package by.epam.jonline_introduction.part01.conditional_statement;

import java.util.Scanner;

public class Practice122 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int min1;
		int min2;
		int max;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите 4 целых числа");
		a = console.nextInt();
		b = console.nextInt();
		c = console.nextInt();
		d = console.nextInt();
		min1 = a < b ? a : b;
		min2 = c < d ? c : d;
		max = min1 > min2 ? min1 : min2;
		System.out.println("max{min(" + a + "," + b + "), min(" + c + "," + d + ")} = " + max);
	}
}
