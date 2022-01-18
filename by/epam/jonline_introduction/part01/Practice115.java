/*
 * Дано натуральное число Т, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах, минутах
 * и секундах в следующей форме: ННч ММмин SSc
 */

package by.epam.jonline_introduction.part01;

import java.util.Scanner;

public class Practice115 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите кол-во секунд");
		int s = console.nextInt();
		int sec = s % 60;
		s = (s - sec) / 60;
		int min = s % 60;
		int h = (s - min) / 60;
		System.out.println(h + "ч " + min + "мин " + sec + 'с');
	}
}
