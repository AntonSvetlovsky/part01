/*
 * Вывести на экран соответствий между символами и их численными
 * обозначениями в памяти компьютера.
 */

package by.epam.jonline_introduction.part01;

public class Practice136 {
	public static void main(String[] args) {
		for (int i = 32; i < 127; i++) {
			System.out.print(i + " ");
			char ch = (char) i;
			System.out.println(ch);
		}
	}
}
