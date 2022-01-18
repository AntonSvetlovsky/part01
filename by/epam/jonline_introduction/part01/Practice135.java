/*
 * Даны числовой ряд ([x; y]) и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид:
 * a(n) = 1/2^n + 1/3^n
 */

package by.epam.jonline_introduction.part01;

import java.util.Scanner;

public class Practice135 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите число e");
		double e = console.nextDouble();
		double sum = 0;
		double n = 0;
		double a;
		do {
			a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			sum += a;
			n++;
		} while (Math.abs(a) >= e);
		System.out.println(sum);
	}
}
