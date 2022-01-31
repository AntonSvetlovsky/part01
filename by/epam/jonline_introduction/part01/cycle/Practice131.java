/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

package by.epam.jonline_introduction.part01.cycle;

import java.util.Scanner;

public class Practice131 {
	public static void main(String[] args) {
		long x;
		long i = 1;
		long sum;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите любое целое положительное число");
		x = console.nextLong();
		sum = 0;

		while (i <= x) {
			sum += i;
			if (sum < 0) {
				System.out.println("Переполнение: i=" + i + "  sum=" + sum);
				break;
			}
			i++;
		}
		System.out.println("Сумма чисел = " + sum);
	}
}
