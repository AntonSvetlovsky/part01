/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

package by.epam.jonline_introduction.part01;

import java.util.Scanner;

public class Practice131 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите любое целое положительное число");
		int x = console.nextInt();
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		System.out.println("Сумма чисел = " + sum);
	}
}
