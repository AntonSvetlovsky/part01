/*
 * Вывести на экран соответствий между символами и их численными
 * обозначениями в памяти компьютера.
 */

package by.epam.jonline_introduction.part01.cycle;

public class Practice136 {
	public static void main(String[] args) {
		char ch;

		for (int i = 32; i < 127; i++) {
			System.out.print(i + " ");
			ch = (char) i;
			System.out.println(ch);
		}
	}
}
