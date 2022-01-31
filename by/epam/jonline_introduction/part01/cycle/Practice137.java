/*
 * Для каждого натурального числа в промежутке от m до n вывести
 * все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

package by.epam.jonline_introduction.part01.cycle;

import java.util.Scanner;

public class Practice137 {
	public static void main(String[] args) {
		int m;
		int n;
		int q;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите m,n");
		m = console.nextInt();
		n = console.nextInt();
		for (int i = m; i <= n; i++) {
			System.out.println("Для числа " + i + " делителями являются: ");
			q = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					q++;
					System.out.println(j);
				}
			}
			if (q == 0) {
				System.out.println("Число является простым");
			}
		}
	}
}
