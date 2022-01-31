/*
 * Найти сумму квадратов первых ста чисел.
 */

package by.epam.jonline_introduction.part01.cycle;

public class Practice133 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		System.out.println("Сумма квадратов первых ста чисел = " + sum);
	}
}
