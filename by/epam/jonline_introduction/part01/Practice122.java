/*
 * Найти max{min(a, b), min(c, d)}.
 */

package by.epam.jonline_introduction.part01;

import java.util.Scanner;

public class Practice122 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите 4 целых числа");
		int a = console.nextInt();
		int b = console.nextInt();
		int c = console.nextInt();
		int d = console.nextInt();
		int min1 = a < b ? a : b;
		int min2 = c < d ? c : d;
		int max = min1 > min2 ? min1 : min2;
		System.out.println("max{min(a,b), min(c,d)} = " + max);
	}
}
