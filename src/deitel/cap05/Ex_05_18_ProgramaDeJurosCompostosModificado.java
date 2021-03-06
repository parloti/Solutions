/*
 * Copyright (C) 2017 Alex
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package deitel.cap05;

/**
 *
 * @author Alex
 */
public class Ex_05_18_ProgramaDeJurosCompostosModificado {

	public static void main(String args[]) {
		int amount;
		int principal = 100000;
		double rate = 0.05;

		System.out.printf("%s%20s%n", "Year", "Amount on deposit");

		for (int year = 1; year <= 10; year++) {
			amount =(int) ( principal * Math.pow(1 + rate, year));
			System.out.printf("%4d%,20d.%02d%n", year, amount/100,amount%100);
		}
	}
}
