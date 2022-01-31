/*
 * Даны два числа. Определить цифры, входящие в запись
 * как первого так и второго числа.
 */

package by.epam.jonline_introduction.part01.cycle;

import java.util.Scanner;

public class Practice138 {
	public static void main(String[] args) {
		int x;
		int y;
		int m;
		int k;
		int n;
		int j;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите x, y");
		x = console.nextInt();
		y = console.nextInt();
		m = x;
		String str = "";
		while (m != 0) {
			k = m % 10;
			m = m / 10;
			n = y;
			while (n != 0) {
				j = n % 10;
				n = n / 10;
				if (j == k) {
					str = str + String.valueOf(k);
					break;
				}
			}
		}
		String strS = "";
		for (int i = 0; i < str.length(); i++) {
			int un = 1;
			for (j = 0; j < strS.length(); j++) {
				if (str.charAt(i) == strS.charAt(j)) {
					un = 0;
				}
			}
			if (un == 1) {
				strS = strS + str.charAt(i);
			}
		}
		System.out.println("Цифры входящие в запись как первого так и второго числа");
		for (int i = 0; i < strS.length(); i++) {
			System.out.println(strS.charAt(i));
		}
	}
}
