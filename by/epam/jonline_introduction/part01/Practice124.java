/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

package by.epam.jonline_introduction.part01;

import java.util.Scanner;

public class Practice124 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите размер отверстия А, В");
		int a = console.nextInt();
		int b = console.nextInt();
		System.out.println("Введите размеры кирпича x, y, z");
		int x = console.nextInt();
		int y = console.nextInt();
		int z = console.nextInt();
		if ((x <= a && z <= b) || (x <= b && z <= a)) {
			System.out.println("Кирпич влезет в отверстие");
		} else if ((x <= a && y <= b) || (x <= b && y <= a)) {
			System.out.println("Кирпич влезет в отверстие");
		} else if ((y <= a && z <= b) || (y <= b && z <= a)) {
			System.out.println("Кирпич влезет в отверстие");
		} else {
			System.out.println("Кирпич не влезет в отверстие");
		}
	}
}
