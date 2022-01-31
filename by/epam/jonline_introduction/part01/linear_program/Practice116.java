/*
 * Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (х, у) принадлежит закрашенной области,
 * и false — в противном случае
 */

package by.epam.jonline_introduction.part01.linear_program;

import java.util.Scanner;

public class Practice116 {
	public static void main(String[] args) {
		double x;
		double y;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите координаты точки: x y");
		x = console.nextDouble();
		y = console.nextDouble();
		boolean flag = ((x >= -4 && x <= 4) && (y >= -3 && y <= 0)) || ((x >= -2 && x <= 2) && (y >= 0 && y <= 4));
		System.out.println(flag);
	}
}
