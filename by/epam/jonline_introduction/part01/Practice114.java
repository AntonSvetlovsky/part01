/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда
 * в дробной и целой частях). Поменять местами дробную и целую
 * части числа и вывести полученное значение числа.
 */

package by.epam.jonline_introduction.part01;

public class Practice114 {
	public static void main(String[] args) {
		double a = 123.456;
		String str = String.valueOf(a);
		String newStr = str.substring(4, 7) + str.charAt(3) + str.substring(0, 3);
		double b = Double.parseDouble(newStr);
		System.out.println(newStr);
		System.out.println(b);
	}
}
