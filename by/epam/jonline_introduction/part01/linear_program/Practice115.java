/*
 * Дано натуральное число Т, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах, минутах
 * и секундах в следующей форме: ННч ММмин SSc
 */

package by.epam.jonline_introduction.part01.linear_program;

import java.util.Scanner;

public class Practice115 {
	public static void main(String[] args) {
		int s;
		int sec;
		int min;
		int h;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите кол-во секунд");
		s = console.nextInt();
		sec = s % 60;
		s = (s - sec) / 60;
		min = s % 60;
		h = (s - min) / 60;
		System.out.println(h + "ч " + min + "мин " + sec + 'с');
	}
}
