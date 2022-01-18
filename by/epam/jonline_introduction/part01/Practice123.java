/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 * Определить, будут ли они расположены на одной прямой.
 */

package by.epam.jonline_introduction.part01;

import java.util.Scanner;

public class Practice123 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите 3 точки : А(x1,y1)");
		double x1 = console.nextDouble();
		double y1 = console.nextDouble();
		System.out.println("B(x2,y2)");
		double x2 = console.nextDouble();
		double y2 = console.nextDouble();
		System.out.println("C(x3,y3)");
		double x3 = console.nextDouble();
		double y3 = console.nextDouble();
		if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)) {
			System.out.println("3 точки лежат на одной прямой");
		} else if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("3 точки лежат на одной прямой");
		} else {
			System.out.println("Точки не лежат на одной прямой");
		}
	}
}
