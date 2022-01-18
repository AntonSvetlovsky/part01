/*
 * Для каждого натурального числа в промежутке от m до n вывести
 * все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

package by.epam.jonline_introduction.part01;

import java.util.Scanner;

public class Practice137 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите m,n");
		int m = console.nextInt();
		int n = console.nextInt();
		for (int i = m; i <= n; i++) {
			System.out.println("Для числа " + i + " делителями являются: ");
			int q = 0;
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
