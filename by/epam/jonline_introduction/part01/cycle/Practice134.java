/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

package by.epam.jonline_introduction.part01.cycle;

public class Practice134 {
	public static void main(String[] args) {
		int i = 1;
		long square = 1L;
		long product = 1L;
		long temp;

		while (i <= 200) {
			square = (long) i * (long) i;
			temp = product * square;
			if (temp < product) {
				System.out.println("Error.Long overflow. Max iteration i = " + (i - 1) + " Max value = " + product);
				break;
			} else {
				product = product * square;
			}
			System.out.println("iteration = " + i + " square = " + square + " product = " + product);
			i++;
		}

		if (i == 201) {
			System.out.println("Result = " + product);
		}
	}
}
