/*
 * Даны числовой ряд  и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид:
 * a(n) = 1/2^n + 1/3^n
 * 
 */

package by.epam.jonline_introduction.part01.cycle;

import java.util.Scanner;

public class Practice135 {
	public static void main(String[] args) {
		int n;
		double e;
		double a;
		double sum = 0;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите число e");
		e = console.nextDouble();

		n = 0;
		a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n); // a=2
		if (Math.abs(a) < e) {
			System.out.println("sum = " + sum); // sum=0
		} else {
			do {
				sum += a;
				n++;
				a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			} while (Math.abs(a) >= e);
			System.out.println("sum =" + sum);
		}
	}
}
