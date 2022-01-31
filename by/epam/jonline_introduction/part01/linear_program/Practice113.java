/*
 * Вычислить значение выражения по формуле:
 * (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦) / (𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦) * 𝑡𝑔 𝑥𝑦
 * (все переменные принимают действительные значения)
 */

package by.epam.jonline_introduction.part01.linear_program;

import java.util.Scanner;

public class Practice113 {
	public static void main(String[] args) {
		double x;
		double y;
		double z;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите x (рад.):");
		x = console.nextDouble();
		System.out.println("Введите y (рад.)");
		y = console.nextDouble();
		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println("z = " + z);
	}
}
