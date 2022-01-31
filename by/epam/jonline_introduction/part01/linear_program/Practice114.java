/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда
 * в дробной и целой частях). Поменять местами дробную и целую
 * части числа и вывести полученное значение числа.
 */

package by.epam.jonline_introduction.part01.linear_program;

public class Practice114 {
	public static void main(String[] args) {
		double a;
		double b;

		a = 123.456;

		b = a * 1000 % 1000 + (int) a / 1000.0;
		System.out.println(b);
	}
}
